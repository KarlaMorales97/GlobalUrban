package com.globalurban.website.service;

import com.globalurban.website.domain.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.internet.MimeMessage;

@Service
public class ContactServiceImpl implements ContactService{
    @Autowired
    private JavaMailSender javaMailSender;

    @Value("${spring.mail.username}")
    private String myEmail;

    @Override
    public void sendMessage(Contact contact) throws Exception {
        //Para enviar Imagenes!
        MimeMessage message = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, true);
        helper.setFrom(contact.getEmail());
        //helper.setTo(myEmail);
        helper.setTo("karla@global-urban.com");
        helper.setSubject(contact.getSubject());
        helper.setText(contact.getContent());

        System.out.println(contact.getSubject());
        System.out.println(contact.getContent());
        System.out.println(contact.getEmail());

        javaMailSender.send(message);
    }
}
