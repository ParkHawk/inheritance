package com.company;

import java.time.LocalDateTime;

public class Notification {

    private LocalDateTime createdAt;

    private String subject;

    private String body;

    protected String status = "Run";

    public Notification(String subject, String body) {
        this.subject = subject;
        this.body = body;
        createdAt = LocalDateTime.now();

    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }

    public void printStatus(){
        System.out.println(status);
        this.status = status;
    }

    protected void random(){
        System.out.println("Random");
    }

    public void transport() throws NoTransportException{
    }
}
