package me.whiteship.refactoring._12_repeated_swtiches.practice;

public class SwitchImprovements {

    public int vacationHours(String type) {
        return switch (type) {
            case "full-time" -> 120;
            case "part-time" -> 80;
            case "temporal" -> 32;
            default -> 0;
        };
    }
}
