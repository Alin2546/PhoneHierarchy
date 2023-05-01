package org.example;

public interface Event {


    void addContact(int val, String phoneNumber, String firstName, String lastName);

    void getContact(int contact);

    String sendMessage(String phoneNumber, String messageSent);
    void getFirstMessage(String phoneNumber);
    void getSecondMessage(String phoneNumber);
    void call(String phoneNumber);
    void viewhistory();
}
