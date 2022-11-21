package connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConnectionDB {
    
    public Connection connection(){
        
        Connection connection = null;
      
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/skynotes_tb", "root", "");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        return connection;
    }
}
