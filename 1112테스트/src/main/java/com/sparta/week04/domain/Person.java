package com.sparta.week04.domain;

import com.sparta.week04.dto.PersonRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Person {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    @Column(nullable = false)
    private String name;






    public Person(PersonRequestDto requestDto) {
        this.name = requestDto.getName();

    }

    public void update(PersonRequestDto requestDto) {
        this.name = requestDto.getName();

    }
}