package me.whiteship.refactoring._11_primitive_obsession.practice._32_replace_conditional_with_polymorphism.swtiches;

import java.util.List;

public abstract class Employee {

    protected List<String> availableProjects;

    public Employee(List<String> availableProjects) {
        this.availableProjects = availableProjects;
    }

    public Employee() {
    }

    public abstract int vacationHours();

    public boolean canAccessTo(String project) {
        return this.availableProjects.contains(project);
    }
}
