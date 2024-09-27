import java.util.Scanner;

abstract class Vehicle 
{
    private int days; 

    public Vehicle(int days) 
    {
        this.days = days;
    }

   
    public int getDays() 
    {
        return days;
    }

    public abstract double calculateTotalCost();
}

class Bike extends Vehicle 
{
    private double costPerDay = 1000.00; 

    public Bike(int days) 
    {
        super(days);
    }
    @Override
    public double calculateTotalCost() 
    {
        return getDays() * costPerDay;
    }
}

class Car extends Vehicle 
{
    private double costPerDay = 4000.00; 

    public Car(int days) 
    {
        super(days);
    }
    @Override
    public double calculateTotalCost()
     {
        return getDays() * costPerDay;
    }
}

public class BookingSystem
 {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Vehicle Rental System");
        System.out.println("Enter 1 to book a Bike. (Cost per day= BDT 1000)");
        System.out.println("Enter 2 to book a Car. (Cost per day= BDT 4000)");
        int choice = scanner.nextInt();

        System.out.println("Enter number of days you want to rent the vehicle:");
        int days = scanner.nextInt();

        Vehicle vehicle;

        if (choice == 1) 
        {
            vehicle = new Bike(days);
        } 
        else if (choice == 2) 
        {
            vehicle = new Car(days);
        }
        
         else 
         {
            System.out.println("Invalid choice!");
            return;
        }
        System.out.println("Total cost for booking: BDT" +" "+ vehicle.calculateTotalCost() + "\n" + "_______Thank You_______");
        scanner.close();
    }
}
