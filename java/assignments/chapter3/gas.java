import java.util.Scanner;

public class gas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int totalMiles = 0;
        int totalGallons = 0;
        
        System.out.print("Enter miles driven (-1 to quit): ");
        int miles = input.nextInt();
        
        while (miles != -1) {
            System.out.print("Enter gallons used: ");
            int gallons = input.nextInt();
            
            // Calculate MPG for this trip
            double mpg = (double) miles / gallons;
            System.out.printf("MPG for this trip: %.2f%n", mpg);
            
            // Add to totals
            totalMiles += miles;
            totalGallons += gallons;
            
            // Calculate combined MPG
            double combinedMpg = (double) totalMiles / totalGallons;
            System.out.printf("Combined MPG up to this point: %.2f%n%n", combinedMpg);
            
            // Prompt for next trip
            System.out.print("Enter miles driven (-1 to quit): ");
            miles = input.nextInt();
        }
        
        System.out.println("Exiting program.");
        input.close();
    }
}
