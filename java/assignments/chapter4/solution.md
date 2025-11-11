Here are the solutions for the Chapter 4 exercises, formatted in Markdown.

-----

## Exercise 1

**a) Find the error:**

```java
   i = 1;
   while (i <= 10);
      ++i;
   }
```

  * **Error 1 (Infinite Loop):** The semicolon (`;`) after the `while` condition. This creates an empty body for the loop. The code will infinitely loop with `i` as 1 and never execute `++i;`.
  * **Error 2 (Syntax Error):** The closing brace `}` has no matching opening brace `{`.
  * **Correction:** Remove the semicolon and add proper braces for the loop body.

<!-- end list -->

```java
   int i = 1; // Assume i needs to be declared
   while (i <= 10) {
      ++i;
   }
```

-----

**b) Find the error:**

```java
   for (k = 0.1; k != 1.0; k += 0.1)
      System.out.println(k);
```

  * **Error (Logical Error):** Using floating-point numbers (like `double`) for loop control, especially with the `!=` operator, is very bad practice. Due to how computers store floating-point numbers, `k` may never be *exactly* `1.0`. It might be `0.999999...` or `1.000000...1`, causing an infinite loop.
  * **Correction:** Use an integer for the loop counter and calculate the `double` value inside.

<!-- end list -->

```java
   // Prints 0.1, 0.2, ..., 1.0
   for (int k = 1; k <= 10; k++) {
      System.out.println(k / 10.0);
   }
```

-----

**c) Find the error:**

```java
   switch (n) {
      case 1:
         System.out.println("The number is 1");
      case 2:
         System.out.println("The number is 2");
         break;
      default:
         System.out.println("The number is not 1 or 2");
         break;
   }
```

  * **Error (Logical Error):** A `break;` statement is missing in `case 1:`. If `n` is 1, the code will "fall through" and execute the code for `case 2:` as well, printing both "The number is 1" and "The number is 2".
  * **Correction:** Add a `break;` after the `case 1:` statement.

<!-- end list -->

```java
   switch (n) {
      case 1:
         System.out.println("The number is 1");
         break; // Added break
      case 2:
         System.out.println("The number is 2");
         break;
      default:
         System.out.println("The number is not 1 or 2");
         break;
   }
```

-----

**d) Find the error:**

```java
   // The following code should print the values 1 to 10:
   n = 1;
   while (n < 10)
      System.out.println(n++);
```

  * **Error (Logical Error):** The loop condition is `n < 10`. When `n` is `9`, the loop runs, `n++` causes `9` to be printed, and `n` becomes `10`. The condition `10 < 10` is then false, so the loop stops. It only prints the values from 1 to 9.
  * **Correction:** Change the loop condition to `n <= 10`.

<!-- end list -->

```java
   int n = 1; // Assume n needs to be declared
   while (n <= 10) { // Changed < to <=
      System.out.println(n++);
   }
```

-----

-----

## Exercise 2

**4.5 Describe the four basic elements of counter-controlled repetition.**

1.  **Control variable (or loop counter):** The variable used to control the loop's execution (e.g., `int i`).
2.  **Initial value:** The starting value of the control variable (e.g., `i = 1`).
3.  **Loop-continuation condition:** A condition, involving the control variable, that determines if the loop should continue (e.g., `i <= 10`).
4.  **Increment (or decrement):** The step by which the control variable is modified in each iteration (e.g., `i++` or `i--`).

-----

**4.6 Compare and contrast the `while` and `for` repetition statements.**

  * **Similarity:** Both `while` and `for` are pre-test loops, meaning they check their condition *before* executing the loop body. If the condition is false initially, the loop body never runs.
  * **Contrast:**
      * **`for` loop:** Best for **counter-controlled** repetition. It's compact, as it puts the initialization, condition, and increment all in one line (e.g., `for (int i = 1; i <= 10; i++)`). You use it when you *know* how many times you need to loop.
      * **`while` loop:** Best for **sentinel-controlled** repetition. It only has a condition (e.g., `while (input != -1)`). You use it when you *don't know* how many times you need to loop, and the loop continues until some condition is met.

-----

**4.7 Discuss a situation in which it would be more appropriate to use a `do…while` statement than a `while` statement. Explain why.**

