Here are the answers and complete Java applications for the Chapter 5 exercises.

-----

### **5.7: Math Method Values**

Here is the value of `x` (as a `double`) after each statement:

a) `x = Math.abs(7.5);`

> **x = 7.5**
> b) `x = Math.floor(7.5);`
> **x = 7.0** (`floor` rounds down)
> c) `x = Math.abs(0.0);`
> **x = 0.0**
> d) `x = Math.ceil(0.0);`
> **x = 0.0**
> e) `x = Math.abs(-6.4);`
> **x = 6.4**
> f) `x = Math.ceil(-6.4);`
> **x = -6.0** (`ceil` rounds up, and -6.0 is "up" from -6.4)
> g) `x = Math.ceil(-Math.abs(-8 + Math.floor(-5.5)));`
>
> 1.  `Math.floor(-5.5)` is `-6.0`
> 2.  `-8 + -6.0` is `-14.0`
> 3.  `Math.abs(-14.0)` is `14.0`
> 4.  `-14.0` (from the `-` sign)
> 5.  `Math.ceil(-14.0)` is `-14.0`
>
> > **x = -14.0**

-----

### **5.8: Parking Charges**

This application uses a `calculateCharges` method to determine the fee. The main loop tracks a running total.

```java
import java.util.Scanner;

public class ParkingCharges {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double totalReceipts = 0.0;
        
        System.out.print("Enter hours parked for customer 1 (or -1 to quit): ");
        double hours = input.nextDouble();
        
        while (hours != -1) {
            double charge = calculateCharges(hours);
            totalReceipts += charge;
            
            System.out.printf("Customer charge: $%.2f%n", charge);
            System.out.printf("Total running receipts: $%.2f%n", totalReceipts);
            
            System.out.print("\nEnter hours parked for next customer (or -1 to quit): ");
            hours = input.nextDouble();
        }
        
        System.out.printf("Total receipts for yesterday: $%.2f%n", totalReceipts);
        input.close();
    }
    
    /**
     * Calculates the parking charge for a customer.
     * @param hours The total hours parked.
     * @return The calculated charge.
     */
    public static double calculateCharges(double hours) {
        double minFee = 2.00;
        double maxFee = 10.00;
        double additionalFee = 0.50;
        double charge = minFee;
        
        // Add fees for hours in excess of 3
        if (hours > 3.0) {
            // Use Math.ceil to round up any "part thereof"
            double additionalHours = Math.ceil(hours - 3.0);
            charge = 2.00 + additionalHours * additionalFee;
        }
        
        // Apply the maximum charge cap
        if (charge > maxFee) {
            charge = maxFee;
        }
        
        // The problem states no car parks longer than 24h, 
        // so we can just cap at the $10 max.
        
        return charge;
    }
}
```

-----

### **5.9: Rounding Numbers (to Integer)**

This application uses the `Math.floor(x + 0.5)` formula to round.

```java
import java.util.Scanner;

public class RoundToInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a double value to round (or -1 to quit): ");
        double original = input.nextDouble();
        
        while (original != -1) {
            // The rounding formula from the book
            double rounded = Math.floor(original + 0.5);
            
            System.out.printf("Original: %.4f%n", original);
            System.out.printf("Rounded:  %.1f%n%n", rounded);
            
            System.out.print("Enter a double value to round (or -1 to quit): ");
            original = input.nextDouble();
        }
        
        input.close();
    }
}
```

-----

### **5.10: Rounding Numbers (to Decimals)**

This application defines four separate rounding methods as requested.

```java
import java.util.Scanner;

public class RoundToDecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a double value to round (or -1 to quit): ");
        double number = input.nextDouble();
        
        while (number != -1) {
            System.out.printf("Original: %f%n", number);
            System.out.printf("Integer:  %.1f%n", roundToInteger(number));
            System.out.printf("Tenths:   %.1f%n", roundToTenths(number));
            System.out.printf("Hundredths: %.2f%n", roundToHundredths(number));
            System.out.printf("Thousandths: %.3f%n%n", roundToThousandths(number));

            System.out.print("Enter a double value to round (or -1 to quit): ");
            number = input.nextDouble();
        }
        
        input.close();
    }

    public static double roundToInteger(double number) {
        return Math.floor(number + 0.5);
    }
    
    public static double roundToTenths(double number) {
        return Math.floor(number * 10 + 0.5) / 10;
    }
    
    public static double roundToHundredths(double number) {
        return Math.floor(number * 100 + 0.5) / 100;
    }
    
    public static double roundToThousandths(double number) {
        return Math.floor(number * 1000 + 0.5) / 1000;
    }
}
```

