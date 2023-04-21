
class Home {
    private String name;
    private double unitsConsumed;
    private double ratePerUnit;
    private double fixedCharge;

    public Home(String name, double unitsConsumed) {
        this.name = name;
        this.unitsConsumed = unitsConsumed;
        this.ratePerUnit = 8.50;
        this.fixedCharge = 200.0;
    }

    public String getName() {
        return this.name;
    }

    public double getUnitsConsumed() {
        return this.unitsConsumed;
    }

    public double getBill() {
        double bill = 0.0;
        if (unitsConsumed <= 100) {
            this.ratePerUnit = 3.00;
            this.fixedCharge = 50.0;
        } else if (unitsConsumed > 100 && unitsConsumed <= 200) {
            this.ratePerUnit = 4.50;
            this.fixedCharge = 100.0;
        } else if (unitsConsumed > 200 && unitsConsumed <= 300) {
            this.ratePerUnit = 6.00;
            this.fixedCharge = 150.0;
        } else if (unitsConsumed > 300) {
            this.ratePerUnit = 7.50;
            this.fixedCharge = 200.0;
        }
        bill = (unitsConsumed * this.ratePerUnit) + this.fixedCharge;
        return bill;
    }
}