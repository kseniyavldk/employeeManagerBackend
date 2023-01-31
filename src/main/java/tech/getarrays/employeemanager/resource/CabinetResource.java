package tech.getarrays.employeemanager.resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.getarrays.employeemanager.model.Cabinet;
import tech.getarrays.employeemanager.model.DropDown;
import tech.getarrays.employeemanager.service.CabinetService;

import java.util.List;

@RestController
@RequestMapping("/cabinet")
public class CabinetResource {
    private final CabinetService cabinetService;

    public CabinetResource(CabinetService cabinetService) {
        this.cabinetService = cabinetService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Cabinet>> getAllCabinet () {
        List<Cabinet> cabinet = cabinetService.findAllCabinet();
        return new ResponseEntity<>(cabinet, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Cabinet> getCabinetById (@PathVariable("id") Long id) {
        Cabinet cabinet = (Cabinet) cabinetService.findCabinetById(id);
        return new ResponseEntity<>(cabinet, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Cabinet> addCabinet(@RequestBody Cabinet cabinet) {
        Cabinet newCabinet = cabinetService.addCabinet(cabinet);
        return new ResponseEntity<>(newCabinet, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Cabinet> updateCabinet(@RequestBody Cabinet cabinet) {
        Cabinet updateCabinet = cabinetService.updateCabinet(cabinet);
        return new ResponseEntity<>(updateCabinet, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteCabinetById(@PathVariable("id") Long id) {
        cabinetService.deleteCabinet(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/allKeyValue")
    public ResponseEntity<List<DropDown>> getAllCabinets () {
        List<DropDown> cabinets = cabinetService.findAllKeyValueCabinets();
        return new ResponseEntity<>(cabinets, HttpStatus.OK);
    }
}
