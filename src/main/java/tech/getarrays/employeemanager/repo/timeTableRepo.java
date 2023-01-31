package tech.getarrays.employeemanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.getarrays.employeemanager.model.timeTable;

import java.util.Optional;

public interface timeTableRepo extends JpaRepository<timeTable, Long> {
    Optional<Object> findTimeTableById(Long id);
}