A `do...while` statement is perfect for **input validation** or a **menu system**.

  * **Situation:** You want to show a user a menu of options (e.g., "1. Play Game, 2. View Scores, 3. Quit") and ask for their choice.
  * **Why `do...while` is better:** You need the loop body (displaying the menu and getting the input) to run **at least once** *before* you check the condition (which would be `while (choice != 3)`). A `while` loop would check the condition first, which doesn't make sense if the user hasn't seen the menu yet.

-----

**4.8 Compare and contrast the `break` and `continue` statements.**

  * **`break`:** This statement immediately **exits the entire loop** (`while`, `for`, `do...while`, or `switch`). Program control resumes at the first statement *after* the loop.
  * **`continue`:** This statement **skips the rest of the current iteration** of the loop. It does *not* exit the loop. Instead, it jumps to the loop's next iteration (re-checking the condition in `while`/`do...while` or running the increment in a `for` loop).

-----

**4.9 Find and correct the error(s) in each of the following segments of code:**

**a)**

```java
For (i = 100, i >= 1, i++)
   System.out.println(i);
```

  * **Error 1:** `For` should be lowercase `for`. Java is case-sensitive.
  * **Error 2:** The loop uses commas (`,`) to separate its parts. It should use semicolons (`;`).
  * **Error 3 (Logical Error):** `i++` will increment `i`. Since `i` starts at 100, it will always be `>= 1`, causing an **infinite loop**. The increment should be `i--`.
  * **Correction:**
    ```java
    for (int i = 100; i >= 1; i--) { // Declared i, used ;, used --
       System.out.println(i);
    }
    ```

**b)**

```java
switch (value % 2) {
   case 0:
      System.out.println("Even integer");
   case 1:
      System.out.println("Odd integer");
}
```

  * **Error (Logical Error):** Missing `break;` in `case 0:`. If the `value` is even, it will print "Even integer" and then "fall through" and also print "Odd integer".
  * **Correction:**
    ```java
    switch (value % 2) {
       case 0:
          System.out.println("Even integer");
          break; // Added break
       case 1:
          System.out.println("Odd integer");
          break; // Good practice to add one here too
    }
    ```

**c)**

```java
// The following code should output the odd integers from 19 to 1:
for (i = 19; i >= 1; i += 2)
   System.out.println(i);
```

  * **Error (Logical Error):** `i += 2` will increment `i` (19, 21, 23...). This will never meet the condition `i >= 1` to stop (it's an infinite loop). The increment should be `i -= 2`.
  * **Correction:**
    ```java
    for (int i = 19; i >= 1; i -= 2) { // Declared i, used -=
       System.out.println(i);
    }
    ```

**d)**

```java
// The following code should output the even integers from 2 to 100:
counter = 2;
do {
   System.out.println(counter);
   counter += 2;
} While (counter < 100);
```

  * **Error 1:** `While` should be lowercase `while`.
  * **Error 2 (Logical Error):** The condition is `counter < 100`. When `counter` is 98, it prints `98`, becomes `100`. The condition `100 < 100` is false, so the loop stops. It never prints 100.
  * **Correction:**
    ```java
    int counter = 2; // Declared counter
    do {
       System.out.println(counter);
       counter += 2;
    } while (counter <= 100); // Changed to while and <=
    ```

-----

**4.10 What does the following program do?**

```java
public class Printing {
   public static void main(String[] args) {
      for (int i = 1; i <= 10; i++) {
         for (int j = 1; j <= 5; j++)
            System.out.print('@');
         
         System.out.println();
      }
   }
}
```

  * **Answer:** The program prints a rectangle of `@` symbols.
  * The **outer loop** (`i`) runs 10 times, controlling the **rows**.
  * The **inner loop** (`j`) runs 5 times for each row, printing `@` without a newline.
  * The `System.out.println();` runs after the inner loop finishes, moving the cursor to the next line.
  * **Output:** It prints 10 rows, each with 5 `@` symbols.
    ```
    @@@@@
    @@@@@
    @@@@@
    @@@@@
    @@@@@
    @@@@@
    @@@@@
    @@@@@
    @@@@@
    @@@@@
    ```

-----

**4.11 (Find the Smallest Value) Write an application that finds the smallest of several integers. Assume that the first value read specifies the number of values to input from the user.**

