package com.globalurban.website.controller;

import com.globalurban.website.domain.Client;
import com.globalurban.website.service.ClientService;
import com.globalurban.website.service.InformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ClientController {

    @Autowired
    ClientService clientService;

    @Autowired
    InformationService informationService;
    @PostMapping(path = "/clientLogin")
    String loginClient(Model model, Client client){
        if(clientService.findByClientAndPass(client.getUserClient(),client.getPassClient())){
            model.addAttribute("inf", informationService.findAll());
            System.out.println(clientService.findByClient(client.getUserClient()).getCompanyname());
            model.addAttribute("clientName",clientService.findByClient(client.getUserClient()));
            return "client/indexClient";
        }
        return "administrator";
    }

    @GetMapping("/addClient")
    String init(Model model){
        return "newClient";
    }
}
