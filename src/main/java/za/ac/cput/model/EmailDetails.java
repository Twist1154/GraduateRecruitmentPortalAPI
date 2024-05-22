package za.ac.cput.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

/**
 * Represents the details of an email.
 *
 * Author: Rethabile Ntsekhe
 * Student number: 220455430
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class EmailDetails {
    private String recipient;
    private String msgBody;
    private String subject;
    private String attachment;

    // Additional method to check if the email has an attachment
    public boolean hasAttachment() {
        return attachment != null && !attachment.isEmpty();
    }
}
