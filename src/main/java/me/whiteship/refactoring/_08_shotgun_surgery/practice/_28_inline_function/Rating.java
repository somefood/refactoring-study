package me.whiteship.refactoring._08_shotgun_surgery.practice._28_inline_function;

public class Rating {

    public int rating(Driver driver) {
        return driver.getNumberOfLateDeliveries() > 5 ? 2 : 1;
    }

}
