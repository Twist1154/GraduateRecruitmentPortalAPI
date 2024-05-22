package za.ac.cput.model;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

/**
 * Represents a document uploaded to the graduate portal.
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
@Table(name = "GraduatePortalDocument") // Maps the entity to a table with the same name
public class GraduatePortalDocument {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Specifies the ID generation strategy
    private Long documentId;

    private String documentName;

    private String documentType;

    private String documentLocation;

    @Lob // Specifies that the documentData field should be stored as a large object in the database
    private byte[] documentData;

    @NotNull
    private LocalDate dateAdded;
}
