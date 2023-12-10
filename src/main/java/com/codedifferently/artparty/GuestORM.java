package com.codedifferently.artparty;

import java.sql.*;

//FIRST
//object relation mapper
//CRUD
public class GuestORM {
    private Connection connection;

    public GuestORM(Connection connection) {this.connection = connection;}

    public Boolean createGuest(Guest guest) {
        try {
            PreparedStatement ps = connection.prepareStatement("INSERT INTO Guest (first_name, last_name, email, phone_number, reason_for_visit) VALUES (?, ?, ?, ?, ?)");
            ps.setString(1, guest.getFirstName());
            ps.setString(2, guest.getLastName());
            ps.setString(3, guest.getEmail());
            ps.setString(4, guest.getPhoneNumber());
            ps.setString(5, guest.getReasonForVisit());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
    // Read (Select)
    public Guest readGuest(long id) {
        try {
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM Guest WHERE id = ?");
            ps.setLong(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Guest guest = new Guest(
                        rs.getString("first_name"),
                        rs.getString("last_name"),
                        rs.getString("email"),
                        rs.getString("phone_number"),
                        rs.getString("reason_for_visit"));
                guest.setId(id);
                return guest;
            }
        } catch (SQLException e) {
            // Handle exception
        }
        return null;
    }

    // Update
    public Boolean updateGuest(Guest guest) {
        try {
            PreparedStatement ps = connection.prepareStatement("UPDATE Guest SET first_name = ?, last_name = ?, phone_number = ?, email = ?, reason_for_visit = ? WHERE id = ?");
            ps.setString(1, guest.getFirstName());
            ps.setString(2, guest.getLastName());
            ps.setString(3, guest.getPhoneNumber());
            ps.setString(4, guest.getEmail());
            ps.setString(5, guest.getReasonForVisit());
            ps.setLong(6, guest.getId());
            System.out.println("This is the guest id " + guest.getId());
            ps.executeUpdate();
            return true;

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("SQLException: " + e.getMessage());
            System.out.println("SQLState: " + e.getSQLState());
            System.out.println("VendorError: " + e.getErrorCode());
            return false;// Handle exception
        }
    }

    // Delete
    public Boolean deleteGuest(long id) {
        try {
            PreparedStatement ps = connection.prepareStatement("DELETE FROM Guest WHERE id = ?");
            ps.setLong(1, id);
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

}