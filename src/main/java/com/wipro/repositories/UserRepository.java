package com.wipro.repositories;

import java.util.List;

import com.wipro.model.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, String>{

    User findByEmail(String email);
    User findByPassword(String password);
    User findByEmailAndPassword(String email, String password);

    @Query(value="select * from user order by firstname", nativeQuery=true)
    List<User> findAllSorted();
}