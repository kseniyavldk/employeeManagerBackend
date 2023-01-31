package tech.getarrays.employeemanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.getarrays.employeemanager.model.GroupInfo;

import java.util.Optional;

public interface GroupInfoRepo extends JpaRepository<GroupInfo, Long> {
    Optional<Object> findGroupInfoById(Long id);
    void deleteGroupInfoById(Long id);
}
