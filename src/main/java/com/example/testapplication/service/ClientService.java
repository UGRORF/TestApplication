package com.example.testapplication.service;

import com.example.testapplication.model.Client;
import com.example.testapplication.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class ClientService implements UserDetailsService {
    @Autowired
    private ClientRepository clientRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Client client = clientRepository.findClientByUsername(username);

        if(client == null)
            throw new UsernameNotFoundException("User, with such username is not found!");

        UserDetails user = User.builder()
                .username(client.getUsername())
                .password(client.getPassword())
                .roles(client.getRole())
                .build();
        return user;
    }
}
