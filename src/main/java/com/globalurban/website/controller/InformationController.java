package com.globalurban.website.controller;

import com.globalurban.website.domain.Administrator;
import com.globalurban.website.domain.Information;
import com.globalurban.website.service.InformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class InformationController {

    @Autowired
    InformationService informationService;

    /*@PostMapping(path = "/infoEdit")
    String edit(Model model, Administrator administrator){
        Long id = administrator.getIdadmin();
        informationService.findOne(id);
        return "administrator";
    }*/

    @PostMapping(path = "/infoEdit")
    String edit(Model model, Information information){
        Information information1 = informationService.findOne((long) 1);
        information1.setDvbe(information.getDvbe());
        information1.setWelcome(information.getWelcome());
        information1.setAboutus(information.getAboutus());
        information1.setIntroservice(information.getIntroservice());
        information1.setGrantwriadmin(information.getGrantwriadmin());
        information1.setGraphicdesign(information.getGraphicdesign());
        information1.setGoverenti(information.getGoverenti());
        information1.setOuteducation(information.getOuteducation());
        information1.setIntroportfolio(information.getIntroportfolio());
        information1.setInfoclient(information.getInfoclient());
        information1.setGraphicdesignTwo(information.getGraphicdesignTwo());
        information1.setGoverti2(information.getGoverti2());
        informationService.save(information1);
        model.addAttribute("inf", informationService.findAll());
        return "administratorSite";
    }

    @GetMapping("/aboutUsV")
    String go(Model model){
        return "aboutUs-V";
    }

    @GetMapping("/GWA")
    String GWA(Model model){
        model.addAttribute("inf", informationService.findAll());
        return "services/GWA";
    }

    @GetMapping("/GDM")
    String GDM(Model model){
        model.addAttribute("inf", informationService.findAll());
        return "services/GDM";
    }

    @GetMapping("/GAE")
    String GAE(Model model){
        model.addAttribute("inf", informationService.findAll());
        return "services/GAE";
    }

    @GetMapping("/SEE")
    String SEE(Model model){
        model.addAttribute("inf", informationService.findAll());
        return "services/SEE";
    }
    @GetMapping("/portfolioSlide")
    String portfolio(Model model){
        return "PortfolioSlider";
    }

    @GetMapping("/GWA/gwawwu")
    String gwawwu(Model model){
        return "services/GWAwwu";
    }

    @GetMapping("/GDM/gdmwwu")
    String gdmwwu(Model model){
        return "services/GDMwwu";
    }

    @GetMapping("/GAE/gaewwu")
    String gaewwu(Model model){
        return "services/GAEwwu";
    }

    @GetMapping("/SEE/seewwu")
    String seewwu(Model model){
        return "services/SEEwwu";
    }
}
