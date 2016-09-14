package EmailCode.pojos;

/**
 * Created by blarsen on 9/9/2016.
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
