package org.example;

public class Main {
    public static void main(String[] args) {
        Phone phoneSamsung = new SamsungS6();
        Phone phoneIphone = new Iphone();


        phoneSamsung.addContact(1, "075327584", "Anghel", "Alin");
        phoneSamsung.addContact(2, "074327743", "Liviu", "Frana");
        phoneSamsung.addContact(3, "042388433", "Bogdan", "Bine");



        phoneSamsung.call("0743277432");
        phoneSamsung.viewhistory();







    }
}
