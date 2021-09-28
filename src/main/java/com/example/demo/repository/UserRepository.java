package com.example.demo.repository;

import com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

    User findByUserSeqAndStatus(String userSeq, Integer statusSeq);

    User findByEmailAndStatus(String email, Integer statusSeq);
}