package com.personalproject.applicationtracker.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Applicant {
  @javax.persistence.Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  Integer applicantId;

  String sureName;
  String firstName;
  int age;
  String email;

}
