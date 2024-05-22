package za.ac.cput.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Objects;

/**
 * Department entity class
 *
 * Represents a department within a faculty at the university.
 *
 * @Author Chadrack Mbuyi
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
public class Department implements Serializable {

    private static final long serialVersionUID = 1L; // Added serialVersionUID

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Define ID generation strategy
    private String departmentId;

    @NotNull // Mark departmentName as not null
    private String departmentName;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL) // Set fetch type to LAZY
    @JoinColumn(name = "faculty_id") // Specify join column
    private Faculty faculty;
}
