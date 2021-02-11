package BazisPrint.BazisPrint_Backend.Models;

import javax.management.relation.Role;
import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    private String firstName;
    private String lastName;
    private LocalDate birthDay;

    @ManyToMany(mappedBy = "usersInThisRole")
    private List<AccessRole> userRoles;

    public User(String firstName, String lastName, LocalDate birthDay, List<AccessRole> userRoles) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.userRoles = userRoles;
    }

    public User() {

    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}
