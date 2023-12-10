package com.codedifferently.artparty;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GuestTest {

    @Test
    public void testConstructorWithNoParameters() {
        Guest guest = new Guest();
        String expected = "FirstName:; LastName:; Email:; PhoneNumber:; ReasonForVisit:";
        String actual = guest.toString();
        assertEquals(expected, actual);

    }
    @Test
    public void testConstructorWithParameters(){
        //given

        String firstName = "John";
        String lastName = "Doe";
        String email = "john.doe@email.com";
        String phoneNumber = "555-555-5555";
        String reasonForVisit = "Asata";
        //when
        Guest guest = new Guest(firstName, lastName, email, phoneNumber, reasonForVisit);
        //then
        assertEquals(firstName, guest.getFirstName());
        assertEquals(lastName, guest.getLastName());
        assertEquals(email, guest.getEmail());
        assertEquals(phoneNumber, guest.getPhoneNumber());
        assertEquals(reasonForVisit, guest.getReasonForVisit());

    }



}
