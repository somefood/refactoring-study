package me.whiteship.refactoring._16_temporary_field.practice._36_introduce_special_case;

public class UnknowCustomer extends Customer {

    public UnknowCustomer() {
        super("unknown", new BasicBillingPlan(), new NullPaymentHistory());
    }

    @Override
    public boolean isUnknown() {
        return true;
    }

    @Override
    public String getName() {
        return "occupant";
    }
}
