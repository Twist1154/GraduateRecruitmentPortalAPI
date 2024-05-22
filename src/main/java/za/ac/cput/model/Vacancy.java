package za.ac.cput.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

/**
 * Represents a job vacancy in the system.
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
@Table(name = "Vacancy") // Maps the entity to a table with the same name
public class Vacancy {

    @Id
    private String vacancyId;

    private String vacancyTitle;

    private String jobType;

    private String jobRole;

    private boolean isApproved;

    private String location;

    @Column(length = 1024)
    private String jobDescription;

    @Column(length = 1024)
    private String aboutCompany;

    @OneToMany(mappedBy = "vacancy", cascade = CascadeType.ALL) // Specifies the one-to-many relationship with JobResponsibility
    private Set<JobResponsibility> jobResponsibilities;

    @OneToMany(mappedBy = "vacancy", cascade = CascadeType.ALL) // Specifies the one-to-many relationship with JobRequirement
    private Set<JobRequirement> jobRequirements;

    @ManyToOne(cascade = CascadeType.PERSIST) // Specifies the many-to-one relationship with Recruiter
    @JoinColumn(name = "recruiter_id", nullable = false) // Specifies the join column name
    private Recruiter recruiter;
}
