import java.util.Scanner;

public class ElectricityBill {

    private double ratePerUnit;
    private double fixedCharge;
    private double unitsConsumed;

    public ElectricityBill() {
        this.ratePerUnit = 8.50;
        this.fixedCharge = 200.0;
        this.unitsConsumed = 0.0;
    }

    public double getRatePerUnit() {
        return this.ratePerUnit;
    }

    public void setRatePerUnit(double ratePerUnit) {
        this.ratePerUnit = ratePerUnit;
    }

    public double getFixedCharge() {
        return this.fixedCharge;
    }

    public void setFixedCharge(double fixedCharge) {
        this.fixedCharge = fixedCharge;
    }

    public double getUnitsConsumed() {
        return this.unitsConsumed;
    }

    public void setUnitsConsumed(double unitsConsumed) {
        this.unitsConsumed = unitsConsumed;
    }

    public double calculateBill(double unitsConsumed) {
        double bill = 0.0;

        if(unitsConsumed <= 100) {
            this.ratePerUnit = 3.00;
            this.fixedCharge = 50.0;
        } else if(unitsConsumed > 100 && unitsConsumed <= 200) {
            this.ratePerUnit = 4.50;
            this.fixedCharge = 100.0;
        } else if(unitsConsumed > 200 && unitsConsumed <= 300) {
            this.ratePerUnit = 6.00;
            this.fixedCharge = 150.0;
        } else if(unitsConsumed > 300) {
            this.ratePerUnit = 7.50;
            this.fixedCharge = 200.0;
        }

        bill = (unitsConsumed * this.ratePerUnit) + this.fixedCharge;
        return bill;
    }
}
