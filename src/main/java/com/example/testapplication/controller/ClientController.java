package com.example.testapplication.controller;

import com.example.testapplication.model.Client;
import com.example.testapplication.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ClientController {
    @Autowired
    private ClientRepository clientRepository;

    @GetMapping
    public String GetMain(Model model){
        Iterable<Client> client = clientRepository.findAll();
        model.addAttribute("client", client);
        return "home";
    }
}