-----

### **5.12: Random Integer Statements**

Assuming you have `SecureRandom random = new SecureRandom();` and `int n;`

a) **1 ≤ n ≤ 2:** `n = 1 + random.nextInt(2);`
b) **1 ≤ n ≤ 100:** `n = 1 + random.nextInt(100);`
c) **0 ≤ n ≤ 9:** `n = random.nextInt(10);`
d) **1000 ≤ n ≤ 1112:** `n = 1000 + random.nextInt(113);` (range is 1112-1000+1 = 113)
e) **–1 ≤ n ≤ 1:** `n = -1 + random.nextInt(3);` (range is 1 - (-1) + 1 = 3)
f) **–3 ≤ n ≤ 11:** `n = -3 + random.nextInt(15);` (range is 11 - (-3) + 1 = 15)

-----

### **5.13: Random Numbers from Sets**

Assuming `SecureRandom random = new SecureRandom();`

a) **2, 4, 6, 8, 10:**

```java
int n = 2 + 2 * random.nextInt(5); // 2 + (0, 2, 4, 6, 8)
System.out.println(n);
```

b) **3, 5, 7, 9, 11:**

```java
int n = 3 + 2 * random.nextInt(5); // 3 + (0, 2, 4, 6, 8)
System.out.println(n);
```

c) **6, 10, 14, 18, 22:**

```java
int n = 6 + 4 * random.nextInt(5); // 6 + (0, 4, 8, 12, 16)
System.out.println(n);
```

-----

### **5.14: Exponentiation**

```java
import java.util.Scanner;

public class IntegerPower {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter base (integer): ");
        int base = input.nextInt();
        System.out.print("Enter exponent (positive integer): ");
        int exponent = input.nextInt();
        
        System.out.printf("%d to the power of %d is: %d%n", 
            base, exponent, integerPower(base, exponent));
            
        input.close();
    }
    
    /**
     * Calculates base to the power of exponent.
     * @param base The base number.
     * @param exponent The positive, nonzero exponent.
     * @return The result of (base^exponent) as a long.
     */
    public static long integerPower(int base, int exponent) {
        long result = 1;
        
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        
        return result;
    }
}
```

-----

### **5.15: Hypotenuse Calculations**

```java
import java.util.Scanner;

public class HypotenuseCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter length of side 1: ");
        double side1 = input.nextDouble();
        System.out.print("Enter length of side 2: ");
        double side2 = input.nextDouble();
        
        double hyp = hypotenuse(side1, side2);
        System.out.printf("The hypotenuse is: %.2f%n", hyp);
        
        // Example with Triangle 1 from Fig 5.14
        System.out.printf("Triangle 1 (3.0, 4.0): %.1f%n", hypotenuse(3.0, 4.0));
        // Example with Triangle 2 from Fig 5.14
        System.out.printf("Triangle 2 (5.0, 12.0): %.1f%n", hypotenuse(5.0, 12.0));
        // Example with Triangle 3 from Fig 5.14
        System.out.printf("Triangle 3 (8.0, 15.0): %.1f%n", hypotenuse(8.0, 15.0));
        
        input.close();
    }
    
    /**
     * Calculates the hypotenuse of a right triangle.
     * @param side1 Length of the first side.
     * @param side2 Length of the second side.
     * @return The length of the hypotenuse.
     */
    public static double hypotenuse(double side1, double side2) {
        return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
    }
}
```

-----

### **5.16: Multiples**

```java
import java.util.Scanner;

public class TestMultiples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first integer (or -1 to quit): ");
        int first = input.nextInt();
        
        while (first != -1) {
            System.out.print("Enter second integer: ");
            int second = input.nextInt();
            
            if (isMultiple(first, second)) {
                System.out.printf("%d is a multiple of %d.%n%n", second, first);
            } else {
                System.out.printf("%d is NOT a multiple of %d.%n%n", second, first);
            }
            
            System.out.print("Enter first integer (or -1 to quit): ");
            first = input.nextInt();
        }
        input.close();
    }
    
    public static boolean isMultiple(int first, int second) {
        // Check for division by zero
        if (first == 0) {
            return false;
        }
        
        return (second % first == 0);
    }
}
```

-----

### **5.17: Even or Odd**

