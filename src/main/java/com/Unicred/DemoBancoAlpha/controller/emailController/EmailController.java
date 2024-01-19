package com.Unicred.DemoBancoAlpha.controller.emailController;

import com.Unicred.DemoBancoAlpha.entities.email.Email;
import com.Unicred.DemoBancoAlpha.service.emailService.EmailService;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/email")
public class EmailController {

    private final EmailService emailService;


    public EmailController(EmailService emailService) {
        this.emailService = emailService;
    }

    @PostMapping("/recebido")
    @CrossOrigin(origins = "*")
    public void sendEmail(@RequestBody Email email){
        emailService.sendEmail(email);
    }
}
