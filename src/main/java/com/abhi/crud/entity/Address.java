package com.abhi.crud.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Setter
@Getter
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long aid;
   private String streetNo;
   private String city;
   private String state;
   private String country;
}
