package org.example;

import java.awt.*;
import java.util.*;
import java.util.List;

public abstract class Phone implements Event {
    List<String> list = new ArrayList<>();
    List<String> listOfphoneNumbers = new ArrayList<>();
    List<String> messages = new ArrayList<>();
    List<String> callHisory = new ArrayList<>();
    Map<Integer, List<String>> contacts = new LinkedHashMap();
    private String manufacturer;
    private final int batteryLife;
    private Color color;
    private String material;
    private String IMEI;
    private String model;

    protected Phone(String model, String manufacturer, int batteryLife, Color color, String material, String imei) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.batteryLife = batteryLife;
        this.color = color;
        this.material = material;
        IMEI = imei;
    }


    @Override
    public void addContact(int val, String phoneNumber, String firstName, String lastName) {


        contacts.put(val, List.of(phoneNumber, firstName, lastName));
        listOfphoneNumbers.add(phoneNumber);

    }


    @Override
    public void getContact(int contact) {
        System.out.println(contacts.get(contact));
    }


    @Override
    public String sendMessage(String phoneNumber, String messageSent) {
        String message = "";

        for (int i = 0; i < contacts.size(); i++) {
            if (phoneNumber == listOfphoneNumbers.get(i)) {

                message = messageSent;
                messages.add(message);
                break;
            } else {
                System.out.println("Incorrect Number");
            }
        }


        return message;

    }

    @Override
    public void getFirstMessage(String phoneNumber) {
        for (int i = 0; i < contacts.size(); i++) {
            if (phoneNumber == listOfphoneNumbers.get(i)) {
                System.out.println(messages.get(0));

                break;
            } else {
                System.out.println("Incorrect PhoneNumber");
            }
        }
    }

    @Override
    public void getSecondMessage(String phoneNumber) {
        for (int i = 0; i < contacts.size(); i++) {
            if (phoneNumber == listOfphoneNumbers.get(i)) {
                System.out.println(messages.get(1));
                break;
            } else {
                System.out.println("Incorrect PhoneNumber");
            }
        }
    }

    @Override
    public void call(String phoneNumber) {
        for (int i = 0; i < contacts.size(); i++) {
            if (phoneNumber == listOfphoneNumbers.get(i)) {
                callHisory.add(listOfphoneNumbers.get(i));
                System.out.println("Calling: " + contacts.values().toArray()[i]);
                break;
            }
        }
    }

    @Override
    public void viewhistory() {
        System.out.println(callHisory);
    }
}
