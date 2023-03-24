import java.util.*;

public class Main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ElectricityBill eb = new ElectricityBill();

        System.out.print("Enter units consumed: ");
        double unitsConsumed = scanner.nextDouble();
        eb.setUnitsConsumed(unitsConsumed);

        double bill = eb.calculateBill(unitsConsumed);
        System.out.println("Electricity bill: " + bill);

        scanner.close();
    }
}
