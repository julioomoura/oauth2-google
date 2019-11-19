package com.julio.oauth2google.models;

import javax.persistence.*;

@Table(name = "users")
@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String name;
    @Column
    private String email;
}
