package com.company;

import java.time.LocalDateTime;

public abstract class Notification {
    private LocalDateTime createdAt;
    private String subject;
    private String body;
    protected String status;

    public Notification(String subject, String body) {
        createdAt = LocalDateTime.now();
        this.subject = subject;
        status = "Normal";
        this.body = body;

    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public String getSubject() {
        return subject;
    }

    public void setBody(String body) {
        this.body = body;
  }

     public String getBody() {
        return body;
    }
    public abstract void transport();
    public void showStatus() {
      System.out.println("status: " + status);
    }

}



