## Chapter 1

### Self-Review Exercises

**1.1 Fill in the blanks in each of the following statements:**
 
a) Computers process data under the control of sets of instructions called **programs**.
b) The key logical units of the computer are the **input unit**, **output unit**, **memory unit**, **arithmetic and logic unit (ALU)**, **central processing unit (CPU)**, and **secondary storage unit**.
c) The three types of languages are **machine language**, **assembly language**, and **high-level language**.
d) The programs that translate high-level language programs into machine language are called **compilers**.
e) **Android** is an operating system for mobile devices based on the Linux kernel and Java.
f) **Release** software is generally feature complete, (supposedly) bug free and ready for use by the community.
g) The Wii Remote, as well as many smartphones, use a(n) **accelerometer** which allows the device to respond to motion.
 
---

**1.2 Fill in the blanks in each of the following sentences about the Java environment:**
 
a) The **`java`** command from the JDK executes a Java application.
b) The **`javac`** command from the JDK compiles a Java program.
c) A Java source code file must end with the **`.java`** file extension.
d) When a Java program is compiled, the file produced by the compiler ends with the **`.class`** file extension.
e) The file produced by the Java compiler contains **bytecodes** that are executed by the Java Virtual Machine.
 
---

**1.3 Fill in the blanks in each of the following statements:**
 
a) Objects enable the design practice of **information hiding**—although they may know how to communicate with one another across well-defined interfaces, they normally are not allowed to know how other objects are implemented.
b) Java programmers concentrate on creating **classes**, which contain fields and the set of methods that manipulate those fields and provide services to clients.
c) The process of analyzing and designing a system from an object-oriented point of view is called **object-oriented analysis and design (OOAD)**.
d) A new class of objects can be created conveniently by **inheritance**—the new class (called the subclass) starts with the characteristics of an existing class (called the superclass), possibly customizing them and adding unique characteristics of its own.
e) **UML (Unified Modeling Language)** is a graphical language that allows people who design software systems to use an industry-standard notation to represent them.
f) The size, shape, color and weight of an object are considered **attributes** of the object’s class.

---

## Exercises

**1.4 Fill in the blanks in each of the following statements:**
 
a) The logical unit that receives information from outside the computer for use by the computer is the **input unit**.
b) The process of instructing the computer to solve a problem is called **programming**.
c) **Assembly language** is a type of computer language that uses English-like abbreviations for machine-language instructions.
d) **Output unit** is a logical unit that sends information which has already been processed by the computer to various devices so that it may be used outside the computer.
e) **Memory unit** and **secondary storage unit** are logical units of the computer that retain information.
f) **Arithmetic and logic unit (ALU)** is a logical unit of the computer that performs calculations.
g) **Arithmetic and logic unit (ALU)** is a logical unit of the computer that makes logical decisions.
h) **High-level** languages are most convenient to the programmer for writing programs quickly and easily.
i) The only language a computer can directly understand is that computer’s **machine language**.
j) **Central processing unit (CPU)** is a logical unit of the computer that coordinates the activities of all the other logical units.
 
---

**1.5 Fill in the blanks in each of the following statements:**
 
a) The **Java** programming language is now used to develop large-scale enterprise applications, to enhance the functionality of web servers, to provide applications for consumer devices and for many other purposes.
b) **C** initially became widely known as the development language of the UNIX operating system.
c) The **TCP (Transmission Control Protocol)** ensures that messages, consisting of sequentially numbered pieces called bytes, were properly routed from sender to receiver, arrived intact and were assembled in the correct order.
d) The **C++** programming language was developed by Bjarne Stroustrup in the early 1980s at Bell Laboratories.

---

**1.6 Fill in the blanks in each of the following statements:**
 
a) Java programs normally go through five phases— **edit**, **compile**, **load**, **verify**, and **execute**.
b) A(n) **IDE (Integrated Development Environment)** provides many tools that support the software development process, such as editors for writing and editing programs, debuggers for locating logic errors in programs, and many other features.
c) The command `java` invokes the **JVM (Java Virtual Machine)**, which executes Java programs.
d) A(n) **virtual machine** is a software application that simulates a computer, but hides the underlying operating system and hardware from the programs that interact with it.
e) The **class loader** takes the `.class` files containing the program’s bytecodes and transfers them to primary memory.
f) The **bytecode verifier** examines bytecodes to ensure that they’re valid.
 
---

**1.7 Explain the two compilation phases of Java programs.**

Java's compilation is a two-phase process:

1.  **Phase 1: Source Code to Bytecode:** The Java compiler (invoked by the `javac` command) translates the human-readable Java source code (in a `.java` file) into a platform-independent set of instructions called **bytecodes**. These bytecodes are stored in a `.class` file. This bytecode is not specific to any one processor or operating system.