```java
import java.util.Scanner;

public class TestEvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an integer (or -1 to quit): ");
        int number = input.nextInt();
        
        while (number != -1) {
            if (isEven(number)) {
                System.out.printf("%d is even.%n%n", number);
            } else {
                System.out.printf("%d is odd.%n%n", number);
            }
            
            System.out.print("Enter an integer (or -1 to quit): ");
            number = input.nextInt();
        }
        input.close();
    }
    
    public static boolean isEven(int number) {
        return (number % 2 == 0);
    }
}
```

-----

### **5.18: Displaying a Square of Asterisks**

```java
import java.util.Scanner;

public class SquareOfAsterisks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the side length of the square: ");
        int side = input.nextInt();
        
        squareOfAsterisks(side);
        
        input.close();
    }
    
    public static void squareOfAsterisks(int side) {
        // Loop for rows
        for (int row = 1; row <= side; row++) {
            // Loop for columns
            for (int col = 1; col <= side; col++) {
                System.out.print("*");
            }
            System.out.println(); // Newline after each row
        }
    }
}
```

-----

### **5.19: Displaying a Square of Any Character**

```java
import java.util.Scanner;

public class SquareOfCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the side length of the square: ");
        int side = input.nextInt();
        
        System.out.print("Enter the fill character: ");
        char fill = input.next().charAt(0); // Read the character
        
        squareOfCharacters(side, fill);
        
        input.close();
    }
    
    public static void squareOfCharacters(int side, char fillCharacter) {
        // Loop for rows
        for (int row = 1; row <= side; row++) {
            // Loop for columns
            for (int col = 1; col <= side; col++) {
                System.out.print(fillCharacter);
            }
            System.out.println(); // Newline after each row
        }
    }
}
```

-----

### **5.20: Circle Area**

```java
import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();
        
        System.out.printf("The area of the circle is: %.2f%n", circleArea(radius));
        
        input.close();
    }
    
    public static double circleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }
}
```

-----

### **5.21: Separating Digits**

```java
import java.util.Scanner;

public class DisplayDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an integer between 1 and 99999: ");
        int number = input.nextInt();
        
        if (number < 1 || number > 99999) {
            System.out.println("Number is out of range.");
        } else {
            displayDigits(number);
        }
        
        input.close();
    }
    
    // a) Calculate the integer part of the quotient
    public static int getQuotient(int a, int b) {
        return a / b;
    }
    
    // b) Calculate the integer remainder
    public static int getRemainder(int a, int b) {
        return a % b;
    }
    
    // c) Display the digits
    public static void displayDigits(int number) {
        // Start with the largest possible divisor for 99999
        int divisor = 10000;
        
        // Find the first divisor that fits the number
        // e.g., for 4562, it will skip 10000 and start at 1000
        while (getQuotient(number, divisor) == 0 && divisor > 1) {
            divisor = getQuotient(divisor, 10);
        }
        
        // Loop and print each digit
        while (divisor > 0) {
            // Get the leftmost digit
            int digit = getQuotient(number, divisor);
            
            System.out.print(digit + "  ");
            
            // Remove the leftmost digit from the number
            number = getRemainder(number, divisor);
            
            // Go to the next divisor
            divisor = getQuotient(divisor, 10);
        }
        System.out.println();
    }
}
```

-----

### **5.22: Temperature Conversions**

```java
import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("1. Convert Fahrenheit to Celsius");
        System.out.println("2. Convert Celsius to Fahrenheit");
        System.out.print("Choose your option (1 or 2): ");
        int choice = input.nextInt();
        
        if (choice == 1) {
            System.out.print("Enter temperature in Fahrenheit: ");
            double tempF = input.nextDouble();
            System.out.printf("%.1f F is %.1f C%n", tempF, celsius(tempF));
        } else if (choice == 2) {
            System.out.print("Enter temperature in Celsius: ");
            double tempC = input.nextDouble();
            System.out.printf("%.1f C is %.1f F%n", tempC, fahrenheit(tempC));
        } else {
            System.out.println("Invalid choice.");
        }
        
        input.close();
    }
    
    public static double celsius(double fahrenheit) {
        return 5.0 / 9.0 * (fahrenheit - 32);
    }
    
    public static double fahrenheit(double celsius) {
        return 9.0 / 5.0 * celsius + 32;
    }
}
```

-----

### **5.23: Find the Minimum**

