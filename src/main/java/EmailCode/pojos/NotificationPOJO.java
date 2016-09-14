package EmailCode.pojos;

/**
 * This class will hold all the necessary data to send an email.
 *
 * Including: Email subject line, email body, and an array of recipients email addresses.
 *
 * @author Bradley Larsen <blarsen@catalystdevworks.com> on 9/9/2016.
 * @version 1.0
 * @since 1.0
 */
public class NotificationPOJO {

    private String[] recipientAddresses;
    private String subject;
    private String body;

    public NotificationPOJO(){};

    public NotificationPOJO(String[] recipientAddresses, String subject, String body) {
        this.recipientAddresses = recipientAddresses;
        this.subject = subject;
        this.body = body;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String[] getRecipientAddresses() {
        return recipientAddresses;
    }

    public void setRecipientAddresses(String[] recipientsAddress) {
        this.recipientAddresses = recipientsAddress;
    }
}
