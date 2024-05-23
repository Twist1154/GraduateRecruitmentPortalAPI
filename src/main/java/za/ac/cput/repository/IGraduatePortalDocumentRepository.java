package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.factory.GraduatePortalDocumentFactory;
import za.ac.cput.model.GraduatePortalDocument;

/**
 * @author Mbuso Kotobe
 * */
@Repository
public interface IGraduatePortalDocumentRepository extends JpaRepository<GraduatePortalDocument, String> {
}
