package me.whiteship.refactoring._10_data_clumps.practice;

public class Office {

    private String location;
    
    private TelephoneNumber officePhoneNumber;

    public Office(String location, TelephoneNumber officePhoneNumber) {
        this.location = location;
        this.officePhoneNumber = officePhoneNumber;
    }

    public String officePhoneNumber() {
        return officePhoneNumber.toString();
    }
}
