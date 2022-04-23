package com.leozeballos.regsys.email;

public interface EmailSender {
    void send(String to, String subject);
}
