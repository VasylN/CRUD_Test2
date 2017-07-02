package dao;

import model.User;
import util.Db_util;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by Pc on 02.07.2017.
 */
public class UserDao {
    private static Connection connection;

    public UserDao() {
        connection = Db_util.getConnection();
    }

    public void addUsers(User user) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("INSERT into users1 (firsname, lastname, dob, email) VALUES (?,?,?,?)");
            preparedStatement.setString(1, user.getFirstName());
            preparedStatement.setString(2, user.getLastName());
            preparedStatement.setDate(3, new Date(user.getDob().getTime()));
            preparedStatement.setString(4, user.getEmail());
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void deleteUser(int userID){
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM users1 WHERE userId = ?");
            preparedStatement.setInt(1,userID);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}

