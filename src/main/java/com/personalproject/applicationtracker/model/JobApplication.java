package com.personalproject.applicationtracker.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class JobApplication {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  Integer jobApplicationId;

  String status;
  Date dateSubmitted;
  String comment;
  Date expiryDate;
}
