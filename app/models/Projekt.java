package models;

import com.avaje.ebean.Model;

import javax.persistence.*;
import java.util.List;


@Entity
public class Projekt extends Model {

    @Id
    @Column(name="group_id")
    private Long id;

    private String projektName;

    @ManyToMany(mappedBy = "groupList", cascade = CascadeType.ALL)
    private List<User> userList;

    @ManyToOne
    private Customer customer;

    public Projekt() {
    }

    public Projekt(String name) {
        this.projektName = name;
    }

    public static Finder<Long, Projekt> find = new Finder<Long, Projekt>(Projekt.class);


    @Override
    public String toString() {
        return this.getProjektName();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProjektName() {
        return projektName;
    }

    public void setProjektName(String projektName) {
        this.projektName = projektName;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
