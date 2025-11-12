import java.util.Scanner;

public class GlobalWarmingQuiz{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        String[] questions = {
            "What is the primary greenhouse gas responsible for recent global warming?",
            "Which of the following is NOT a proven consequence of global warming?",
            "What percentage of climate scientists agree that humans are causing global warming?",
            "Which international agreement aims to limit global warming?",
            "What is the main cause of rising sea levels?"
        };
        
        String[][] options = {
            {"1) Carbon dioxide", "2) Methane", "3) Water vapor", "4) Nitrogen"},
            {"1) Rising sea levels", "2) More frequent hurricanes", "3) Increased volcanic activity", "4) Melting glaciers"},
            {"1) 50%", "2) 67%", "3) 83%", "4) Over 97%"},
            {"1) Geneva Convention", "2) Paris Agreement", "3) Kyoto Protocol", "4) Both 2 and 3"},
            {"1) Thermal expansion of water", "2) Melting land ice", "3) Both 1 and 2", "4) Increased rainfall"}
        };
        
        int[] answers = {1, 3, 4, 4, 3};
        
        int score = 0;
        
        System.out.println("Global Warming Facts Quiz\n");
        
        for (int i = 0; i < questions.length; i++) {
            System.out.println((i + 1) + ". " + questions[i]);
            for (String option : options[i]) {
                System.out.println("   " + option);
            }
            System.out.print("Your answer (1-4): ");
            int userAnswer = input.nextInt();
            
            if (userAnswer == answers[i]) {
                score++;
            }
        }
        
        System.out.println("\nYour score: " + score + "/5");
        
        if (score == 5) {
            System.out.println("Excellent!");
        } else if (score == 4) {
            System.out.println("Very good!");
        } else {
            System.out.println("Time to brush up on your knowledge of global warming.");
            System.out.println("Some websites for research:");
            System.out.println("- NASA Climate Change: climate.nasa.gov");
            System.out.println("- IPCC: ipcc.ch");
            System.out.println("- NOAA Climate: climate.gov");
        }
    }
}