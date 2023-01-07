package tech.getarrays.employeemanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.getarrays.employeemanager.expection.UserNotFoundExpection;
import tech.getarrays.employeemanager.model.DropDown;
import tech.getarrays.employeemanager.model.User;
import tech.getarrays.employeemanager.repo.UserRepo;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class UserService {
    private final UserRepo userRepo;

    @Autowired
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public User addUser(User user) {
        user.setUserCode(UUID.randomUUID().toString());
        return userRepo.save(user);
    }

    public List<User> findAllUser() {
        return userRepo.findAll();
    }

    public User updateUser(User user) {
        return userRepo.save(user);
    }

    public Object findUserById(Long id) {
        return userRepo.findUserById(id)
                .orElseThrow(() -> new UserNotFoundExpection("User bu id " + id + " was not found"));

    }

    public void deleteUser(Long id) {
        userRepo.deleteById(id);
    }

    public List<DropDown> findAllTeachers() {
        return userRepo.findAll().stream().filter(x -> x.getRoleID() == 2)
                .map(o -> new DropDown(o.getId(),o.getFullName()))
                .collect(Collectors.toList());
    }

}
