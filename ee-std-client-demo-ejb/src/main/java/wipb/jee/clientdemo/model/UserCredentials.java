/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wipb.jee.clientdemo.model;

import java.util.LinkedList;
import java.util.List;
import javax.persistence.*;


@NamedQueries(
        {@NamedQuery(name = "UserCredentials.findByUsernameAndPassword", query = "select uc from UserCredentials uc where uc.username=:un and uc.password=:pw")}
)
@Entity
public class UserCredentials {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    @OneToMany(mappedBy = "userCredentials", cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
    private List<UserGroup> userGroups =  new LinkedList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void add(UserGroup userGroup) {
        userGroup.setUserCredentials(this);
        this.userGroups.add(userGroup);
    }
    
    public List<UserGroup> getUserGroups() {
        return userGroups;
    }
             
    
}