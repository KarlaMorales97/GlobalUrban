package com.globalurban.website.controller;

import com.globalurban.website.service.ClientService;
import com.globalurban.website.service.InformationService;
import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {

    @Autowired
    InformationService informationService;

    @Autowired
    ClientService clientService;

    @GetMapping("/")
    String init(Model model){
        System.out.println(informationService.findAll().get(0).getWelcome());
        model.addAttribute("inf", informationService.findAll());
        return "index";
    }

}
