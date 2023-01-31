package tech.getarrays.employeemanager.resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.getarrays.employeemanager.model.VtimeTable;
import tech.getarrays.employeemanager.service.VtimeTableService;

import java.util.List;


@RestController
@RequestMapping("/vtimetable")
public class VtimeTableResource {
    private final VtimeTableService VtimeTableService;

    public VtimeTableResource(VtimeTableService VtimeTableService) {
        this.VtimeTableService = VtimeTableService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<VtimeTable>> getAllTimeTable () {
        List<VtimeTable> VtimeTable = VtimeTableService.findAllTimeTable();
        return new ResponseEntity<>(VtimeTable, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<VtimeTable> getTimeTableById (@PathVariable("id") Long id) {
        VtimeTable timeTable = (VtimeTable) VtimeTableService.findTimeTableById(id);
        return new ResponseEntity<>(timeTable, HttpStatus.OK);
    }

}