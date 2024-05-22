package za.ac.cput.model;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Set;

/**
 * Represents a graduate in the system.
 *
 * Author: Rethabile Ntsekhe
 * Student number: 220455430
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Entity
@Table(name = "Graduate") // Maps the entity to a table with the same name
public class Graduate extends User implements Serializable {

    private String preferredName;

    private String secondaryEmail;

    private String motorVehicleLicense;

    private String country;

    @OneToOne(cascade = CascadeType.ALL) // Specifies the relationship with Cv
    @JoinColumn(name = "cv_id") // Specifies the join column name
    private Cv cv;

    @OneToMany(mappedBy = "graduate", cascade = CascadeType.ALL) // Specifies the relationship with Qualification
    private Set<Qualification> qualifications;

    @OneToMany(mappedBy = "graduate", cascade = CascadeType.ALL) // Specifies the relationship with Experience
    private Set<Experience> experiences;
}
