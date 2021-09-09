package com.simbirsoft.christmastoysstore.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    Long id;

    String user;

    String password;
}
