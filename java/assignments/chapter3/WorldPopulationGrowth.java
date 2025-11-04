import java.util.Scanner;

public class WorldPopulationGrowth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the current world population: ");
        long initialPopulation = input.nextLong();
        
        System.out.print("Enter the annual growth rate (e.g., 0.011 for 1.1%): ");
        double growthRate = input.nextDouble();
        
        double currentPopulation = initialPopulation;
        double targetPopulation = initialPopulation * 2.0;
        boolean isDoubled = false;
        
        // Print table header
        System.out.println("Year\tAnticipated Population\tNumerical Increase");
        System.out.println("---------------------------------------------------------");
        
        int year = 1;
        
        while (year <= 75) {
            double numericalIncrease = currentPopulation * growthRate;
            double newPopulation = currentPopulation + numericalIncrease;
            
            System.out.printf("%d\t%.0f\t\t%.0f%n", year, newPopulation, numericalIncrease);
            
            // Check if population has doubled
            if (newPopulation >= targetPopulation && !isDoubled) {
                System.out.printf("%n*** Population expected to double in Year %d ***%n", year);
                isDoubled = true; // Set flag so this message only prints once
            }
            
            currentPopulation = newPopulation; // Update population for next year
            year = year + 1;
        }
        
        input.close();
    }
}