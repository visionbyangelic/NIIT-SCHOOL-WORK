## Chapter 3
 
### Exercise 1
 
**3.10 Compare and contrast the if single-selection statement and the while repetition statement. How are these two statements similar? How are they different?**
 
* **Similarity:** Both the `if` and `while` statements use a **boolean condition** to determine whether to execute a block of code.
* **Difference:**
    * The `if` statement is a **selection statement**. It executes the code block *at most once* (0 or 1 time). If the condition is true, it runs the code, and then the program moves on.
    * The `while` statement is a **repetition statement** (or loop). It executes the code block *repeatedly* (0 or more times) *as long as* the condition remains true. After the block runs, it re-checks the condition and runs the block again if it's still true.
 
---

**3.11 Explain what happens when a Java program attempts to divide one integer by another. What happens to the fractional part of the calculation? How can you avoid that outcome?**
 
* **What happens:** When Java divides two integers, it performs **integer division**.
* **Fractional part:** The fractional part of the result is **truncated** (discarded or thrown away). For example, `7 / 4` evaluates to `1`, not `1.75`. `99 / 100` evaluates to `0`.
* **How to avoid:** To get a floating-point (decimal) result, you must cast at least one of the integer operands to a floating-point type, such as `double`.
    * Example: `double result = (double) 7 / 4;`
    * This forces the entire calculation to be a floating-point one, and `result` will be `1.75`.
 
---

**3.12 Describe the two ways in which control statements can be combined.**
 
1.  **Stacking (Sequencing):** This is when control statements are placed one after another in sequence. The program executes them in the order they appear.
2.  **Nesting:** This is when one control statement is placed *inside* the body of another. For example, an `if` statement can be nested inside a `while` loop, or another `if` statement can be nested inside an `if`'s `else` block.
 
---

**3.13 What type of repetition would be appropriate for calculating the sum of the first 100 positive integers? What type would be appropriate for calculating the sum of an arbitrary number of positive integers? Briefly describe how each of these tasks could be performed.**
 
1.  **Sum of first 100:** This requires **counter-controlled repetition**. We know exactly how many times we need to loop (100).
    * **How:** Use a `while` (or `for`) loop with a counter variable that runs from 1 to 100. In each iteration, add the counter's value to a running `total`.
 
2.  **Sum of arbitrary number:** This requires **sentinel-controlled repetition**. We do not know how many numbers the user will enter.
    * **How:** Use a `while` loop that prompts the user to enter a number. The loop continues as long as the user's input is not a special **sentinel value** (e.g., -1). For each valid number entered, add it to a running `total`. When the user enters -1, the loop terminates.
 
---

**3.14 What is the difference between preincrementing and postincrementing a variable?**
 
Both `++x` (preincrement) and `x++` (postincrement) add 1 to the variable `x`. The difference is in the *value* they return within the expression they are used.
 
* **Preincrement (`++x`):** The variable `x` is incremented **first**, and the *new* (incremented) value is used in the expression.
    * `int x = 5;`
    * `System.out.println(++x);` // Prints 6 (x is changed to 6, then 6 is printed)
 
* **Postincrement (`x++`):** The **original** (unincremented) value of `x` is used in the expression, and *then* the variable `x` is incremented.
    * `int x = 5;`
    * `System.out.println(x++);` // Prints 5 (the original value 5 is printed, then x is changed to 6)
 
---

**3.15 Identify and correct the errors in each of the following pieces of code.**
 
a)
```java
a) if (age >= 65); 
System.out.println("Age is greater than or equal to 65"); 
else System.out.println("Age is less than 65)"; 

````

  * **Error 1 (Compiler Error):** The `else` statement is not associated with an `if`.
  * **Error 2 (Logical Error):** The semicolon (`;`) after `if (age >= 65)` makes the `if` statement's body *empty*. The `System.out.println` is a separate statement, not part of the `if`.
  * **Error 3 (Typo):** The closing parenthesis in the `else` block's string should be a quote.
  
  * **Correction:**
    ```java
    if (age >= 65) {
        System.out.println("Age is greater than or equal to 65");
    } 
    else {
        System.out.println("Age is less than 65");
    }
    ```

b)

```java
int x = 1, total;
while (x <= 10) {
    total += x;
    ++x;
}
```

  * **Error (Compiler Error):** The variable `total` is used in the expression `total += x` before it has been initialized.
  * **Correction:** Initialize `total` to 0.
    ```java
    int x = 1, total = 0; // Initialize total
    while (x <= 10) {
        total += x;
        ++x;
    }
    ```

c)

```java
while (x <= 100)
    total += x;
    ++x;
