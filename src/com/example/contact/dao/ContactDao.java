package com.example.contact.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.example.contact.model.Contact;
import com.example.registration.model.User;



public class ContactDao {

    public int addContact(Contact contact) throws ClassNotFoundException {
        String INSERT_USERS_SQL = "INSERT INTO contact" +
            "  (contact_id, user_id, first_name, last_name, dob) VALUES " +
            " (?, ?, ?, ?, ?);";

        int result = 0;

        Class.forName("com.mysql.cj.jdbc.Driver");

        try (Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3306/test?useSSL=false", "root", "Mymysql@1234");

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
            preparedStatement.setInt(1, contact.getContact_id());
            preparedStatement.setInt(2, contact.getUser_id());
            preparedStatement.setString(3, contact.getFirst_name());
            preparedStatement.setString(4, contact.getLast_name());
            preparedStatement.setDate(5, contact.getDob());
            
            
            

            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            result = preparedStatement.executeUpdate();

        } catch (SQLException e) {
            
            printSQLException(e);
        }
        return result;
    }

    private void printSQLException(SQLException ex) {
        for (Throwable e: ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
}