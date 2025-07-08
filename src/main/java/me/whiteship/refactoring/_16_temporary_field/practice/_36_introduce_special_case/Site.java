package me.whiteship.refactoring._16_temporary_field.practice._36_introduce_special_case;

public class Site {

    private Customer customer;

    public Site(Customer customer) {
        this.customer = customer.getName().equals("unknown") ? new UnknowCustomer() : customer;
    }

    public Customer getCustomer() {
        return customer;
    }
}
