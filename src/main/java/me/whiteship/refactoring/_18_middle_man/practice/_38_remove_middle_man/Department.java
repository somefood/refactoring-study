package me.whiteship.refactoring._18_middle_man.practice._38_remove_middle_man;

public class Department {

    private Person manager;

    public Department(Person manager) {
        this.manager = manager;
    }

    public Person getManager() {
        return manager;
    }
}
