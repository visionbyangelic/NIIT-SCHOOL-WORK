public class CommandLineArray{
    public static void main(String[] args) {
        int arraySize = 10; // default size
        
        // Check if command-line argument is provided
        if (args.length > 0) {
            try {
                arraySize = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid argument. Using default size of 10.");
            }
        }
        
        int[] array = new int[arraySize];
        
        System.out.printf("Array of size %d created.%n", arraySize);
        System.out.println("Array elements initialized to:");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("array[%d] = %d%n", i, array[i]);
        }
    }
}