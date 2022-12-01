package tech.getarrays.employeemanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.getarrays.employeemanager.expection.UserNotFoundExpection;
import tech.getarrays.employeemanager.model.timeTable;
import tech.getarrays.employeemanager.repo.timeTableRepo;

import java.util.List;
import java.util.UUID;

@Service
public class timeTableService {
    private final timeTableRepo timeTableRepo;

    @Autowired
    public timeTableService(tech.getarrays.employeemanager.repo.timeTableRepo timeTableRepo) {
        this.timeTableRepo = timeTableRepo;
    }

    public timeTable addTimeTable(timeTable timeTable){
        timeTable.setTimeTableCode (UUID.randomUUID().toString());
        return timeTableRepo.save(timeTable);
    }

    public List<timeTable> findAllTimeTable() {
        return timeTableRepo.findAll();
    }

    public timeTable updateTimeTable(timeTable timeTable) {
        return timeTableRepo.save(timeTable);
    }

    public Object findTimeTableById(Long id) {
        return timeTableRepo.findTimeTableById(id)
                .orElseThrow(() -> new UserNotFoundExpection("User bu id " + id + " was not found") );

    }
    public void deleteTimeTable(Long id){
        timeTableRepo.deleteById(id);
    }
}
