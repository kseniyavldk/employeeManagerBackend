package tech.getarrays.employeemanager.expection;

public class UserNotFoundExpection extends RuntimeException{
    public UserNotFoundExpection(String s) {
        super(s);
    }
}