```

  * **Error (Logical Error / Infinite Loop):** Without curly braces `{ }`, only the first statement (`total += x;`) is part of the `while` loop's body. The `++x;` statement is *outside* the loop. If `x` starts less than or equal to 100, the loop will never terminate because `x` is never incremented.
  * **Correction:** Add curly braces to include both statements in the loop body.
    ```java
    while (x <= 100) {
        total += x;
        ++x;
    }
    ```

d)

```java
while (y > 0) {
    System.out.println(y);
    ++y;
}
```

  * **Error (Logical Error / Infinite Loop):** If the loop is entered (i.e., `y` is positive), the variable `y` is *incremented* (`++y;`). This means `y` will become *more* positive, and the condition `y > 0` will *always* be true, causing an infinite loop.
  * **Correction:** The variable should likely be *decremented*.
    ```java
    while (y > 0) {
        System.out.println(y);
        --y; // Decrement y
    }
    ```

-----

### Exercise 2

**3.17 (Gas Mileage)**

```java
import java.util.Scanner;

public class GasMileage {
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
```

-----

**3.18 (Credit Limit Calculator)**

```java
import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter account number (or -1 to quit): ");
        int accountNumber = input.nextInt();

        while (accountNumber != -1) {
            System.out.print("Enter beginning balance: ");
            int beginningBalance = input.nextInt();
            
            System.out.print("Enter total charges this month: ");
            int totalCharges = input.nextInt();
            
            System.out.print("Enter total credits this month: ");
            int totalCredits = input.nextInt();
            
            System.out.print("Enter allowed credit limit: ");
            int creditLimit = input.nextInt();
            
            // Calculate new balance
            int newBalance = beginningBalance + totalCharges - totalCredits;
            
            System.out.printf("New balance for account %d is %d%n", accountNumber, newBalance);
            
            // Check if credit limit is exceeded
            if (newBalance > creditLimit) {
                System.out.println("Credit limit exceeded.");
            }
            
            System.out.println(); // Blank line for spacing
            System.out.print("Enter account number (or -1 to quit): ");
            accountNumber = input.nextInt();
        }
        
        input.close();
    }
}
```

-----

**3.19 (Sales Commission Calculator)**

```java
import java.util.Scanner;

public class SalesCommission {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double grossSales = 0.0;
        
        System.out.println("Enter item number sold (1-4, or -1 to finish):");
        System.out.println("Item 1: $239.99");
        System.out.println("Item 2: $129.75");
        System.out.println("Item 3: $99.95");
        System.out.println("Item 4: $350.89");
        
        System.out.print("Enter item number (-1 to quit): ");
        int itemNumber = input.nextInt();
        
        while (itemNumber != -1) {
            switch (itemNumber) {
                case 1:
                    grossSales += 239.99;
                    break;
                case 2:
                    grossSales += 129.75;
                    break;
                case 3:
                    grossSales += 99.95;
                    break;
                case 4:
                    grossSales += 350.89;
                    break;
                default:
                    System.out.println("Invalid item number. Please enter 1-4.");
                    break;
            }
            
            System.out.print("Enter item number (-1 to quit): ");
            itemNumber = input.nextInt();
        }
        
        // Calculate earnings
        double commission = 0.09 * grossSales;
        double earnings = 200.00 + commission;
        
        System.out.printf("%nTotal gross sales: $%.2f%n", grossSales);
        System.out.printf("Total earnings: $%.2f%n", earnings);
        
        input.close();
    }
}
```

-----

**3.20 (Salary Calculator)**

```java
import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int counter = 0;
        
        while (counter < 3) {
            System.out.printf("Enter details for employee %d%n", counter + 1);
            
            System.out.print("Enter hours worked: ");
            double hours = input.nextDouble();
            
            System.out.print("Enter hourly rate: ");
            double rate = input.nextDouble();
            
            double grossPay;
            
            // Calculate gross pay
            if (hours <= 40) {
                grossPay = hours * rate; // Straight time
            } else {
                double basePay = 40 * rate;
                double overtimeHours = hours - 40;
                double overtimePay = overtimeHours * rate * 1.5; // Time and a half
                grossPay = basePay + overtimePay;
            }
            
            System.out.printf("Employee %d's gross pay is $%.2f%n%n", (counter + 1), grossPay);
            
            counter = counter + 1;
        }
        
        input.close();
    }
}
```

-----

**3.21 (Find the Largest Number)**

**Pseudocode:**

```
Set counter to 1
Prompt user to enter the first number
Set largest to the first number

While counter is less than 10
    Prompt user to enter the next number
    Read the number

    If number is greater than largest
        Set largest to number
    
    Add 1 to counter

Print "The largest number is:", largest
```

**Java Application:**

```java
import java.util.Scanner;

public class FindLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int counter = 1;
        int number;
        int largest;
        
        // Input the first number to initialize 'largest'
        System.out.print("Enter integer 1: ");
        largest = input.nextInt();
        
        // Loop for the remaining 9 numbers
        while (counter < 10) {
            counter = counter + 1; // Increment counter
            
            System.out.printf("Enter integer %d: ", counter);
            number = input.nextInt();
            
            // If the new number is larger, update largest
            if (number > largest) {
                largest = number;
            }
        }
        
        System.out.printf("%nLargest integer is: %d%n", largest);
        input.close();
    }
}
```

-----

**3.22 (Tabular Output)**

```java
public class TabularOutput {
    public static void main(String[] args) {
        int n = 1;
        
        // Print the header
        System.out.println("N\t10*N\t100*N\t1000*N");
        System.out.println("---------------------------------");
        
        // Loop from 1 to 5
        while (n <= 5) {
            System.out.printf("%d\t%d\t%d\t%d%n", 
                n, (10 * n), (100 * n), (1000 * n));
            n = n + 1;
        }
    }
}
```

-----

**3.23 (Find the Two Largest Numbers)**

```java
import java.util.Scanner;

