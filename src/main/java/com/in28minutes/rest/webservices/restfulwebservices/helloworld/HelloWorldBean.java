package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

import com.fasterxml.jackson.annotation.JsonInclude;

public class HelloWorldBean {
    private String message;
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private String newMessage;


    public HelloWorldBean(String message) {
        this.message = message;
    }

    public HelloWorldBean(String message, String newMessage) {
        this.message = message;
        this.newMessage = newMessage;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }

    @Override
    public String toString()
    {
        return String.format("HelloWorldBean [message=%s]",message);
    }

    public String getNewMessage() {
        return newMessage;
    }

    public void setNewMessage(String newMessage) {
        this.newMessage = newMessage;
    }
}
