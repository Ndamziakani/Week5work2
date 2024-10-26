package library;


import library.models.Book;
import library.models.Student;
import library.models.Teacher;
import library.service.LibraryService;

public class Main {
    public static void main(String[] args) {
        LibraryService library = new LibraryService();

        // Adding books
        library.addBook(new Book("Java ", 1));
        library.addBook(new Book("Data", 2));

        // Creating users
        Teacher teacher = new Teacher("Mrs. ADA");
        Student seniorStudent = new Student("Ndamzi", 2);  // Senior student
        Student juniorStudent = new Student("Jude", 1); // Junior student

        // Borrowing books
        System.out.println(library.borrowBook(seniorStudent, "Java ")); // Senior student borrows
        System.out.println(library.borrowBook(teacher, "Java ")); // Teacher tries, book taken
        System.out.println(library.borrowBook(juniorStudent, "Data ")); // Junior student borrows

        // Returning books
        library.returnBook("Java");
        System.out.println(library.borrowBook(teacher, "Java")); // Teacher borrows after return
    }
}