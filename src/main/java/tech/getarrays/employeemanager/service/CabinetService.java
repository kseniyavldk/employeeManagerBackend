package tech.getarrays.employeemanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.getarrays.employeemanager.expection.UserNotFoundExpection;
import tech.getarrays.employeemanager.model.Cabinet;
import tech.getarrays.employeemanager.model.DropDown;
import tech.getarrays.employeemanager.repo.CabinetRepo;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class CabinetService {
    private final CabinetRepo cabinetRepo;

    @Autowired
    public CabinetService(CabinetRepo cabinetRepo) {
        this.cabinetRepo = cabinetRepo;
    }

    public Cabinet addCabinet(Cabinet cabinet){
        cabinet.setCabinetCode (UUID.randomUUID().toString());
        return cabinetRepo.save(cabinet);
    }

    public List<Cabinet> findAllCabinet() {
        return cabinetRepo.findAll();
    }

    public Cabinet updateCabinet(Cabinet cabinet) {
        return cabinetRepo.save(cabinet);
    }

    public Object findCabinetById(Long id) {
        return cabinetRepo.findCabinetById(id)
                .orElseThrow(() -> new UserNotFoundExpection("User bu id " + id + " was not found") );

    }
    public void deleteCabinet(Long id){
        cabinetRepo.deleteById(id);
    }

    public List<DropDown> findAllKeyValueCabinets() {
        return cabinetRepo.findAll().stream()
                .map(o -> new DropDown(o.getId(),o.getNumber().toString()))
                .collect(Collectors.toList());
    }
}
