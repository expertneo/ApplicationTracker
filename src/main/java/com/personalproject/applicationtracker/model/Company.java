package com.personalproject.applicationtracker.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Company {
  @javax.persistence.Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  Integer companyID;

  String name;
}
