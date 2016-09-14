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
 * Created by blarsen on 9/13/2016.
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
