package me.whiteship.refactoring._23_refused_bequest.practice;

public class Salesman extends Employee {

    protected Quota quota;

    protected Quota getQuota() {
        return new Quota();
    }
}

