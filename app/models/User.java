package models;

import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
public class User extends Model {
    @Id
    @Column(name = "user_id")
    private Long id;

    private String firstname;
    private String lastname;
    private String gender;
    private String email;
    private String password;


    @Transient
    public List<String> groupsholder;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Projekt> groupList;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    List<Task> taskList;

    public List<Task> getTaskList() {
        return taskList;
    }

    public void setTaskList(List<Task> taskList) {
        this.taskList = taskList;
    }

    public User() {

    }

    @Override
    public String toString() {
        return String.format("%s %s (%s)", this.getFirstname(), this.getLastname(), this.getEmail());
    }

    public static Finder<Long, User> find = new Finder<Long, User>(User.class);

    public String userVorNachname() {
        return String.format("%s %s", this.getFirstname(), this.getLastname());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Projekt> getGroupList() {
        return groupList;
    }

    public void setGroupList(List<Projekt> groupList) {
        this.groupList = groupList;
    }

    public List<String> getGroupsholder() {
        return groupsholder;
    }

    public void setGroupsholder(List<String> groupsholder) {
        this.groupsholder = groupsholder;
    }

    public String getDurationOfAllRelatedTasks() {
        int duration = 0;
        for (Task task : this.getTaskList())
            duration += task.getDuration();

        return String.format("%d:%02d", duration/60, duration%60);
    }

    public String getDurationOfTasksRelatedToOneProjekt(Projekt projekt){
        int duration = 0;

        for(Task task : projekt.getTaskList()){
            if(task.getUser() == this){
                duration += task.getDuration();
            }
        }
        return String.format("%d:%02d", duration/60, duration%60);
    }

    public int getAmountOfTasksRelatedToOneProjekt(Projekt projekt){
        int amount = 0;

        for(Task task : projekt.getTaskList()){
            if(task.getUser() == this){
                amount++;
            }
        }
        return amount;
    }
}
