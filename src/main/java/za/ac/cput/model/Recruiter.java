package za.ac.cput.model;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

/**
 * Represents a recruiter in the system.
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
@Table(name = "Recruiter") // Maps the entity to a table with the same name
public class Recruiter extends User implements Serializable {

    private String companyName;

    private LocalDate dateAdded;

    @OneToMany(mappedBy = "recruiter", cascade = CascadeType.ALL) // Specifies the one-to-many relationship with Vacancy
    private Set<Vacancy> vacancies;
}
