package com.example.Server.Models;



import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Size(min=4, max=20, message="Minimum username length is 4 characters")
    @Column(unique = true,nullable = false)
    private String username;

    @Size(min=5,message= "Minimum password length is 5 characters")
    private String password;

    @Column(unique = true,nullable = false)
    private String email;

    @ElementCollection(fetch = FetchType.EAGER)
    List<Role> roles;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Role> getRoles(){
        return roles;
    }

    public void setRoles(List<Role> roles){
        this.roles=roles;
    }
}
