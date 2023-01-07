package tech.getarrays.employeemanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.getarrays.employeemanager.expection.UserNotFoundExpection;
import tech.getarrays.employeemanager.model.Vuser;
import tech.getarrays.employeemanager.repo.VuserRepo;

import java.util.List;


@Service
public class VuserService {
    private final VuserRepo vuserRepo;

    @Autowired
    public VuserService(VuserRepo vuserRepo) {
        this.vuserRepo = vuserRepo;
    }

    public List<Vuser> findAllUser() {
        return vuserRepo.findAll();
    }

    public Object findUserById(Long id) {
        return vuserRepo.findUserById(id)
                .orElseThrow(() -> new UserNotFoundExpection("User bu id " + id + " was not found"));

    }
}