package com.globalurban.website.service;

import com.globalurban.website.domain.Contact;

public interface ContactService {
    void sendMessage(Contact contact) throws Exception;
}
