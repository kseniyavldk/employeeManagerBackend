package tech.getarrays.employeemanager.resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.getarrays.employeemanager.model.timeTable;
import tech.getarrays.employeemanager.service.timeTableService;

import java.util.List;

@RestController
@RequestMapping("/timeTable")
public class timeTableResource {
    private final timeTableService timeTableService;

    public timeTableResource(tech.getarrays.employeemanager.service.timeTableService timeTableService) {
        this.timeTableService = timeTableService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<timeTable>> getAllTimeTable () {
        List<timeTable> timeTable = timeTableService.findAllTimeTable();
        return new ResponseEntity<>(timeTable, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<timeTable> getTimeTableById (@PathVariable("id") Long id) {
        timeTable timeTable = (timeTable) timeTableService.findTimeTableById(id);
        return new ResponseEntity<>(timeTable, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<timeTable> addTimeTable(@RequestBody timeTable timeTable) {
        timeTable newTimeTable = timeTableService.addTimeTable(timeTable);
        return new ResponseEntity<>(newTimeTable, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<timeTable> updateTimeTable(@RequestBody timeTable timeTable) {
        timeTable updateTimeTable = timeTableService.updateTimeTable(timeTable);
        return new ResponseEntity<>(updateTimeTable, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteTimeTableById(@PathVariable("id") Long id) {
        timeTableService.deleteTimeTable(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
