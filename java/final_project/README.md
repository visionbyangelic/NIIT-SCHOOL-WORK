## NIIT Java Library Management System

A robust, console-based Java application built to manage book inventories and student borrowing records for the **Software Development Department at NIIT Port Harcourt**.

---

## 📌 Project Overview

This project emphasizes **Object-Oriented Programming (OOP)** principles through a logic-driven, terminal-based system.  
Instead of a graphical interface, it focuses on clean structure, reliability, and efficient interaction via the console.

**Core Goals:**
- Maintain accurate book inventories
- Track student borrowing activity
- Ensure stability through input validation
- Provide a simple, intuitive terminal experience

---

## 🚀 Key Features

### 📚 Inventory Management
- Dynamically tracks books across categories:
  - Java
  - Python
  - Software Engineering
- Updates availability in real time

### 👤 Student Management
- Pre-configured student profile:
  - **Name:** Angelic Charles  
  - **Class:** Software Development

### 🔄 Borrow & Return System
- Verifies book availability before borrowing
- Confirms student records before transactions
- Prevents invalid operations

### 🔍 Search Functionality
- Keyword-based search
- Quickly locate books by title

### ✅ Data Validation
- Guards against invalid inputs
- Prevents crashes from incorrect data types (e.g., text instead of numbers)

---

## 🛠️ Technical Implementation

- **Encapsulation**
  - Private fields with public getters and setters in `Book` and `Member` classes

- **Collections**
  - Uses `ArrayList` for flexible and dynamic data handling

- **Console Formatting**
  - Utilizes `System.out.printf` for clean, table-like output

---

## 📖 Getting Started

### Prerequisites
- Java Development Kit (**JDK 8 or higher**)

### Run the Application

1. Compile the program:
   ```bash
   javac LibrarySystem.java
   ```

2. Launch the application:
```
java LibrarySystem
```



🧭 Navigation Guide

Student ID:
Use NIIT-PH-2024-01 to test borrowing features for Angelic Charles

Book ISBNs:
View the inventory list (Option 1) to find IDs such as:
```
ISBN-001
```
```
ISBN-002
```
---

📂 Project Structure


Book.java
Data model representing library books and availability


Member.java
Data model for students and their borrowing history




