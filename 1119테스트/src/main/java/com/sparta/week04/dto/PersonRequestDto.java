package com.sparta.week04.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Getter;
import lombok.Setter;
@JsonAutoDetect
@Setter
@Getter
public class PersonRequestDto {
    private String name;
    private String title;

}