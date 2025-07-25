package me.whiteship.refactoring._09_feature_envy.practice;

public class Bill {

    private ElectricityUsage electricityUsage;

    private GasUsage gasUsage;

    public double calculateBill() {
        return electricityUsage.getElecticityBill() + gasUsage.getGasBill();
    }
    
}
