package com.example.poketmon.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="poketmon")
@Table(name="poketmon")
public class PoketEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int poketmonNumber;

  private String name;
  private String type;
  private String specificity;
  private String characters;
  private String things;
  private int individualHP;
  private int individualAttack;
  private int individualDefence;
  private int individualSpecialAttack;
  private int individualSpecialDefence;
  private int individualSpeed;
  private int effortHP;
  private int effortAttack;
  private int effortDefence;
  private int effortSpecialAttack;
  private int effortSpecialDefence; 
  private int effortSpeed;
  private int technologyOne;
  private int technologyTwo;
  private int technologyThree;
  private int technologyFour;
}
