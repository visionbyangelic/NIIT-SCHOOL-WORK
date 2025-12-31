import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;

/**
 * BOOK CLASS
 * Stores information about individual books.
 */
class Book {
    private String title;
    private String author;
    private String isbn;
    private String category;
    private boolean isAvailable;

    public Book(String title, String author, String isbn, String category) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.category = category;
        this.isAvailable = true;
    }

    // Getters
    public String getTitle() { return title; }
    public String getIsbn() { return isbn; }
    public boolean isAvailable() { return isAvailable; }
    public void setAvailable(boolean available) { isAvailable = available; }

    @Override
    public String toString() {
        String status = isAvailable ? "[Available]" : "[Checked Out]";
        return String.format("%-15s | %-30s | %-20s | %s", isbn, title, author, status);
    }
}

/**
 * MEMBER CLASS
 * Stores information about the students.
 */
class Member {
    private String name;
    private String studentId;
    private String department;
    private ArrayList<Book> borrowedBooks;

    public Member(String name, String studentId, String department) {
        this.name = name;
        this.studentId = studentId;
        this.department = department;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getName() { return name; }
    public String getStudentId() { return studentId; }
    public ArrayList<Book> getBorrowedBooks() { return borrowedBooks; }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }

    @Override
    public String toString() {
        return "Student: " + name + " (" + studentId + ") | Dept: " + department;
    }
}

/**
 * MAIN CONTROLLER
 * Handles the logic and the console UI.
 */
public class LibrarySystem {
    private ArrayList<Book> inventory = new ArrayList<>();
    private ArrayList<Member> members = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        LibrarySystem app = new LibrarySystem();
        app.seedData();
        app.runMenu();
    }

    /**
     * Pre-loads the system with data.
     */
    private void seedData() {
        // Adding Java, Python, and other Tech books
        inventory.add(new Book("Java: The Complete Reference", "Herbert Schildt", "ISBN-001", "Software Development"));
        inventory.add(new Book("Python Crash Course", "Eric Matthes", "ISBN-002", "Data Science"));
        inventory.add(new Book("Clean Code", "Robert C. Martin", "ISBN-003", "Software Engineering"));
        inventory.add(new Book("Head First Java", "Kathy Sierra", "ISBN-004", "Software Development"));
        inventory.add(new Book("Effective Python", "Brett Slatkin", "ISBN-005", "Software Development"));

        // Adding the requested student
        members.add(new Member("Angelic Charles", "NIIT-PH-2024-01", "Software Development"));
    }

    public void runMenu() {
        boolean running = true;
        while (running) {
            System.out.println("\n============================================");
            System.out.println("     NIIT PORT HARCOURT LIBRARY SYSTEM      ");
            System.out.println("============================================");
            System.out.println("1. View All Books");
            System.out.println("2. Search for a Book (by Title)");
            System.out.println("3. Borrow a Book");
            System.out.println("4. Return a Book");
            System.out.println("5. View Student Profile (Angelic Charles)");
            System.out.println("6. Exit");
            System.out.print("\nChoose an option: ");

            int choice = 0;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }

            switch (choice) {
                case 1 -> displayInventory();
                case 2 -> searchBook();
                case 3 -> borrowProcess();
                case 4 -> returnProcess();
                case 5 -> viewMemberProfile("NIIT-PH-2024-01");
                case 6 -> {
                    System.out.println("System shutting down. Goodbye!");
                    running = false;
                }
                default -> System.out.println("Option not found.");
            }
        }
    }

    private void displayInventory() {
        System.out.println("\n--- CURRENT INVENTORY ---");
        System.out.println(String.format("%-15s | %-30s | %-20s | %s", "ISBN", "TITLE", "AUTHOR", "STATUS"));
        System.out.println("--------------------------------------------------------------------------------------");
        for (Book b : inventory) {
            System.out.println(b);
        }
    }

    private void searchBook() {
        System.out.print("Enter book title to search: ");
        String query = scanner.nextLine().toLowerCase();
        boolean found = false;
        for (Book b : inventory) {
            if (b.getTitle().toLowerCase().contains(query)) {
                System.out.println("Found: " + b);
                found = true;
            }
        }
        if (!found) System.out.println("No books found matching that title.");
    }

    private void borrowProcess() {
        System.out.print("Enter your Student ID: ");
        String sid = scanner.nextLine();
        Member m = findMember(sid);

        if (m == null) {
            System.out.println("Student ID not found.");
            return;
        }

        System.out.print("Enter ISBN of the book to borrow: ");
        String isbn = scanner.nextLine();
        Book b = findBook(isbn);

        if (b != null && b.isAvailable()) {
            b.setAvailable(false);
            m.borrowBook(b);
            System.out.println("Success! Angelic, you have borrowed: " + b.getTitle());
        } else if (b != null) {
            System.out.println("Sorry, that book is already checked out.");
        } else {
            System.out.println("Book ISBN not found.");
        }
    }

    private void returnProcess() {
        System.out.print("Enter your Student ID: ");
        String sid = scanner.nextLine();
        Member m = findMember(sid);

        if (m == null) return;

        System.out.print("Enter ISBN of the book to return: ");
        String isbn = scanner.nextLine();
        
        Book bookToReturn = null;
        for (Book b : m.getBorrowedBooks()) {
            if (b.getIsbn().equals(isbn)) {
                bookToReturn = b;
                break;
            }
        }

        if (bookToReturn != null) {
            bookToReturn.setAvailable(true);
            m.returnBook(bookToReturn);
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("You don't have this book in your records.");
        }
    }

    private void viewMemberProfile(String sid) {
        Member m = findMember(sid);
        if (m != null) {
            System.out.println("\n--- STUDENT PROFILE ---");
            System.out.println(m);
            System.out.println("Borrowed Books:");
            if (m.getBorrowedBooks().isEmpty()) {
                System.out.println(" - None");
            } else {
                for (Book b : m.getBorrowedBooks()) {
                    System.out.println(" - " + b.getTitle());
                }
            }
        }
    }

    private Book findBook(String isbn) {
        for (Book b : inventory) {
            if (b.getIsbn().equalsIgnoreCase(isbn)) return b;
        }
        return null;
    }

    private Member findMember(String sid) {
        for (Member m : members) {
            if (m.getStudentId().equalsIgnoreCase(sid)) return m;
        }
        return null;
    }
}