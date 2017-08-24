package com.company;

public class Main {

    public static void main(String[] args) {
        EmailNotification emailNotification = new EmailNotification( "simba","member that movie the Lion King?","James","google");
        emailNotification.transport();
        emailNotification.showStatus();

        Object emailClone = emailNotification.clone();

        if (emailNotification.equals(emailClone)) {
          System.out.println("it's alive!");
        } else {
          System.out.println("we failed!");
        }


        TextNotification textNotification = new TextNotification("lions","let me tell you about some lions","James","tmobile");
        textNotification.transport();
        textNotification.showStatus();
    }
}
