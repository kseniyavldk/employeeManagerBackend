package tech.getarrays.employeemanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.getarrays.employeemanager.model.Language;

import java.util.Optional;

public interface LanguageRepo extends JpaRepository<Language, Long> {
    void deleteLanguageById(Long id);
    Optional<Object> findLanguageById(Long id);
}
