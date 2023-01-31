package tech.getarrays.employeemanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.getarrays.employeemanager.expection.UserNotFoundExpection;
import tech.getarrays.employeemanager.model.DropDown;
import tech.getarrays.employeemanager.model.Role;
import tech.getarrays.employeemanager.repo.RoleRepo;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class RoleService {
    private final RoleRepo roleRepo;

    @Autowired
    public RoleService(RoleRepo roleRepo) {
        this.roleRepo = roleRepo;
    }

    public Role addRole(Role role){
        role.setRoleCode (UUID.randomUUID().toString());
        return roleRepo.save(role);
    }

    public List<Role> findAllRole() {
        return roleRepo.findAll();
    }

    public Role updateRole(Role role) {
        return roleRepo.save(role);
    }

    public Object findRoleById(Long id) {
        return roleRepo.findRoleById(id)
                .orElseThrow(() -> new UserNotFoundExpection("User bu id " + id + " was not found") );

    }
    public void deleteRole(Long id){
        roleRepo.deleteById(id);
    }
    public List<DropDown> findAllKeyValueRoles() {
        return roleRepo.findAll().stream()
                .map(o -> new DropDown(o.getId(),o.getName()))
                .collect(Collectors.toList());
    }
}
