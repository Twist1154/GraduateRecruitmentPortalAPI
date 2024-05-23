package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.model.Recruiter;

import java.util.Optional;

/**
 * @author Mbuso Kotobe
 * */
@Repository
public interface IRecruiterRepository extends JpaRepository<Recruiter, String> {
    Optional<Recruiter> findByEmail(String email);
}
