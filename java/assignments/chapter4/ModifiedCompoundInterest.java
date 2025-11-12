public class ModifiedCompoundInterest{
    public static void main(String[] args){
        double principal = 1000.0;
        int years = 10;
        
        System.out.printf("%s%20s%n", "Interest Rate", "Amount on Deposit");
        
        for (int rate = 5; rate <= 10; rate++){
            double currentRate = rate / 100.0;
            double amount = principal * Math.pow(1.0 + currentRate, years);
            System.out.printf("%d%%%20.2f%n", rate, amount);
        }
    }
}