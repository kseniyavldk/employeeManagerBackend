package tech.getarrays.employeemanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.getarrays.employeemanager.expection.UserNotFoundExpection;
import tech.getarrays.employeemanager.model.VtimeTable;
import tech.getarrays.employeemanager.repo.VtimeTableRepo;

import java.util.List;
@Service
public class VtimeTableService {
    private final VtimeTableRepo VtimeTableRepo;

    @Autowired
    public VtimeTableService(VtimeTableRepo VtimeTableRepo) {
        this.VtimeTableRepo = VtimeTableRepo;
    }

    public List<VtimeTable> findAllTimeTable() {
        return VtimeTableRepo.findAll();
    }

    public Object findTimeTableById(Long id) {
        return VtimeTableRepo.findTimeTableById(id)
                .orElseThrow(() -> new UserNotFoundExpection("User bu id " + id + " was not found") );

    }
}