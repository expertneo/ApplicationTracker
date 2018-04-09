package com.personalproject.applicationtracker.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Applicant {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  Integer applicantID;

  String sureName;
  String firstName;
  int age;
  String email;

}
