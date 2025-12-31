## NIIT Port Harcourt Library Management System
A robust, console-based Java application designed to manage book inventories and student borrowing records for the Software Development department at NIIT Port Harcourt.

### 📌 Project Overview
This project focuses on Object-Oriented Programming (OOP) principles. It manages the relationship between books and students using logic-driven code rather than a graphical interface. It is designed to be efficient, crash-resistant, and easy to navigate via the terminal.

### 🚀 Key Features

- Dynamic Inventory: Tracks Java, Python, and Software Engineering books with real-time availability updates.Student Management: Pre-configured profile for Angelic Charles (Class: Software Development).

- Borrow/Return Logic: A secure system that checks book status and student records before processing transactions.Search Engine: Keyword-based search to find books quickly by title.

- Data Validation: Prevents invalid inputs (like entering text into a number field) from crashing the system.

### 🛠️ Technical Implementation

- Encapsulation: Private data fields with public getters/setters in the Book and Member classes.

- Collections: Utilizes ArrayList for flexible data management.

- Formatting: Uses System.out.printf for a clean, table-like UI in the console.

---

📖 Getting Started

### Prerequisites 
Java Development Kit (JDK) 8 or higher installed on your machine.

### Run the Application
Compile the code:javac LibrarySystem.java
Launch the system:java LibrarySystem
Navigation GuideStudent ID: Use NIIT-PH-2024-01 to test the borrowing features for Angelic Charles.
ISBNs: Check the inventory list (Option 1) to find IDs like ISBN-001 or ISBN-002.

📂 Project Structure
Book.java: Data model for library assets.
Member.java: Data model for students and their borrowing history.
LibrarySystem.java: The main engine containing the logic, menu, and student database.
Course: Software DevelopmentInstitution: NIIT Port Harcourt