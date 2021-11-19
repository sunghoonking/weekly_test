package com.sparta.week04.repository;

import com.sparta.week04.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Long> {
    List<Person> findAllByModifiedAtBetweenOrderByModifiedAtDesc(LocalDateTime start, LocalDateTime end);
}