2.  **Phase 2: Bytecode to Machine Code:** The Java Virtual Machine (JVM, invoked by the `java` command) runs the program. The JVM's **Just-In-Time (JIT) compiler** translates the platform-independent bytecodes into platform-specific **machine code** that the computer's underlying hardware can execute directly. This phase happens *at runtime*, just before the code is needed.

---

**1.8 One of the world’s most common objects is a wrist watch. Discuss how each of the following terms and concepts applies to the notion of a watch: object, attributes, behaviors, class, inheritance (consider, for example, an alarm clock), modeling, messages, encapsulation, interface and information hiding.**

Here is how the concepts apply to a wristwatch:

* **Object:** The specific watch on your wrist is an object.
* **Class:** The general concept "Watch" is the class. It's the blueprint that defines all watches.
* **Attributes:** These are the properties or data of the watch, such as `brand` (e.g., "Rolex"), `color` (e.g., "Silver"), `strapMaterial` (e.g., "Leather"), `isDigital` (e.g., "false"), and `currentTime`.
* **Behaviors (Methods):** These are the actions the watch can perform, such as `displayTime()`, `setTime(newTime)`, and `changeDate()`.
* **Modeling:** This would be the process of designing the `Watch` class, perhaps by drawing a UML diagram showing its attributes and behaviors before writing any code.
* **Messages:** You send a message to the watch when you interact with it. Turning the crown to set the time is sending a "setTime" message to the watch object.
* **Interface:** The watch's public interface is what you use to interact with it: the watch face (for `displayTime()`) and the crown/buttons (for `setTime()`).
* **Encapsulation & Information Hiding:** You (the user) don't need to know *how* the watch's internal gears, springs, or quartz crystal work to tell the time. All that complex implementation is hidden from you. You just interact with the simple interface (the crown and face). This hiding of complexity is information hiding, which is achieved through encapsulation.
* **Inheritance:** A "Smartwatch" or "AlarmClock" is a *type of* watch. It would **inherit** all the attributes and behaviors of the basic `Watch` class (like `currentTime`, `displayTime()`) but would **add** its own, like `alarmTime` and `soundAlarm()` (for an alarm clock) or `displayNotification()` (for a smartwatch).

---

## Making a Difference

**1.9 (Test-Drive: Carbon Footprint Calculator)**

> (This exercise requires you to visit the specified websites, use their tools, and research the underlying formulas. The goal is to understand what data is needed—such as electricity usage, miles driven, and diet—and how that data is converted into an estimate of carbon emissions.)

**1.10 (Test-Drive: Body Mass Index Calculator)**

> (Similar to 1.9, this exercise requires you to use the provided calculator and research the BMI formula. You will discover the two main formulas: one for metric units (kg, m) and one for imperial units (lbs, in). The imperial formula is:
> $BMI = \frac{703 \times weightInPounds}{heightInInches^2}$)

**1.11 (Attributes of Hybrid Vehicles)**

> (This exercise requires research. Here is a sample list of attributes you might find.)
>
> **Hybrid-Related Attributes:**
> * City Miles Per Gallon (MPG)
> * Highway Miles Per Gallon (MPG)
> * Combined Miles Per Gallon (MPG)
> * Electric-Only Range (miles)
> * Total Range (miles)
> * Vehicle Type (e.g., Plug-in Hybrid, Full Hybrid)
> * Regenerative Braking (true/false)
>
> **Battery Attributes:**
> * Battery Type (e.g., Lithium-ion, Nickel-Metal Hydride)
> * Battery Capacity (kWh - kilowatt-hours)
> * Battery Weight (lbs or kg)
> * Charge Time (hours, for plug-in hybrids)
> * Battery Warranty (years/miles)

**1.12 (Gender Neutrality)**

> **Procedure (Algorithm):**
>
> 1.  Start at the beginning of the paragraph.
> 2.  Read the paragraph word by word.
> 3.  For each word, check if it exists in the list of gender-specific words (e.g., "wife", "man", "daughter").
> 4.  **If it does:** Find the corresponding gender-neutral replacement (e.g., "spouse", "person", "child") and write that replacement word down.
> 5.  **If it does not:** Write the original word down.
> 6.  Continue this process until you reach the end of the paragraph.
>
> **How "woperchild" could be generated:**
>
> A simple, "dumb" procedure like the one above could make this mistake. If the procedure for "woman" -> "person" is run *first*, the word "woman" becomes "person."
>
> If a second, separate procedure is run *after* that to replace "man" -> "person", it might see the "man" *inside* the word "wo**man**" (or in this case, "per**son**").
>
> The more likely error, "woperchild," would happen if you try to replace parts of words instead of whole words.
>
> 1.  Original text: "woman", "child"
> 2.  Algorithm replaces "man" with "per".
> 3.  The word "wo**man**" incorrectly becomes "wo**per**".
> 4.  The word "child" remains "child".
> 5.  If they were joined, you might get "woperchild".
>
> The key is that a simple algorithm does not understand **context**. It just replaces text, which can lead to errors by replacing parts of words or running replacements in the wrong order.