```java
import java.util.Scanner;

public class FindMinimum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first floating-point number: ");
        double n1 = input.nextDouble();
        System.out.print("Enter second floating-point number: ");
        double n2 = input.nextDouble();
        System.out.print("Enter third floating-point number: ");
        double n3 = input.nextDouble();
        
        double min = minimum3(n1, n2, n3);
        System.out.printf("The smallest number is: %f%n", min);
        
        input.close();
    }
    
    public static double minimum3(double n1, double n2, double n3) {
        // Nest calls to Math.min
        return Math.min(n1, Math.min(n2, n3));
    }
}
```

-----

### **5.24: Perfect Numbers**

```java
public class PerfectNumbers {
    public static void main(String[] args) {
        System.out.println("Finding perfect numbers between 1 and 1000:");
        
        for (int i = 1; i <= 1000; i++) {
            if (isPerfect(i)) {
                System.out.printf("%d is a perfect number.%n", i);
                printFactors(i); // Call helper to show factors
                System.out.println();
            }
        }
    }
    
    public static boolean isPerfect(int number) {
        if (number < 1) {
            return false;
        }
        
        int sum = 1; // Start with 1, as it's always a factor
        
        // Find all other factors up to half the number
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        
        return (sum == number);
    }
    
    // Helper method to display the factors
    public static void printFactors(int number) {
        System.out.print("Factors: 1");
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                System.out.print(" + " + i);
            }
        }
    }
}
```

-----

### **5.25: Prime Numbers**

```java
public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Finding prime numbers less than 10,000:");
        
        int count = 0;
        for (int i = 1; i < 10000; i++) {
            if (isPrime(i)) {
                System.out.print(i + "\t");
                count++;
                if (count % 10 == 0) { // Newline every 10 numbers
                    System.out.println();
                }
            }
        }
        System.out.printf("%n%nFound %d prime numbers.%n", count);
    }
    
    public static boolean isPrime(int number) {
        // 1 and 0 are not prime
        if (number <= 1) {
            return false;
        }
        
        // Optimized check: only need to go up to the square root
        for (int i = 2; i <= Math.sqrt(number); i++) {
            // If it's divisible by any number, it's not prime
            if (number % i == 0) {
                return false;
            }
        }
        
        // If the loop finishes, it's prime
        return true;
    }
}
```

-----

### **5.26: Reversing Digits**

```java
import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an integer to reverse: ");
        int number = input.nextInt();
        
        System.out.printf("The reversed number is: %d%n", reverseDigits(number));
        
        input.close();
    }
    
    public static int reverseDigits(int number) {
        int reversedNumber = 0;
        
        while (number != 0) {
            int lastDigit = number % 10; // Get the last digit
            reversedNumber = (reversedNumber * 10) + lastDigit;
            number = number / 10; // Remove the last digit
        }
        
        return reversedNumber;
    }
}
```

-----

### **5.27: Greatest Common Divisor (GCD)**

```java
import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first integer: ");
        int a = input.nextInt();
        System.out.print("Enter second integer: ");
        int b = input.nextInt();
        
        System.out.printf("The GCD of %d and %d is: %d%n", a, b, gcd(a, b));
        
        input.close();
    }
    
    // Euclid's algorithm for finding GCD
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
```

-----

### **5.28: Quality Points**

```java
import java.util.Scanner;

public class QualityPoints {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter student's average (0-100): ");
        int average = input.nextInt();
        
        System.out.printf("Quality point is: %d%n", qualityPoints(average));
        
        input.close();
    }
    
    public static int qualityPoints(int average) {
        if (average >= 90) {
            return 4;
        } else if (average >= 80) {
            return 3;
        } else if (average >= 70) {
            return 2;
        } else if (average >= 60) {
            return 1;
        } else {
            return 0;
        }
    }
}
```

-----

### **5.29: Coin Tossing**

```java
import java.security.SecureRandom;
import java.util.Scanner;

public class CoinTossing {
    // Enum for coin sides
    private enum Coin { HEADS, TAILS }
    
    // Random object shared by all methods
    private static final SecureRandom random = new SecureRandom();
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int headsCount = 0;
        int tailsCount = 0;
        int choice = 0;
        
        while (choice != 2) {
            System.out.println("1. Toss Coin");
            System.out.println("2. Exit");
            System.out.print("Choose an option: ");
            choice = input.nextInt();
            
            if (choice == 1) {
                Coin result = flip();
                if (result == Coin.HEADS) {
                    headsCount++;
                    System.out.println("Landed on HEADS");
                } else {
                    tailsCount++;
                    System.out.println("Landed on TAILS");
                }
                
                System.out.printf("Total Heads: %d | Total Tails: %d%n%n", 
                    headsCount, tailsCount);
            }
        }
        input.close();
    }
    
    public static Coin flip() {
        // random.nextInt(2) returns 0 or 1
        if (random.nextInt(2) == 0) {
            return Coin.HEADS;
        } else {
            return Coin.TAILS;
        }
    }
}
```

