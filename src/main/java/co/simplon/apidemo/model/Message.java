package co.simplon.apidemo.model;

import java.time.LocalDateTime;

public class Message {

    private String message;
    private final LocalDateTime date;

    public Message() {
        this.date = LocalDateTime.now();
    }

    public Message(String message) {
        this.message = message;
        this.date = LocalDateTime.now();
    }

    public String getMessage() {
        return message;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Message{" +
                "message='" + message + '\'' +
                ", date=" + date +
                '}';
    }
}
