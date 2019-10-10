package com.globalurban.website.controller;

import com.globalurban.website.domain.Contact;
import com.globalurban.website.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {

    @Autowired
    ContactService contactService;

    @PostMapping("/send")
    public String sent(@RequestParam("email") String email,
                       @RequestParam("subject") String subject,
                       @RequestParam("content") String content){
        Contact contact = new Contact();
        contact.setContent(content);
        contact.setEmail(email);
        contact.setSubject(subject);
        try{
            contactService.sendMessage(contact);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "index";
    }
}
