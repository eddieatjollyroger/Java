package org.academiadecodigo.bootcamp.service;

import org.academiadecodigo.bootcamp.connection.ConnectionManager;
import org.academiadecodigo.bootcamp.model.User;

import java.sql.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JdbcUserService implements UserService {

    private Connection dbConnection;

    private Map<String, User> users = new HashMap<>();
    User user;

    public JdbcUserService() {
        ConnectionManager connectionManager = new ConnectionManager();
        dbConnection = connectionManager.getConnection(); }

    @Override
    public boolean authenticate(String username, String password) {
        try {
        String query = "SELECT * FROM table WHERE id=? AND name=?";
        PreparedStatement statement = dbConnection.prepareStatement(query);

        // set values for the placeholders
        statement.setString(1, username);
        statement.setString(2, password);



            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()){
                return true;
            }
            return false;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return false;
    }

    @Override
    public void add(User user) {
//        if (!users.containsKey(user.getUsername())) {
//            users.put(user.getUsername(), user);
//        }

        String query = "INSERT INTO user (username, password, email, firstname, lastname, phone) VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement statement = null;
        try {
            statement = dbConnection.prepareStatement(query);

            statement.setString(1, user.getUsername());
            statement.setString(2, user.getPassword());
            statement.setString(3, user.getEmail());
            statement.setString(4, user.getFirstName());
            statement.setString(5, user.getLastName());
            statement.setString(6, user.getPhone());

            System.out.println(statement);
            // execute the query
            //ResultSet resultSet = statement.executeQuery();
            statement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public User findByName(String username) {

        // ... connection and statements....
        try {

            String query = "SELECT * FROM user WHERE username=?";
            PreparedStatement statement = dbConnection.prepareStatement(query);
            statement.setString(1,username);
            System.out.println(statement);
            // execute the query
            ResultSet resultSet = statement.executeQuery();


            // user exists
            if (resultSet.next()) {

                String usernameValue = resultSet.getString("username");
                String passwordValue = resultSet.getString("password");
                String emailValue = resultSet.getString("email");
                String firstName = resultSet.getString("firstname");
                String lastName = resultSet.getString("lastname");
                String phoneNumber = resultSet.getString("phone");


                return new User(usernameValue, emailValue, passwordValue,  firstName, lastName, phoneNumber);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }
    @Override
    public List<User> findAll() {
            Statement statement = null;

            try {
                statement = dbConnection.createStatement();

            // execute the query

            String query = "SELECT * FROM user";

            ResultSet resultSet = null;

                resultSet = statement.executeQuery(query);



                while (resultSet.next()) {

                    String usernameValue = resultSet.getString("username");
                    String passwordValue = resultSet.getString("password");
                    String emailValue = resultSet.getString("email");
                    String firstName = resultSet.getString("firstname");
                    String lastName = resultSet.getString("lastname");
                    String phoneNumber = resultSet.getString("phone");


                    user = new User(usernameValue, emailValue, passwordValue,  firstName, lastName, phoneNumber);
                    users.put(user.getUsername(), user);
                    System.out.println(user);
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
           return users.values().stream().collect((Collectors.toList()));
        }

    @Override
    public int count() {

        int result = 0;

        // create a new statement
        Statement statement = null;
        try {
            statement = dbConnection.createStatement();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        // create a query
        String query = "SELECT COUNT(*) FROM user";

        // execute the query
        ResultSet resultSet = null;
        try {
            resultSet = statement.executeQuery(query);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        // get the results
        try {
            if (resultSet.next()) {
                result = resultSet.getInt(1);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return result;
    }
}