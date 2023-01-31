package tech.getarrays.employeemanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.getarrays.employeemanager.model.VtimeTable;

import java.util.Optional;

public interface VtimeTableRepo extends JpaRepository<VtimeTable, Long> {
    Optional<Object> findTimeTableById(Long id);
}
