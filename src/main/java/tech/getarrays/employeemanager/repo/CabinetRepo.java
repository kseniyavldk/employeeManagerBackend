package tech.getarrays.employeemanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.getarrays.employeemanager.model.Cabinet;

import java.util.Optional;

public interface CabinetRepo extends JpaRepository<Cabinet, Long> {
    Optional<Object> findCabinetById(Long id);
}
