package tech.getarrays.employeemanager.resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.getarrays.employeemanager.model.DropDown;
import tech.getarrays.employeemanager.model.VgroupInfo;
import tech.getarrays.employeemanager.service.VgroupInfoService;

import java.util.List;

@RestController
@RequestMapping("/vgroupInfo")
public class VgroupInfoResource {
    private final VgroupInfoService vgroupInfoService;

    public VgroupInfoResource(VgroupInfoService vgroupInfoService) {
        this.vgroupInfoService = vgroupInfoService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<VgroupInfo>> getAllGroupInfo () {
        List<VgroupInfo> vgroupInfo = vgroupInfoService.findAllGroupInfo();
        return new ResponseEntity<>(vgroupInfo, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<VgroupInfo> getGroupInfoById (@PathVariable("id") Long id) {
        VgroupInfo vgroupInfo = (VgroupInfo) vgroupInfoService.findGroupInfoById(id);
        return new ResponseEntity<>(vgroupInfo, HttpStatus.OK);
    }

    @GetMapping("/allKeyValue")
    public ResponseEntity<List<DropDown>> getAllGroups () {
        List<DropDown> role = vgroupInfoService.findAllKeyValueGroups();
        return new ResponseEntity<>(role, HttpStatus.OK);
    }
}
