package tech.getarrays.employeemanager.resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.getarrays.employeemanager.model.DropDown;
import tech.getarrays.employeemanager.model.Role;
import tech.getarrays.employeemanager.service.RoleService;

import java.util.List;

@RestController
@RequestMapping("/role")
public class RoleResource {
    private final RoleService roleService;

    public RoleResource(RoleService roleService) {
        this.roleService = roleService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Role>> getAllRole () {
        List<Role> role = roleService.findAllRole();
        return new ResponseEntity<>(role, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Role> getRoleById (@PathVariable("id") Long id) {
        Role role = (Role) roleService.findRoleById(id);
        return new ResponseEntity<>(role, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Role> addRole(@RequestBody Role role) {
        Role newRole = roleService.addRole(role);
        return new ResponseEntity<>(newRole, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Role> updateRole(@RequestBody Role role) {
        Role updateRole = roleService.updateRole(role);
        return new ResponseEntity<>(updateRole, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteRoleById(@PathVariable("id") Long id) {
        roleService.deleteRole(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/allKeyValue")
    public ResponseEntity<List<DropDown>> getAllRoles () {
        List<DropDown> role = roleService.findAllKeyValueRoles();
        return new ResponseEntity<>(role, HttpStatus.OK);
    }
}
