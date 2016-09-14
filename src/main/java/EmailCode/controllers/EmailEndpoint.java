package EmailCode.controllers;

import EmailCode.services.EmailService;
import EmailCode.pojos.NotificationPOJO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.mail.MessagingException;

/**
 * A rest endpoint to use your emailService. Using a program like Postman, you
 * can make a POST request to this endpoint to kick off your emails. An example
 * JSON can be found in the ReadMe.
 *
 * @author Bradley Larsen <blarsen@catalystdevworks.com> on 9/9/2016.
 * @version 1.0
 * @since 1.0
 */
@Controller
public class EmailEndpoint {

    @Autowired
    private EmailService emailService;

    @ResponseBody
    @RequestMapping(value = "/emailGenerator", method = RequestMethod.POST)
    public void notification(@RequestBody NotificationPOJO notificationPOJO) throws MessagingException{

        emailService.sendEmail(notificationPOJO);

    }
}
