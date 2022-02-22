package com.catalog.user.email;

import lombok.AllArgsConstructor;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.mail.javamail.MimeMessageHelper;

import java.util.logging.Logger;

@Service
@AllArgsConstructor

public class EmailService implements EmailSender{


    private final static Logger LOGGER = LoggerFactory
            .getLogger(EmailService.class);

    private final JavaMailSender mailSender;



}
