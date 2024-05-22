package za.ac.cput.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.Set;

/**
 * Represents a faculty at the university.
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
@Table(name = "Faculty") // Maps the entity to a table with the same name
public class Faculty {

    @Id
    private String facultyId;

    private String facultyName;

    private String facultyDescription;

    @OneToMany(mappedBy = "faculty", cascade = CascadeType.ALL) // mappedBy indicates the field in the related entity
    private Set<Department> departments;
}
