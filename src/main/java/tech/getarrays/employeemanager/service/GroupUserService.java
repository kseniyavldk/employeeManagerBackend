package tech.getarrays.employeemanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.getarrays.employeemanager.expection.UserNotFoundExpection;
import tech.getarrays.employeemanager.model.GroupUser;
import tech.getarrays.employeemanager.repo.GroupUserRepo;

import java.util.List;
import java.util.UUID;

@Service
public class GroupUserService {
    private final GroupUserRepo groupUserRepo;

    @Autowired
    public GroupUserService(GroupUserRepo groupUserRepo) {
        this.groupUserRepo = groupUserRepo;
    }

    public GroupUser addGroupUser(GroupUser groupUser){
        groupUser.setGroupUserCode(UUID.randomUUID().toString());
        return groupUserRepo.save(groupUser);
    }

    public List<GroupUser> findAllGroupUser() {
        return groupUserRepo.findAll();
    }

    public GroupUser updateGroupUser(GroupUser groupUser) {
        return groupUserRepo.save(groupUser);
    }

    public Object findGroupUserById(Long id) {
        return groupUserRepo.findGroupUserById(id)
                .orElseThrow(() -> new UserNotFoundExpection("User bu id " + id + " was not found") );

    }
    public void deleteGroupUser(Long id){
        groupUserRepo.deleteById(id);
    }
}
