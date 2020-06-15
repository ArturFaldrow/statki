package com.faldrow.model;

import lombok.Data;


import javax.persistence.*;
import java.util.List;
import java.util.Set;

/**
 * Created by Artur on 15.06.2020.
 */

    @Entity
    @Data
    @Table(name = "elements")
    public class Element {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String name;
        private String height;
        private String mass;
        private String hair_color;
        private String skin_color;
        private String eye_color;
        private String birth_year;
        private String gender;


        private String homeworld;

        @Column
        @ElementCollection(targetClass=String.class)
        private List<String> starships;



}
