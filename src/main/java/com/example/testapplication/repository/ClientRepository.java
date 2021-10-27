package com.example.testapplication.repository;

import com.example.testapplication.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {
    Client findClientByUsername(String login);
}