-----

### **5.30 & 5.31: Guess the Number (with Guess Count)**

This combines both exercises.

```java
import java.security.SecureRandom;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SecureRandom random = new SecureRandom();
        String playAgain;
        
        do {
            int numberToGuess = 1 + random.nextInt(1000);
            int guess = 0;
            int guessCount = 0;
            
            System.out.println("Guess a number between 1 and 1000");
            
            while (guess != numberToGuess) {
                System.out.print("Enter your guess: ");
                guess = input.nextInt();
                guessCount++;
                
                if (guess < numberToGuess) {
                    System.out.println("Too low. Try again.");
                } else if (guess > numberToGuess) {
                    System.out.println("Too high. Try again.");
                }
            }
            
            System.out.printf("Congratulations. You guessed the number in %d guesses!%n", guessCount);
            
            // Logic for Exercise 5.31
            if (guessCount < 10) {
                System.out.println("Either you know the secret or you got lucky!");
            } else if (guessCount == 10) {
                System.out.println("Aha! You know the secret!");
            } else {
                System.out.println("You should be able to do better!");
            }
            
            System.out.print("\nPlay again? (yes/no): ");
            playAgain = input.next();
            
        } while (playAgain.equalsIgnoreCase("yes"));
        
        System.out.println("Thanks for playing!");
        input.close();
    }
}
```

-----

### **5.32: Distance Between Points**

```java
import java.util.Scanner;

public class DistanceCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter x1: ");
        double x1 = input.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = input.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = input.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = input.nextDouble();
        
        double d = distance(x1, y1, x2, y2);
        System.out.printf("The distance between the points is: %.2f%n", d);
        
        input.close();
    }
    
    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
```

-----

### **5.33: Craps Game Modification**

(This assumes you have a `playCraps()` method from Fig. 5.8 that returns an enum `Status.WIN` or `Status.LOSE`. The code below provides the new `main` logic.)

```java
import java.security.SecureRandom;
import java.util.Scanner;

public class CrapsWagering {
    // We must assume the enum Status and the playCraps() method exist
    // as defined in Fig. 5.8
    // private enum Status { CONTINUE, WIN, LOSE }
    // public static Status playCraps() { ... }
    
    private static final SecureRandom random = new SecureRandom();
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bankBalance = 1000;
        
        while (bankBalance > 0) {
            System.out.printf("Your bank balance is: $%d%n", bankBalance);
            System.out.print("Enter your wager (or 0 to quit): ");
            int wager = input.nextInt();
            
            if (wager == 0) break;
            
            // Validate wager
            while (wager > bankBalance) {
                System.out.print("Wager exceeds balance. Enter a valid wager: ");
                wager = input.nextInt();
            }
            
            // Play the game (we assume this method exists)
            // Status gameStatus = playCraps(); 
            
            // For testing, let's simulate a win/loss
            Status gameStatus = (random.nextInt(2) == 0) ? Status.WIN : Status.LOSE;

            if (gameStatus == Status.WIN) {
                bankBalance += wager;
                System.out.println("You win!");
            } else {
                bankBalance -= wager;
                System.out.println("You lose!");
            }
            
            System.out.printf("New balance: $%d%n", bankBalance);
            
            if (bankBalance == 0) {
                System.out.println("Sorry. You busted!");
            } else {
                chatter(); // Display a random message
            }
            System.out.println("--------------------");
        }
        
        System.out.println("Game over. Final balance: $" + bankBalance);
        input.close();
    }
    
    public static void chatter() {
        switch (random.nextInt(3)) {
            case 0:
                System.out.println("Oh, you're going for broke, huh?");
                break;
            case 1:
                System.out.println("Aw c'mon, take a chance!");
                break;
            case 2:
                System.out.println("You're up big. Now's the time to cash in!");
                break;
        }
    }
    
    // Mock enum and Status values for this example to be self-contained
    private enum Status { CONTINUE, WIN, LOSE }
}
```

-----

### **5.34: Table of Binary, Octal, Hexadecimal**

