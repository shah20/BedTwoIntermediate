package com.wipro.repositories;


import java.util.List;

import com.wipro.model.Answers;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AnswersRepository extends JpaRepository<Answers, String>{

    @Query(value="select * from answers order by taken_on", nativeQuery = true)
    List<Answers> findAllSorted();
}