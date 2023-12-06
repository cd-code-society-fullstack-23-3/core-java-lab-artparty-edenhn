package com.codedifferently.artparty;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GuestTest {

    @Test
    public void testConstructorWithNoParameters() {
        Guest guest = new Guest();
        String expected = "Id: null; FirstName:; LastName:; Email:; PhoneNumber:; ReasonForVisit:";
        String actual = guest.toString();
        assertEquals(expected, actual);

    }
    @Test
    public void testConstructorWithThreeParameters(){
        //given
        String firstName = "John";
        String lastName = "Doe";
        String email = "john.doe@email.com";
        //when
        Guest guest = new Guest(firstName, lastName, email);
        //then
        assertEquals(firstName, guest.getFirstName());
        assertEquals(lastName, guest.getLastName());
        assertEquals(email, guest.getEmail());
    }



}
