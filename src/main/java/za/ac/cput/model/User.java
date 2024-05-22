package za.ac.cput.model;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Represents a user in the system.
 *
 * Author: Rethabile Ntsekhe
 * Student number: 220455430
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
@SuperBuilder(toBuilder = true)
public abstract class User implements Serializable {

    @Id
    protected String userId;

    protected String firstName;

    protected String surname;

    protected String email;

    protected String password;

    protected String cellphone;

    protected String userRole;
}
