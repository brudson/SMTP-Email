# SMTP-Email
example code for setting up an smtp email service

This reporsitory contains a generic foundation for a Java 8 based email serivce using a SMTP server.

It will cover setting up properties for a gmail SMTP server as well as the required dependencies like javax.mail, crafting a pojo for your service and finally constructing and sending the email.

Postman Download: https://www.getpostman.com/

Postman Steps:
1. Once you have launched Postman
2. Change the type from GET to a POST
3. Type into the params bar: localhost:8080/emailGenerator
4. Directly below the params bar click the "raw" radio button
5. To the right, change the type from Text to JSON
6. Then Paste the below JSON into the "raw" text field (send the email to yourself)
7. Hit the blue send button and check your email (should take 5 to 10 seconds to finish)

example POJO to use in Postman:

{
    "recipientAddresses":["someone@something.com", "someoneElse@somethingElse.com],
    "subject": "Testing The Service",
    "body": "If youre reading this, it worked!"
}


