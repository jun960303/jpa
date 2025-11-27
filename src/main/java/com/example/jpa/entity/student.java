package com.example.jpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class student {

  @Id
  private Long id;

  private String name;

}
