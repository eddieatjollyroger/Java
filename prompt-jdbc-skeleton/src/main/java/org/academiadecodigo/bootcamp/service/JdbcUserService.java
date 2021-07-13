package org.academiadecodigo.bootcamp.service;

import org.academiadecodigo.bootcamp.connection.ConnectionManager;
import org.academiadecodigo.bootcamp.model.User;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
        return false;
    }

    @Override
    public void add(User user) {
        if (!users.containsKey(user.getUsername())) {
            users.put(user.getUsername(), user);
        }
    }

    @Override
    public User findByName(String username) {
        Statement statement = null;
        // ... connection and statements....
        try {
             statement = dbConnection.createStatement();

            String query = "SELECT * FROM user WHERE username="+ "'"+username+"'";
            // execute the query
            ResultSet resultSet = statement.executeQuery(query);

            // user exists
            if (resultSet.next()) {

                String usernameValue = resultSet.getString("username");
                String passwordValue = resultSet.getString("password");
                String emailValue = resultSet.getString("email");
                String firstName = resultSet.getString("firstname");
                String lastName = resultSet.getString("lastname");
                String phoneNumber = resultSet.getString("phone");


                user = new User(usernameValue, emailValue, passwordValue,  firstName, lastName, phoneNumber);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return user;
    }
    @Override
    public List<User> findAll() {
            Statement statement = null;

            try {
                statement = statement = dbConnection.createStatement();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            // execute the query

            String query = "SELECT * FROM user";

            ResultSet resultSet = null;
            try {
                resultSet = statement.executeQuery(query);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

            // user exists
            try {
                if (resultSet.next()) {

                    String usernameValue = resultSet.getString("username");
                    String passwordValue = resultSet.getString("password");
                    String emailValue = resultSet.getString("email");
                    String firstName = resultSet.getString("firstname");
                    String lastName = resultSet.getString("lastname");
                    String phoneNumber = resultSet.getString("phone");


                    user = new User(usernameValue, emailValue, passwordValue,  firstName, lastName, phoneNumber);
                    add(user);
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