public class FindTwoLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int largest;
        int secondLargest;
        
        // Input first number
        System.out.print("Enter integer 1: ");
        int number = input.nextInt();
        largest = number;
        
        // Input second number
        System.out.print("Enter integer 2: ");
        number = input.nextInt();
        
        // Compare first two numbers to set largest and secondLargest
        if (number > largest) {
            secondLargest = largest;
            largest = number;
        } else {
            secondLargest = number;
        }
        
        int counter = 3; // Start counter at 3
        
        // Loop for the remaining 8 numbers
        while (counter <= 10) {
            System.out.printf("Enter integer %d: ", counter);
            number = input.nextInt();
            
            if (number > largest) {
                secondLargest = largest; // Old largest is now second largest
                largest = number;       // New number is largest
            } else if (number > secondLargest) {
                secondLargest = number; // New number is second largest
            }
            
            counter = counter + 1;
        }
        
        System.out.printf("%nLargest integer is: %d%n", largest);
        System.out.printf("Second largest integer is: %d%n", secondLargest);
        
        input.close();
    }
}
```

-----

**3.24 (Validating User Input)**

> (This exercise modifies Fig 3.10, which is the `Analysis.java` program. The goal is to ensure the user can only enter 1 or 2.)

```java
// Modified Analysis.java program from Fig. 3.10
import java.util.Scanner;

public class AnalysisModified {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int passes = 0;
        int failures = 0;
        int studentCounter = 1;

        while (studentCounter <= 10) {
            System.out.print("Enter result (1 = pass, 2 = fail): ");
            int result = input.nextInt();

            // *** START OF MODIFICATION ***
            // Loop until user enters a valid 1 or 2
            while (result != 1 && result != 2) {
                System.out.println("Invalid input.");
                System.out.print("Enter result (1 = pass, 2 = fail): ");
                result = input.nextInt();
            }
            // *** END OF MODIFICATION ***

            if (result == 1) {
                passes = passes + 1;
            } else {
                failures = failures + 1;
            }

            studentCounter = studentCounter + 1;
        }

        System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);

        if (passes > 8) {
            System.out.println("Bonus to instructor!");
        }
        
        input.close();
    }
}
```

-----

**3.25 (Checkerboard Pattern of Asterisks)**

```java
public class Checkerboard {
    public static void main(String[] args) {
        int row = 1; // Start at row 1
        
        while (row <= 8) {
            // If it's an even-numbered row, print a leading space
            if (row % 2 == 0) {
                System.out.print(" ");
            }
            
            int col = 1;
            while (col <= 8) {
                System.out.print("* ");
                col = col + 1;
            }
            
            System.out.println(); // Move to the next line
            row = row + 1;
        }
    }
}
```

-----

### Making a Difference

**3.38 (Enforcing Privacy with Cryptography)**

**Encryptor Application:**

```java
import java.util.Scanner;

public class Encryptor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a four-digit integer: ");
        int number = input.nextInt();
        
        // Isolate each digit
        int d1 = number / 1000;
        int d2 = (number % 1000) / 100;
        int d3 = (number % 100) / 10;
        int d4 = number % 10;
        
        // Encrypt each digit
        int ed1 = (d1 + 7) % 10;
        int ed2 = (d2 + 7) % 10;
        int ed3 = (d3 + 7) % 10;
        int ed4 = (d4 + 7) % 10;
        
        // Swap 1st with 3rd, and 2nd with 4th (Note: we use the encrypted digits)
        // The encrypted digits are now ed3, ed4, ed1, ed2
        
        System.out.printf("Encrypted integer is: %d%d%d%d%n", ed3, ed4, ed1, ed2);
        
        input.close();
    }
}
```

**Decryptor Application:**

```java
import java.util.Scanner;

public class Decryptor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter encrypted four-digit integer: ");
        int encryptedNumber = input.nextInt();
        
        // Isolate encrypted digits
        int ed3 = encryptedNumber / 1000;
        int ed4 = (encryptedNumber % 1000) / 100;
        int ed1 = (encryptedNumber % 100) / 10;
        int ed2 = encryptedNumber % 10;
        
        // Decrypt each digit (reverse of (d + 7) % 10 is (ed + 3) % 10)
        int d1 = (ed1 + 3) % 10;
        int d2 = (ed2 + 3) % 10;
        int d3 = (ed3 + 3) % 10;
        int d4 = (ed4 + 3) % 10;
        
        // Digits are already in original order d1, d2, d3, d4
        System.out.printf("Decrypted integer is: %d%d%d%d%n", d1, d2, d3, d4);
        
        input.close();
    }
}
```

-----

**3.39 (World Population Growth)**

```java
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
```
