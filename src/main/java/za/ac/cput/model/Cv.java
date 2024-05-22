/*
Author: Rethabile Ntsekhe
Entity class for CV
 */

package za.ac.cput.model;

import lombok.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * Cv entity class
 *
 * Represents a CV document within the system.
 *
 * @Author Rethabile Ntsekhe
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Cv implements Serializable {

    private static final long serialVersionUID = 1L; // Added serialVersionUID

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Define ID generation strategy
    private String cvId;

    @NotNull
    private String documentName;

    @NotNull
    private String documentLocation;

    @NotNull
    private boolean isAcknowledged;

    private byte[] cvData;

    @NotNull
    private LocalDate dateAdded;
}
