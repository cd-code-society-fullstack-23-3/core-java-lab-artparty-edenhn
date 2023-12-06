package com.codedifferently.artparty;

public class Main {

    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";
        String email = "john.doe@email.com";

        Guest guest = new Guest(firstName, lastName, email);
        GuestORM guestORM = new GuestORM();
        guestORM.create(guest);
    }

}
