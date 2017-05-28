package models;

import com.avaje.ebean.Model;

import javax.persistence.*;

/**
 * Created by paulaengelberg on 28.05.17.
 */

@Entity
public class Task extends Model {

    @Id
    private Long id;

    private String taskName;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Transient
    private String tempUser;

    public static Model.Finder<Long, Task> find = new Model.Finder<Long, Task>(Task.class);

    public Task() {
    }

    public Task(String taskName) {
        this.taskName = taskName;
    }

    public Task(Long id, String taskName) {
        this.id = id;
        this.taskName = taskName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getTempUser() {
        return tempUser;
    }

    public void setTempUser(String tempUser) {
        this.tempUser = tempUser;
    }

    @Override
    public String toString() {
        return String.format("%s %s", this.getTaskName(), this.getUser());

    }
}