```java
import java.util.Scanner;

public class FindSmallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of integers to compare: ");
        int count = input.nextInt();
        
        int smallest = 0; // Will hold the smallest number
        
        for (int i = 1; i <= count; i++) {
            System.out.printf("Enter integer #%d: ", i);
            int number = input.nextInt();
            
            // If it's the very first number, it's the smallest so far
            if (i == 1) {
                smallest = number;
            } else if (number < smallest) {
                // If this number is smaller, update smallest
                smallest = number;
            }
        }
        
        System.out.printf("The smallest integer is: %d%n", smallest);
        input.close();
    }
}
```

-----

**4.12 (Calculating the Product of Odd Integers) Write an application that calculates the product of the odd integers from 1 to 15.**

```java
public class ProductOfOdds {
    public static void main(String[] args) {
        long product = 1; // Use long to avoid overflow, initialize to 1
        
        // Loop from 1 to 15, incrementing by 2 to get only odds
        for (int i = 1; i <= 15; i += 2) {
            product = product * i;
        }
        
        System.out.println("The product of the odd integers from 1 to 15 is:");
        System.out.printf("1 * 3 * 5 * 7 * 9 * 11 * 13 * 15 = %d%n", product);
    }
}
```

-----

**4.13 (Factorials) Write an application that calculates the factorials of 1 through 20. Use type `long`. Display the results in tabular format. What difficulty might prevent you from calculating the factorial of 100?**

```java
public class Factorials {
    public static void main(String[] args) {
        System.out.println("Number\tFactorial");
        System.out.println("------\t---------------------");
        
        long factorial = 1; // Use long for the factorial
        
        for (int i = 1; i <= 20; i++) {
            factorial = factorial * i; // Calculate next factorial
            System.out.printf("%d\t%d%n", i, factorial);
        }
        
        System.out.println("\nDifficulty calculating 100!:");
        System.out.println("A 'long' (64-bit) variable is too small to hold 100!");
        System.out.println("20! is already huge. 21! would overflow a 'long'.");
        System.out.println("You would need to use a special class like 'BigInteger'.");
    }
}
```

-----

**4.14 (Modified Compound-Interest Program) Modify the compound-interest application to repeat its steps for interest rates of 5%, 6%, 7%, 8%, 9% and 10%. Use a `for` loop to vary the interest rate.**

```java
// Based on Fig. 4.6 in the textbook
public class CompoundInterest {
    public static void main(String[] args) {
        double principal = 1000.0; // Initial amount
        int years = 10;           // Number of years
        
        // Loop for each interest rate from 5% to 10%
        for (int percent = 5; percent <= 10; percent++) {
            
            double rate = percent / 100.0; // Convert 5 to 0.05, 6 to 0.06, etc.
            
            System.out.printf("%nInterest Rate: %d%%%n", percent);
            System.out.println("Year\tAmount on Deposit");
            System.out.println("----\t-----------------");
            
            // Calculate and display amount on deposit for each year
            for (int year = 1; year <= years; ++year) {
                // Calculate new amount
                double amount = principal * Math.pow(1.0 + rate, year);
                
                // Display the year and the amount
                System.out.printf("%4d\t%,.2f%n", year, amount);
            }
        }
    }
}
```

-----

-----

## Making a Difference

**4.30 (Global Warming Facts Quiz)**
*(Note: You must research and provide your own questions and answers. This code provides the *framework* for a 5-question quiz.)*

