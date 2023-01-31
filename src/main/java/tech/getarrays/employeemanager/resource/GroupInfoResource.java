package tech.getarrays.employeemanager.resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.getarrays.employeemanager.model.DropDown;
import tech.getarrays.employeemanager.model.GroupInfo;
import tech.getarrays.employeemanager.service.GroupInfoService;

import java.util.List;

@RestController
@RequestMapping("/groupInfo")
public class GroupInfoResource {
    private final GroupInfoService groupInfoService;

    public GroupInfoResource(GroupInfoService groupInfoService) {
        this.groupInfoService = groupInfoService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<GroupInfo>> getAllGroupInfo () {
        List<GroupInfo> groupInfo = groupInfoService.findAllGroupInfo();
        return new ResponseEntity<>(groupInfo, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<GroupInfo> getGroupInfoById (@PathVariable("id") Long id) {
        GroupInfo groupInfo = (GroupInfo) groupInfoService.findGroupInfoById(id);
        return new ResponseEntity<>(groupInfo, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<GroupInfo> addGroupInfo(@RequestBody GroupInfo groupInfo) {
        GroupInfo newGroupInfo = groupInfoService.addGroupInfo(groupInfo);
        return new ResponseEntity<>(newGroupInfo, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<GroupInfo> updateGroupInfo(@RequestBody GroupInfo groupInfo) {
        GroupInfo updateGroupInfo = groupInfoService.updateGroupInfo(groupInfo);
        return new ResponseEntity<>(updateGroupInfo, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteGroupInfo(@PathVariable("id") Long id) {
        groupInfoService.deleteGroupInfo(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
