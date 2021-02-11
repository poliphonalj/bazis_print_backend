package BazisPrint.BazisPrint_Backend.Models;

import javax.persistence.*;
import java.util.List;

@Entity
public class AccessRole {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    private String name;

    @ManyToMany
    private List<User> usersInThisRole;

    public AccessRole() {
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getUsersInThisRole() {
        return usersInThisRole;
    }

    public void setUsersInThisRole(List<User> usersInThisRole) {
        this.usersInThisRole = usersInThisRole;
    }
}
