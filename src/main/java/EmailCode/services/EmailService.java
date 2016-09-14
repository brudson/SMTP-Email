package EmailCode.services;

import EmailCode.pojos.NotificationPOJO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

/**
 * This service sets up an SMTP connection using your google account to send emails.
 *
 * Feel free to email me if you have any questions or errors.
 *
 * @author Bradley Larsen <blarsen@catalystdevworks.com> on 9/9/2016.
 * @version 1.0
 * @since 1.0
 */
@Service
public class EmailService {

    private static final Logger LOGGER = LoggerFactory.getLogger(EmailService.class);

    public void sendEmail(final NotificationPOJO notificationPOJO) throws MessagingException{


        /**
         * !!!IMPORTANT!!!
         *
         * Change the username and email to your personal gmail.
         * This will allow you to use googles smtp server
         */
        final String username = "gmail account";
        final String password = "gmail password";

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");


        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });

        Message message = new MimeMessage(session);
        Transport transport = session.getTransport();

        transport.connect();

        for(String address : notificationPOJO.getRecipientAddresses()){

            try {
                message.setSubject(notificationPOJO.getSubject());
                message.setText(notificationPOJO.getBody());

                transport.sendMessage(message, InternetAddress.parse(address));

                LOGGER.info("Finished sending the email to: " + address);

            } catch (MessagingException e) {
                LOGGER.info("email exception", e);
            }

        }
        transport.close();

    }

}
