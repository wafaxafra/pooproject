package controller;

import model.User;
import model.UserDAO;
import java.io.IOException;
import java.sql.SQLException;

public class UserController {
    private UserDAO userDAO;

    public UserController() {
        this.userDAO = new UserDAO();
    }

    public void addUser(User user) throws SQLException, IOException {
        userDAO.addUser(user);
    }

    public User getUserByUsername(String username) throws SQLException, IOException {
        return userDAO.getUserByUsername(username);
    }
}
