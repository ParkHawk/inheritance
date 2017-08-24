package com.company;

public class Main {

    public static void main(String[] args) {

        EmailNotification emailNotification = new EmailNotification("Hello", "Hello Everybody", "Alex Oviedo", "gmail");
        TextNotification textNotification = new TextNotification("Goodbye", "Goodbye Everybody", "Parker Hawkins", "verizon");

        EmailNotification newnew = (EmailNotification) emailNotification.clone();

        emailNotification.printStatus();
        emailNotification.transport();
        emailNotification.random();


        textNotification.transport();
        textNotification.random();

        System.out.println(newnew);

    }
}
