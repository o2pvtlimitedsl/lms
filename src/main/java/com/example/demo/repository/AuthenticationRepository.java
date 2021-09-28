package com.example.demo.repository;

import com.example.demo.model.Authentication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthenticationRepository extends JpaRepository<Authentication, String> {

    Authentication findByUser(String userSeq);

}
