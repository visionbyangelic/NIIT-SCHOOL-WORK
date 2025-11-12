public class FacebookGrowth{
    public static void main(String[] args){
        double currentUsers = 1_000_000_000; // 1 billion
        double target1 = 1_500_000_000; // 1.5 billion
        double target2 = 2_000_000_000; // 2 billion
        double growthRate = 0.04; // 4% monthly
        
        int monthsTo1_5B = calculateMonths(currentUsers, target1, growthRate);
        int monthsTo2B = calculateMonths(currentUsers, target2, growthRate);
        
        System.out.printf("Facebook user growth projection (4%% monthly growth)%n");
        System.out.printf("Current users: %.1f billion%n", currentUsers / 1_000_000_000);
        System.out.printf("Months to reach 1.5 billion: %d months%n", monthsTo1_5B);
        System.out.printf("Months to reach 2.0 billion: %d months%n", monthsTo2B);
    }
    
    public static int calculateMonths(double current, double target, double rate) {
        int months = 0;
        double users = current;
        
        while (users < target) {
            users *= (1 + rate);
            months++;
        }
        
        return months;
    }
}