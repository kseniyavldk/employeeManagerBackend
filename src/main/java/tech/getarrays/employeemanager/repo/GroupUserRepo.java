package tech.getarrays.employeemanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.getarrays.employeemanager.model.GroupUser;

import java.util.Optional;

public interface GroupUserRepo extends JpaRepository<GroupUser, Long> {
    Optional<Object> findGroupUserById(Long id);
}
