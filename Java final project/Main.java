import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Home> homes = new ArrayList<Home>();
	int n=0;
        System.out.print("Enter number of homes in the colony: ");
	  try{
        	 n= sc.nextInt();
		}
		catch(Exception e)
		{
			System.out.println("check your input");
			return;
		}
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of home #" + (i+1) + ": ");
            String name = sc.next();
            System.out.print("Enter units consumed for home #" + (i+1) + ": ");
		
            double unitsConsumed = 0.0;
		try
		{
			unitsConsumed=sc.nextDouble();
		}
		catch(Exception e)
		{
			System.out.print("check your input");
			return;
		}
		Home home = new Home(name, unitsConsumed);
            homes.add(home);
        }
        for (Home home : homes) {
            System.out.println("Name: " + home.getName());
            System.out.println("Units consumed: " + home.getUnitsConsumed());
            System.out.println("Electricity bill: " + home.getBill());
        }
		
    }
}

