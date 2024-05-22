package za.ac.cput.model;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Represents a qualification obtained by a graduate.
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
@Table(name = "Qualification") // Maps the entity to a table with the same name
public class Qualification implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Specifies the ID generation strategy
    private Long qualificationId;

    private String qualificationName;

    private String qualificationDescription;

    @ManyToOne // Specifies the many-to-one relationship with Graduate
    @JoinColumn(name = "graduate_id", nullable = false) // Specifies the join column name
    private Graduate graduate;
}
