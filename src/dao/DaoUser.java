package dao;
import connection.ConnectionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import model.ModelUser;

public class DaoUser {

    ConnectionDB connectionDB = new ConnectionDB();
    Connection connectioUserDAO = connectionDB.connection();

    private boolean emailValidation(ModelUser modelUser) {
        
        boolean emailValidation = false;
        try {
            if (modelUser.getEmail_User().endsWith("@gmail.com")) {
                emailValidation = true;
            }
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        return emailValidation;
        
    }

    private boolean passwordValidation(ModelUser modelUser) {
        
        boolean passwordValidation = false;
        try {
            if (modelUser.getPassword_User().length() == 8) {
                passwordValidation = true;
            }
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        return passwordValidation;
        
    }

    private boolean userValidation(ModelUser modelUser) {
        
        boolean userValidation = false;
        String sql = "SELECT * FROM usertb WHERE Name_User = ?";
        try {
            PreparedStatement stmt = connectioUserDAO.prepareStatement(sql);
            stmt.setString(1, modelUser.getName_User());
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                userValidation = true;
                JOptionPane.showMessageDialog(null, "User is already registered");
            }
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

        return userValidation;
        
    }

    public boolean insertUser(ModelUser modelUser) {
        
        boolean insert = false;
        String sql = "INSERT INTO usertb(Name_User, Email_User, Password_User) Values(?, ?, ?)";
        try {
            if (!userValidation(modelUser)) {
                if (emailValidation(modelUser) && passwordValidation(modelUser)) {
                    PreparedStatement stmt = connectioUserDAO.prepareStatement(sql);
                    stmt.setString(1, modelUser.getName_User());
                    stmt.setString(2, modelUser.getEmail_User());
                    stmt.setString(3, modelUser.getPassword_User());
                    stmt.execute();
                    insert = true;
                } else {
                    JOptionPane.showMessageDialog(null, "Wrong password or e-mail (Use @gmail.com)");
                }
            }
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

        return insert;
        
    }

    public boolean validateLogin(ModelUser modelUser) {
        
        boolean validate = false;
        String sql = "SELECT * FROM usertb WHERE Email_User = ? AND Password_User = ?";
        try {
            PreparedStatement stmt = connectioUserDAO.prepareStatement(sql);
            stmt.setString(1, modelUser.getEmail_User());
            stmt.setString(2, modelUser.getPassword_User());
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                validate = true;
            }
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

        return validate;
        
    }

    public int returnIdUser(ModelUser modelUser) {
        
        int idUser = 0;
        String sql = "SELECT * FROM usertb WHERE Name_User = '" + modelUser.getName_User() + "'";
        try {
            PreparedStatement stmt = connectioUserDAO.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = stmt.executeQuery();
            stmt.execute();

            if (rs.next()) {
                idUser = rs.getInt(1);
            }
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        return idUser;
        
    }

}
