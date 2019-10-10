package com.globalurban.website.controller;

import com.globalurban.website.domain.Administrator;
import com.globalurban.website.domain.Client;
import com.globalurban.website.service.AdministratorService;
import com.globalurban.website.service.ClientService;
import com.globalurban.website.service.InformationService;
import org.hibernate.validator.constraints.URL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class AdministratorController {
    @Autowired
    AdministratorService administratorService;
    @Autowired
    InformationService informationService;
    @Autowired
    ClientService clientService;

    @GetMapping("/userLogin")
    String init(Model model){
        model.addAttribute("user", administratorService.findAll());
        return "administrator";
    }

    @PostMapping(path = "/adminLogin")
    String login(Model model, Administrator administrator){
        if(administratorService.findByAdminAndPass(administrator.getUnadmin(),administrator.getPassadmin())){
            model.addAttribute("inf", informationService.findAll());
            return "administratorSite";
        }
        model.addAttribute("user", administratorService.findAll());
        return "administrator";
    }

    @PostMapping(path = "/newClient")
    String edit(Model model, Client client){
        clientService.save(client);
        model.addAttribute("client", informationService.findAll());
        return "confirmCredentials";
    }
    @GetMapping("/GWAadmin")
    String GWAadmin(Model model){
        model.addAttribute("inf", informationService.findAll());
        return "administrator/GWAadmin";
    }

    @GetMapping("/GDMadmin")
    String GDMadmin(Model model){
        model.addAttribute("inf", informationService.findAll());
        return "administrator/GDMadmin";
    }

    @GetMapping("/SEEadmin")
    String SEEadmin(Model model){
        model.addAttribute("inf", informationService.findAll());
        return "administrator/SEEadmin";
    }
    @GetMapping("/GAEadmin")
    String GAEadmin(Model model){
        model.addAttribute("inf", informationService.findAll());
        return "administrator/GAEadmin";
    }
}
