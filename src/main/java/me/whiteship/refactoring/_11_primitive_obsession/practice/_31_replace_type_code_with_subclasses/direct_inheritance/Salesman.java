package me.whiteship.refactoring._11_primitive_obsession.practice._31_replace_type_code_with_subclasses.direct_inheritance;

public class Salesman extends Employee {

    public Salesman(String name) {
        super(name);
    }

    @Override
    public String getType() {
        return "salesman";
    }
}
