package model;

public class ModelTask {
    
    private int ID_Task;
    private String Name_Task;
    private String Tags_Task;
    private String Created_Task;
    private String End_Task;
    private int user_tb_ID_UserFk;

    public int getID_Task() {
        return ID_Task;
    }

    public void setID_Task(int ID_Task) {
        this.ID_Task = ID_Task;
    }

    public String getName_Task() {
        return Name_Task;
    }

    public void setName_Task(String Name_Task) {
        this.Name_Task = Name_Task;
    }

    public String getTags_Task() {
        return Tags_Task;
    }

    public void setTags_Task(String Tags_Task) {
        this.Tags_Task = Tags_Task;
    }

    public String getCreated_Task() {
        return Created_Task;
    }

    public void setCreated_Task(String Created_Task) {
        this.Created_Task = Created_Task;
    }

    public String getEnd_Task() {
        return End_Task;
    }

    public void setEnd_Task(String End_Task) {
        this.End_Task = End_Task;
    }

    public int getUser_tb_ID_UserFk() {
        return user_tb_ID_UserFk;
    }

    public void setUser_tb_ID_UserFk(int user_tb_ID_UserFk) {
        this.user_tb_ID_UserFk = user_tb_ID_UserFk;
    }
    
    
}