```java
public class NumberSystemsTable {
    public static void main(String[] args) {
        System.out.println("Decimal\tBinary\t\tOctal\tHexadecimal");
        System.out.println("-------\t------\t\t-----\t-----------");
        
        for (int i = 1; i <= 256; i++) {
            System.out.printf("%d\t%s\t\t%s\t%s%n",
                i,
                Integer.toBinaryString(i),
                Integer.toOctalString(i),
                Integer.toHexString(i)
            );
        }
    }
}
```

-----

### **5.35 - 5.39: Computer-Assisted Instruction**

(This is one application that combines all the exercises from 5.35 to 5.39, as they build on each other.)

```java
import java.security.SecureRandom;
import java.util.Scanner;

public class ComputerAssistedInstruction {

    private static final SecureRandom random = new SecureRandom();
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        
        while (true) { // Main loop to let new students play
            System.out.println("--- New Student Session ---");
            
            // 5.38: Get difficulty level
            System.out.print("Enter difficulty level (1, 2, 3...): ");
            int difficulty = input.nextInt();
            
            // 5.39: Get problem type
            System.out.println("Enter problem type:");
            System.out.println("1: Addition");
            System.out.println("2: Subtraction");
            System.out.println("3: Multiplication");
            System.out.println("4: Division");
            System.out.println("5: Mixed");
            System.out.print("Choice: ");
            int problemType = input.nextInt();

            int correctCount = 0;
            int questionCount = 0;

            // 5.37: Ask 10 questions
            while (questionCount < 10) {
                if (askQuestion(difficulty, problemType)) {
                    correctCount++;
                }
                questionCount++;
            }

            // 5.37: Check performance
            double percentage = (double) correctCount / 10.0;
            if (percentage < 0.75) {
                System.out.println("\nPlease ask your teacher for extra help.");
            } else {
                System.out.println("\nCongratulations, you are ready to go to the next level!");
            }
            System.out.println("--------------------------------\n");
        }
    }

    /**
     * 5.38: Generates a random number based on difficulty level
     */
    private static int generateNumber(int difficulty) {
        int max = (int) Math.pow(10, difficulty) - 1; // Level 1: 0-9, Level 2: 0-99
        return random.nextInt(max + 1);
    }

    /**
     * 5.35, 5.38, 5.39: Asks one question
     * @return true if answered correctly, false otherwise
     */
    private static boolean askQuestion(int difficulty, int type) {
        int n1 = generateNumber(difficulty);
        int n2 = generateNumber(difficulty);
        
        // 5.39: Handle mixed case
        if (type == 5) {
            type = 1 + random.nextInt(4); // Randomly pick 1, 2, 3, or 4
        }
        
        String operator = "";
        double correctAnswer = 0.0;
        
        switch (type) {
            case 1: // Addition
                operator = "+";
                correctAnswer = n1 + n2;
                break;
            case 2: // Subtraction
                operator = "-";
                correctAnswer = n1 - n2;
                break;
            case 3: // Multiplication
                operator = "*";
                correctAnswer = n1 * n2;
                break;
            case 4: // Division
                operator = "/";
                // Prevent division by zero
                if (n2 == 0) {
                    n2 = 1; // Change 0 to 1
                }
                // We'll do integer division for this, so no decimals
                correctAnswer = (double) n1 / n2; 
                System.out.println("(Round answer to two decimal places if needed)");
                break;
        }

        System.out.printf("How much is %d %s %d? ", n1, operator, n2);
        
        double guess;
        // 5.35: Loop until correct (modified by 5.37 to only ask once)
        guess = input.nextDouble();

        // Allow for small floating point differences in division
        if (Math.abs(guess - correctAnswer) < 0.01) { 
            // 5.36: Give positive response
            displayPositiveResponse();
            return true;
        } else {
            // 5.36: Give negative response
            displayNegativeResponse();
            System.out.printf("The correct answer was %.2f%n", correctAnswer);
            return false;
        }
    }

    /**
     * 5.36: Displays a random positive response
     */
    private static void displayPositiveResponse() {
        switch (random.nextInt(4)) {
            case 0: System.out.println("Very good!"); break;
            case 1: System.out.println("Excellent!"); break;
            case 2: System.out.println("Nice work!"); break;
            case 3: System.out.println("Keep up the good work!"); break;
        }
    }

    /**
     * 5.36: Displays a random negative response
     */
    private static void displayNegativeResponse() {
        switch (random.nextInt(4)) {
            case 0: System.out.println("No. Please try again."); break;
            case 1: System.out.println("Wrong. Try once more."); break;
            case 2: System.out.println("Don't give up!"); break;
            case 3: System.out.println("No. Keep trying."); break;
        }
}
```