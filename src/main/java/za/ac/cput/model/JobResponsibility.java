package za.ac.cput.model;

import lombok.*;

import javax.persistence.*;
import java.util.UUID;

/**
 * Represents a job responsibility for a vacancy.
 *
 * Author: Rethabile Ntsekhe
 * Student number: 220455430
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "JobResponsibility") // Maps the entity to a table with the same name
public class JobResponsibility {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // Specifies the ID generation strategy
    private UUID jobResponsibilityId;

    private String responsibility;

    @ManyToOne(cascade = CascadeType.PERSIST) // Specifies the many-to-one relationship with Vacancy
    @JoinColumn(name = "vacancy_id", nullable = false) // Specifies the join column name
    private Vacancy vacancy;
}
