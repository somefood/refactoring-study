package me.whiteship.refactoring._11_primitive_obsession.practice._30_repliace_primitive_with_object;

public class Order {

    private String priority;

    public Order(String priority) {
        this.priority = priority;
    }

    public String getPriority() {
        return priority;
    }
}