```java
import java.util.Scanner;

public class GlobalWarmingQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int correctAnswers = 0;
        
        System.out.println("Welcome to the Global Warming Facts Quiz!");
        System.out.println("----------------------------------------");
        
        // Question 1
        System.out.println("Q1: [Your Question 1 Here]");
        System.out.println("  1) [Answer 1]");
        System.out.println("  2) [Answer 2 (Correct)]");
        System.out.println("  3) [Answer 3]");
        System.out.println("  4) [Answer 4]");
        System.out.print("Your answer (1-4): ");
        int answer1 = input.nextInt();
        if (answer1 == 2) {
            correctAnswers++;
        }
        
        // Question 2
        System.out.println("\nQ2: [Your Question 2 Here]");
        System.out.println("  1) [Answer 1 (Correct)]");
        System.out.println("  2) [Answer 2]");
        System.out.println("  3) [Answer 3]");
        System.out.println("  4) [Answer 4]");
        System.out.print("Your answer (1-4): ");
        int answer2 = input.nextInt();
        if (answer2 == 1) {
            correctAnswers++;
        }

        // Question 3
        System.out.println("\nQ3: [Your Question 3 Here]");
        System.out.println("  1) [Answer 1]");
        System.out.println("  2) [Answer 2]");
        System.out.println("  3) [Answer 3 (Correct)]");
        System.out.println("  4) [Answer 4]");
        System.out.print("Your answer (1-4): ");
        int answer3 = input.nextInt();
        if (answer3 == 3) {
            correctAnswers++;
        }
        
        // Question 4
        System.out.println("\nQ4: [Your Question 4 Here]");
        System.out.println("  1) [Answer 1]");
        System.out.println("  2) [Answer 2]");
        System.out.println("  3) [Answer 3]");
        System.out.println("  4) [Answer 4 (Correct)]");
        System.out.print("Your answer (1-4): ");
        int answer4 = input.nextInt();
        if (answer4 == 4) {
            correctAnswers++;
        }
        
        // Question 5
        System.out.println("\nQ5: [Your Question 5 Here]");
        System.out.println("  1) [Answer 1]");
        System.out.println("  2) [Answer 2 (Correct)]");
        System.out.println("  3) [Answer 3]");
        System.out.println("  4) [Answer 4]");
        System.out.print("Your answer (1-4): ");
        int answer5 = input.nextInt();
        if (answer5 == 2) {
            correctAnswers++;
        }
        
        // Display Results
        System.out.println("\n--- Your Results ---");
        System.out.printf("You scored %d out of 5.%n%n", correctAnswers);
        
        switch (correctAnswers) {
            case 5:
                System.out.println("Excellent!");
                break;
            case 4:
                System.out.println("Very good!");
                break;
            default: // 3 or fewer
                System.out.println("Time to brush up on your knowledge of global warming.");
                System.out.println("Check out these sites: [List your website URLs here]");
                break;
        }
        
        input.close();
    }
}
```

-----

**4.31 (Tax Plan Alternatives; The “FairTax”)**

```java
import java.util.Scanner;

public class FairTaxCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Define the FairTax rate
        final double FAIR_TAX_RATE = 0.23; // 23%
        
        System.out.println("--- FairTax Calculator ---");
        System.out.println("Enter your estimated monthly expenses for each category.");
        
        System.out.print("Housing: $");
        double housing = input.nextDouble();
        
        System.out.print("Food: $");
        double food = input.nextDouble();
        
        System.out.print("Clothing: $");
        double clothing = input.nextDouble();
        
        System.out.print("Transportation: $");
        double transportation = input.nextDouble();
        
        System.out.print("Education: $");
        double education = input.nextDouble();
        
        System.out.print("Health Care: $");
        double healthcare = input.nextDouble();
        
        System.out.print("Vacations/Other: $");
        double vacations = input.nextDouble();
        
        // Calculate total expenses
        double totalExpenses = housing + food + clothing + transportation +
                             education + healthcare + vacations;
                             
        // Calculate the tax
        double estimatedTax = totalExpenses * FAIR_TAX_RATE;
        
        System.out.println("\n--- Tax Calculation ---");
        System.out.printf("Total monthly expenses: $%,.2f%n", totalExpenses);
        System.out.printf("Estimated FairTax (at 23%%): $%,.2f%n", estimatedTax);
        
        input.close();
    }
}
```

-----

**4.32 (Facebook User Base Growth)**

```java
public class FacebookGrowth {
    public static void main(String[] args) {
        
        double initialUsers = 1.0;  // 1 billion
        double growthRate = 0.04; // 4% per month
        double target1 = 1.5;       // 1.5 billion
        double target2 = 2.0;       // 2.0 billion
        
        double currentUsers = initialUsers;
        int months = 0;
        
        // --- Calculate time to 1.5 billion ---
        while (currentUsers < target1) {
            currentUsers = currentUsers * (1.0 + growthRate); // Grow population
            months++; // Add one month
        }
        
        System.out.printf("Time to reach 1.5 billion users: %d months%n", months);
        
        // --- Reset for second calculation ---
        currentUsers = initialUsers;
        months = 0;
        
        // --- Calculate time to 2.0 billion ---
        while (currentUsers < target2) {
            currentUsers = currentUsers * (1.0 + growthRate);
            months++;
        }
        
        System.out.printf("Time to reach 2.0 billion users: %d months%n", months);
    }
}
```