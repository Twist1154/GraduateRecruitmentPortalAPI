package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.model.EmailDetails;

public interface EmailService extends JpaRepository<EmailService, String> {
    //This method can be used to send a simple text email to the desired recipient
    String sendSimpleMail(EmailDetails details);

    //This method can be used to send an email along with an attachment to the desired recipient
    String sendMailWithAttachment(EmailDetails details);

}
