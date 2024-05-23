package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.model.Vacancy;

/**
 * @author Mbuso Kotobe
 * */
@Repository
public interface IVacancyRepository extends JpaRepository<Vacancy, String> {
}
