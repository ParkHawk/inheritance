package com.company;

public class TextNotification extends Notification{

    private String recipient;
    private String smsProvider;

    public TextNotification(String subject, String body, String recipient, String smsProvider) {
        super(subject, body);
        this.recipient = recipient;
        this.smsProvider = smsProvider;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getSmsProvider() {
        return smsProvider;
    }

    @Override
    public void transport() throws NoTransportException {
        System.out.printf(
                "subject: %s\n" +
                "body: %s\n" +
                "recipient: %s\n" +
                "smsProvider: %s\n",
                getSubject(), getBody(), getRecipient(), getSmsProvider()
        );
    }
}
