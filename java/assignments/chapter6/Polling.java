import java.util.Scanner;

public class Polling{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String[] topics = {
            "Climate Change",
            "Education Reform", 
            "Healthcare Access",
            "Economic Inequality",
            "Digital Privacy"
        };
        
        int[][] responses = new int[5][10]; // 5 topics, 10 ratings (1-10)
        int[] responseCount = new int[5];
        
        System.out.println("Rate the following issues from 1 (least important) to 10 (most important):");
        
        String continuePolling;
        do {
            for (int i = 0; i < topics.length; i++) {
                System.out.printf("Rate '%s': ", topics[i]);
                int rating = input.nextInt();
                
                while (rating < 1 || rating > 10) {
                    System.out.print("Invalid rating. Enter 1-10: ");
                    rating = input.nextInt();
                }
                
                responses[i][rating - 1]++;
                responseCount[i]++;
            }
            
            System.out.print("Continue polling? (yes/no): ");
            continuePolling = input.next();
            
        } while (continuePolling.equalsIgnoreCase("yes"));
        
        // Display results
        displayResults(topics, responses, responseCount);
    }
    
    private static void displayResults(String[] topics, int[][] responses, int[] responseCount) {
        System.out.println("\nPolling Results Summary");
        System.out.println("Topic\t\t\t1\t2\t3\t4\t5\t6\t7\t8\t9\t10\tAverage");
        
        int highestTotal = Integer.MIN_VALUE;
        int lowestTotal = Integer.MAX_VALUE;
        String highestTopic = "";
        String lowestTopic = "";
        
        for (int i = 0; i < topics.length; i++) {
            System.out.printf("%-20s", topics[i]);
            
            int total = 0;
            int count = 0;
            
            for (int j = 0; j < 10; j++) {
                System.out.printf("%d\t", responses[i][j]);
                total += (j + 1) * responses[i][j];
                count += responses[i][j];
            }
            
            double average = (double) total / count;
            System.out.printf("%.2f%n", average);
            
            if (total > highestTotal) {
                highestTotal = total;
                highestTopic = topics[i];
            }
            
            if (total < lowestTotal) {
                lowestTotal = total;
                lowestTopic = topics[i];
            }
        }
        
        System.out.printf("%nHighest rated topic: %s with %d total points%n", highestTopic, highestTotal);
        System.out.printf("Lowest rated topic: %s with %d total points%n", lowestTopic, lowestTotal);
    }
}