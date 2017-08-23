package com.company;

public class Main {

    public static void main(String[] args) {
        EmailNotification emailNotification = new EmailNotification( "simba","LionKing","James","google");
        TextNotification textNotification = new TextNotification("lions","mufasa","James","tmobile");
        textNotification.transport();
        emailNotification.transport();
    }
}
