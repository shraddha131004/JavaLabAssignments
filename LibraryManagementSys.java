import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private int quantity;

    public Book(String title, String author, int quantity) {
        this.title = title;
        this.author = author;
        this.quantity = quantity;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getQuantity() {
        return quantity;
    }

    public void increaseQuantity(int amount) {
        quantity += amount;
    }

    public void decreaseQuantity(int amount) {
        quantity -= amount;
    }
}

class Student {
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}

class Library {
    private ArrayList<Book> books;
    private ArrayList<Student> students;
    private ArrayList<Student> faculties;
    private HashMap<Book, Student> checkedOutBooks;

    public Library() {
        books = new ArrayList<>();
        students = new ArrayList<>();
        faculties = new ArrayList<>();
        checkedOutBooks = new HashMap<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void upgradeBookQuantity(String title, int quantity) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.increaseQuantity(quantity);
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void searchBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Book found: " + book.getTitle() + " by " + book.getAuthor() + ", Quantity: " + book.getQuantity());
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void showAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            System.out.println("Available books:");
            for (Book book : books) {
                System.out.println(book.getTitle() + " by " + book.getAuthor() + ", Quantity: " + book.getQuantity());
            }
        }
    }

    public void registerStudent(Student student) {
        students.add(student);
    }

    public void showAllRegisteredStudents() {
        if (students.isEmpty()) {
            System.out.println("No students registered.");
        } else {
            System.out.println("Registered students:");
            for (Student student : students) {
                System.out.println("ID: " + student.getId() + ", Name: " + student.getName());
            }
        }
    }

    public void registerFaculty(Student faculty) {
        faculties.add(faculty);
    }

    public void showAllRegisteredFaculty() {
        if (faculties.isEmpty()) {
            System.out.println("No faculty registered.");
        } else {
            System.out.println("Registered faculty:");
            for (Student faculty : faculties) {
                System.out.println("ID: " + faculty.getId() + ", Name: " + faculty.getName());
            }
        }
    }

    public void checkOutBook(String title, int id) {
        Student borrower = findStudentById(id);
        if (borrower != null) {
            for (Book book : books) {
                if (book.getTitle().equalsIgnoreCase(title) && book.getQuantity() > 0) {
                    book.decreaseQuantity(1);
                    checkedOutBooks.put(book, borrower);
                    System.out.println("Book checked out successfully.");
                    return;
                }
            }
            System.out.println("Book not available for checkout.");
        } else {
            System.out.println("Borrower not found.");
        }
    }

    public void checkInBook(String title) {
        for (Book book : checkedOutBooks.keySet()) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.increaseQuantity(1);
                checkedOutBooks.remove(book);
                System.out.println("Book checked in successfully.");
                return;
            }
        }
        System.out.println("Book not checked out or not found.");
    }

    private Student findStudentById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        for (Student faculty : faculties) {
            if (faculty.getId() == id) {
                return faculty;
            }
        }
        return null;
    }
}

public class LibraryManagementSys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Exit Application");
            System.out.println("2. Add a New Book");
            System.out.println("3. Upgrade Quantity of a Book");
            System.out.println("4. Search a Book");
            System.out.println("5. Show All Books");
            System.out.println("6. Register Student");
            System.out.println("7. Show all Registered Students");
            System.out.println("8. Register Faculty");
            System.out.println("9. Show all Registered Faculty");
            System.out.println("10. Check Out Book");
            System.out.println("11. Check-In Book");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Exiting application.");
                    return;
                case 2:
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    library.addBook(new Book(title, author, quantity));
                    System.out.println("Book added successfully.");
                    break;
                case 3:
                    System.out.print("Enter book title: ");
                    title = scanner.nextLine();
                    System.out.print("Enter quantity to add: ");
                    quantity = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    library.upgradeBookQuantity(title, quantity);
                    break;
                case 4:
                    System.out.print("Enter book title: ");
                    title = scanner.nextLine();
                    library.searchBook(title);
                    break;
                case 5:
                    library.showAllBooks();
                    break;
                case 6:
                    System.out.print("Enter student name: ");
                    String studentName = scanner.nextLine();
                    System.out.print("Enter student ID: ");
                    int studentId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    library.registerStudent(new Student(studentName, studentId));
                    System.out.println("Student registered successfully.");
                    break;
                case 7:
                    library.showAllRegisteredStudents();
                    break;
                case 8:
                    System.out.print("Enter faculty name: ");
                    String facultyName = scanner.nextLine();
                    System.out.print("Enter faculty ID: ");
                    int facultyId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    library.registerFaculty(new Student(facultyName, facultyId));
                    System.out.println("Faculty registered successfully.");
                    break;
                case 9:
                     library.showAllRegisteredFaculty();
                     break;    
                case 10:
                    System.out.print("Enter book title to check out: ");
                    String checkoutTitle = scanner.nextLine();
                    System.out.print("Enter borrower ID: ");
                    int borrowerId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    library.checkOutBook(checkoutTitle, borrowerId);
                    break;
                case 11:
                    System.out.print("Enter book title to check in: ");
                    String checkinTitle = scanner.nextLine();
                    library.checkInBook(checkinTitle);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

    }
}

