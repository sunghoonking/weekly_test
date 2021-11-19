package com.sparta.week04.controller;

import com.sparta.week04.domain.Person;
import com.sparta.week04.dto.PersonRequestDto;
import com.sparta.week04.repository.PersonRepository;
import com.sparta.week04.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RequiredArgsConstructor
@RestController
public class PersonController {

    private final PersonService personService;
    private final PersonRepository personRepository;

    @GetMapping("/api/persons")
    public List<Person> getPersons() {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime yesterday = LocalDateTime.now().minusDays(1);;
        return personRepository.findAllByModifiedAtBetweenOrderByModifiedAtDesc(now, yesterday);
    }

    @PostMapping("/api/persons")
    public Person createPerson(@RequestBody PersonRequestDto requestDto) {
        Person person = new Person(requestDto);
        return personRepository.save(person);

    @PutMapping("/api/persons")
    public Long updatePerson(@PathVariable Long id,@RequestBody PersonRequestDto requestDto)        {
        personService.update(id, requestDto);
        return id;
        }
    }
}

