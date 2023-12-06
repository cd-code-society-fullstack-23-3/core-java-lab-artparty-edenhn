package com.codedifferently.artparty;

import java.sql.*;

//FIRST
//object relation mapper
//CRUD
public class GuestORM {
    private Connection conn;
    public Guest create(Guest guest){
        Boolean connected = createConnection();
        if(!connected){
            return null;
        }
        try {
            String sql = "INSERT INTO GuestBook.Guest (first_name, last_name, email, phone_number, reason_for_visit) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            // Set parameter values
            preparedStatement.setString(1, guest.getFirstName());
            preparedStatement.setString(2, guest.getLastName());
            preparedStatement.setString(3, guest.getEmail());
            preparedStatement.setString(4, guest.getPhoneNumber());
            preparedStatement.setString(5, guest.getReasonForVisit());

            int rowsAffected = preparedStatement.executeUpdate();

            System.out.println(rowsAffected + " row(s) affected.");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;

    }

    private Boolean createConnection() {
        String url = "jdbc:mysql://localhost:3306/GuestBook";
        String user = "root";
        String password = "my-secret-pw";
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the database");
            return true;
        } catch (SQLException e) {
            System.out.println("Failed to make connection");
            return false;
        }
    }
}
