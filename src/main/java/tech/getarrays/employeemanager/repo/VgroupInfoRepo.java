package tech.getarrays.employeemanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.getarrays.employeemanager.model.VgroupInfo;

import java.util.Optional;

public interface VgroupInfoRepo extends JpaRepository<VgroupInfo, Long> {
    Optional<Object> findGroupInfoById(Long id);
    //void deleteGroupInfoById(Long id);
}
