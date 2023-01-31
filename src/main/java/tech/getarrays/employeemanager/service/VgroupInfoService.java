package tech.getarrays.employeemanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.getarrays.employeemanager.expection.UserNotFoundExpection;
import tech.getarrays.employeemanager.model.DropDown;
import tech.getarrays.employeemanager.model.VgroupInfo;
import tech.getarrays.employeemanager.repo.VgroupInfoRepo;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class VgroupInfoService {
    private final VgroupInfoRepo vgroupInfoRepo;

    @Autowired
    public VgroupInfoService(VgroupInfoRepo vgroupInfoRepo) {
        this.vgroupInfoRepo = vgroupInfoRepo;
    }

    public List<VgroupInfo> findAllGroupInfo() {
        return vgroupInfoRepo.findAll();
    }

    public Object findGroupInfoById(Long id) {
        return vgroupInfoRepo.findGroupInfoById(id)
                .orElseThrow(() -> new UserNotFoundExpection("User bu id " + id + " was not found"));

    }

    public List<DropDown> findAllKeyValueGroups() {
        return vgroupInfoRepo.findAll().stream()
                .map(o -> new DropDown(o.getId(),o.getId() + ":" + o.getLanguage() + ":" + o.getLastname() + ":" + o.getName() + ":" + o.getPatronymic()))
                .collect(Collectors.toList());
    }
}

