package com.example.demo.entity;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Character {
    private Integer ID;
    private String NAME;
    private String WEAPON;
    private String PLAYABLE;
    private String RARITY;  
    private String ATTRIBUTE;
    private String COUNTRY;

}
