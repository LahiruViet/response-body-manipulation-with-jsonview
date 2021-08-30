package com.example.demo.model;

import com.example.demo.view.View;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @JsonView(View.Base.class)
    private String username;

    @JsonView(View.Base.class)
    private String email;

    private String password;

}
