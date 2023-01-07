package tech.getarrays.employeemanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.getarrays.employeemanager.model.Vuser;

import java.util.Optional;

public interface VuserRepo extends JpaRepository<Vuser, Long> {
    Optional<Object> findUserById(Long id);
    //void deleteGroupInfoById(Long id);
}