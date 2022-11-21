package dao;
import connection.ConnectionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.ModelTask;
import model.ModelUser;

public class DaoTask {

    ConnectionDB connectionDB = new ConnectionDB();
    Connection daoTaskConn = connectionDB.connection();

    public int returnIdUser(ModelUser modelUser) {
        
        int idUser = 0;
        String sql = "SELECT * FROM usertb WHERE Name_User = '" + modelUser.getName_User() + "'";
        try {
            PreparedStatement stmt = daoTaskConn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
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

    public int returnIdTask(ModelTask modelTask) {
        
        int idTask = 0;
        String sql = "SELECT * FROM tasktb WHERE Name_Task = '" + modelTask.getName_Task() + "'";
        try {
            PreparedStatement stmt = daoTaskConn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = stmt.executeQuery();
            stmt.execute();
            if (rs.next()) {
                idTask = rs.getInt(1);
            }
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

        return idTask;
    }

    private boolean Taskexists(ModelTask modelTask) {
        
        boolean validation = false;
        String sql = "SELECT * FROM tasktb WHERE Name_Task = ? and user_tb_ID_User = ?";
        try {
            PreparedStatement stmt = daoTaskConn.prepareStatement(sql);
            stmt.setString(1, modelTask.getName_Task());
            stmt.setInt(2, modelTask.getUser_tb_ID_UserFk());
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "The task is already registered in the database");
            } else {
                validation = true;
            }
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

        return validation;
    }

    public boolean insertTask(ModelTask modelTask) {
        
        boolean validate = false;
        String sql = "INSERT INTO tasktb(Name_Task, Tags_Task, CreatedDate, EndDate, user_tb_ID_User) VALUES(?, ?, ?, ?, ?)";
        try {
            if(Taskexists(modelTask)){
            PreparedStatement stmt = daoTaskConn.prepareStatement(sql);
            stmt.setString(1, modelTask.getName_Task());
            stmt.setString(2, modelTask.getTags_Task());
            stmt.setString(3, modelTask.getCreated_Task());
            stmt.setString(4, modelTask.getEnd_Task());
            stmt.setInt(5, modelTask.getUser_tb_ID_UserFk());
            stmt.execute();
            validate = true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

        return validate;
    }

    public boolean returnTask(ModelTask modelTask) {
        
        boolean existTask = false;
        String sql = "SELECT * FROM tasktb WHERE Name_Task = '" + modelTask.getName_Task() + "'"
                + "and user_tb_ID_User = '" + modelTask.getUser_tb_ID_UserFk() + "'";

        try {
            PreparedStatement stmt = daoTaskConn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            stmt.execute();
            if (rs.next()) {
                existTask = true;
            }
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        return existTask;
    }

    public void deleteTask(ModelTask modelTask) {
        
        String sql = "DELETE FROM tasktb WHERE Name_Task = ? AND user_tb_ID_User = ?";
        try {
            if (returnTask(modelTask)) {
                PreparedStatement stmt = daoTaskConn.prepareStatement(sql);
                stmt.setString(1, modelTask.getName_Task());
                stmt.setInt(2, modelTask.getUser_tb_ID_UserFk());
                stmt.execute();
            }
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public List<ModelTask> listTask(ModelTask modelTask) {
        
        try {
            List<ModelTask> task = new ArrayList<>();
            String sql = "SELECT * FROM tasktb WHERE user_tb_ID_User = '" + modelTask.getUser_tb_ID_UserFk() + "'";
            PreparedStatement stmt = daoTaskConn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                ModelTask modelTask1 = new ModelTask();
                modelTask1.setID_Task(rs.getInt("ID_Task"));
                modelTask1.setName_Task(rs.getString("Name_Task"));
                modelTask1.setTags_Task(rs.getString("Tags_Task"));
                modelTask1.setCreated_Task(rs.getString("CreatedDate"));
                modelTask1.setEnd_Task(rs.getString("EndDate"));
                modelTask1.setUser_tb_ID_UserFk(rs.getInt("user_tb_ID_User"));
                task.add(modelTask1);
            }
            
            return task;
            
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

        return null;
    }

    public void updateTask(ModelTask modelTask) {
        
        String sql = "update tasktb set Name_Task = ?, CreatedDate = ?, EndDate = ? WHERE ID_Task = ?";
        try {

            PreparedStatement stmt = daoTaskConn.prepareStatement(sql);
            stmt.setString(1, modelTask.getName_Task());
            stmt.setString(2, modelTask.getCreated_Task());
            stmt.setString(3, modelTask.getEnd_Task());
            stmt.setInt(4, modelTask.getID_Task());
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Task updated successfully");

        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
}
