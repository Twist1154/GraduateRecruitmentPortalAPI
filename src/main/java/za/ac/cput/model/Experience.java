package za.ac.cput.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Represents the work experience of a graduate.
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
@Table(name = "Experience") // Maps the entity to a table with the same name
public class Experience {

    @Id
    private String experienceId;

    @NotNull
    private String jobTitle;

    private String assumedRole;

    @NotNull
    private String startDate;

    private String endDate;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private Graduate graduate;

}
