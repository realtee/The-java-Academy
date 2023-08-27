package com.tolani.thejavaacademybank.service;

import com.tolani.thejavaacademybank.dto.EmailDetails;

public interface EmailService {
    void sendEmailAlert(EmailDetails emailDetails);
    void sendEmailWithAttachment(EmailDetails emailDetails);
}
