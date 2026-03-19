package ma.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotBlank(message = "Name is important")
    private String name;

    @NotBlank(message = "Email is important")
    private String email;

    // Constructeur
    public User() {

        super();
    }

    // Getters & Setters
    public long getId() {

        return id;
    }

    public void setId(long id) {

        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }
}