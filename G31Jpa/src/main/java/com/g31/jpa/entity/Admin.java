package com.g31.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Ldesaextremo
 */
@Entity
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)        
    private Long idAdmin;
    @Column(nullable = false, length = 45)
    private String email;
    @Column(nullable = false, length = 45)
    private String password;
    @Column(nullable = false, length = 250)
    private String name;
    @Column(nullable = false)
    private Long age;

    /**
     * @return the idAdmin
     */
    public Long getIdAdmin() {
        return idAdmin;
    }

    /**
     * @param idAdmin the idAdmin to set
     */
    public void setIdAdmin(Long idAdmin) {
        this.idAdmin = idAdmin;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public Long getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(Long age) {
        this.age = age;
    }
    
}
