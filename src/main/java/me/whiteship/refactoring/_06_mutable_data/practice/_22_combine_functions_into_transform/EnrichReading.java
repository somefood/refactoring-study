package me.whiteship.refactoring._06_mutable_data.practice._22_combine_functions_into_transform;

public record EnrichReading(Reading reading, double baseCharge, double taxableCharge) {
}
