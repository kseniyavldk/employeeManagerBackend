package tech.getarrays.employeemanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.getarrays.employeemanager.expection.UserNotFoundExpection;
import tech.getarrays.employeemanager.model.DropDown;
import tech.getarrays.employeemanager.model.GroupInfo;
import tech.getarrays.employeemanager.repo.GroupInfoRepo;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class GroupInfoService {
    private final GroupInfoRepo groupInfoRepo;

    @Autowired
    public GroupInfoService(GroupInfoRepo groupInfoRepo) {
        this.groupInfoRepo = groupInfoRepo;
    }

    public GroupInfo addGroupInfo(GroupInfo groupInfo) {
        groupInfo.setGroupInfoCode(UUID.randomUUID().toString());
        return groupInfoRepo.save(groupInfo);
    }

    public List<GroupInfo> findAllGroupInfo() {
        return groupInfoRepo.findAll();
    }

    public GroupInfo updateGroupInfo(GroupInfo groupInfo) {
        return groupInfoRepo.save(groupInfo);
    }

    public Object findGroupInfoById(Long id) {
        return groupInfoRepo.findGroupInfoById(id)
                .orElseThrow(() -> new UserNotFoundExpection("User bu id " + id + " was not found"));

    }

    public void deleteGroupInfo(Long id) {
        groupInfoRepo.deleteById(id);
    }
}

