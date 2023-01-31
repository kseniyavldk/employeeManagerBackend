package tech.getarrays.employeemanager.resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.getarrays.employeemanager.model.GroupUser;
import tech.getarrays.employeemanager.service.GroupUserService;

import java.util.List;

@RestController
@RequestMapping("/groupUser")
public class groupUserResource {
    private final GroupUserService groupUserService;

    public groupUserResource(GroupUserService groupUserService) {
        this.groupUserService = groupUserService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<GroupUser>> getAllGroupUser () {
        List<GroupUser> groupUser = groupUserService.findAllGroupUser();
        return new ResponseEntity<>(groupUser, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<GroupUser> getGroupUserById (@PathVariable("id") Long id) {
        GroupUser groupUser = (GroupUser) groupUserService.findGroupUserById(id);
        return new ResponseEntity<>(groupUser, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<GroupUser> addCabinet(@RequestBody GroupUser groupUser) {
        GroupUser newGroupUser = groupUserService.addGroupUser(groupUser);
        return new ResponseEntity<>(newGroupUser, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<GroupUser> updateGroupUser(@RequestBody GroupUser groupUser) {
        GroupUser updateGroupUser = groupUserService.updateGroupUser(groupUser);
        return new ResponseEntity<>(updateGroupUser, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteGroupUserById(@PathVariable("id") Long id) {
        groupUserService.deleteGroupUser(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
