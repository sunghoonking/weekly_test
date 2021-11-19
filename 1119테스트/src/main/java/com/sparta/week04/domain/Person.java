package com.sparta.week04.domain;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.sparta.week04.dto.PersonRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
@Setter
@Getter
@NoArgsConstructor
@Entity

public class Person {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String title;

    public Person(String name, String title) {
        this.name = name;
        this.title = title;
    }


    public Person(PersonRequestDto requestDto) {
        this.name = requestDto.getName();
        this.title = requestDto.getTitle();

    }

    public void update(PersonRequestDto requestDto) {
        this.name = requestDto.getName();
        this.title = requestDto.getTitle();

    }
}