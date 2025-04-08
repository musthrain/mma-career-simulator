package com.mmacareer.model;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "fighters")
public class Fighter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    private int age;
    private double weight;
    private String weightClass;
    private int wins;
    private int losses;
    private int draws;
    private int knockouts;
    private int submissions;
    
    // Dövüşçü özellikleri
    private int stamina;
    private int strength;
    private int technique;
    private int speed;
    
    // Kariyer bilgileri
    private double money;
    private String currentOrganization;
    private int popularity;
    private String status; // ACTIVE, INJURED, RETIRED
    
    // Antrenman durumu
    private int energy;
    private int condition;
    private LocalDateTime lastTrainingDate;
    
    // Sözleşme bilgileri
    private boolean underContract;
    private LocalDateTime contractEndDate;
    private double contractValue;
}
