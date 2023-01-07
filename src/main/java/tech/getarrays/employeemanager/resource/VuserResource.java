package tech.getarrays.employeemanager.resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.getarrays.employeemanager.model.Vuser;
import tech.getarrays.employeemanager.service.VuserService;

import java.util.List;


@RestController
@RequestMapping("/vuser")
public class VuserResource {
    private final VuserService vuserService;

    public VuserResource(VuserService vuserService) {
        this.vuserService = vuserService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Vuser>> getAllUser () {
        List<Vuser> vuser = vuserService.findAllUser();
        return new ResponseEntity<>(vuser, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Vuser> getUserById (@PathVariable("id") Long id) {
        Vuser vuser = (Vuser) vuserService.findUserById(id);
        return new ResponseEntity<>(vuser, HttpStatus.OK);
    }
}