import java.util.ArrayList;
import java.util.List;

public class Readers {
    private String fullName;
    private int libraryCardNumber;
    private String faculty;
    private String dateOfBirth;
    private Phone phone;
    private List<Book> borrowedBooks;

    public Readers(String fullName, int libraryCardNumber, String faculty, String dateOfBirth, Phone phone) {
        this.fullName = fullName;
        this.libraryCardNumber = libraryCardNumber;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
        this.borrowedBooks = new ArrayList<>();
    }

    public void takeBook(int numberOfBooks) {
        System.out.println(fullName + " took " + numberOfBooks + " books");
    }

    public void takeBook(String... bookTitles) {
        System.out.print(fullName + " took books: ");
        for (String title : bookTitles) {
            System.out.print(title + ", ");
            borrowedBooks.add(new Book(title));
        }
        System.out.println();
    }

    public void takeBook(Book... books) {
        System.out.print(fullName + " took books: ");
        for (Book book : books) {
            System.out.print(book.getName() + ", ");
            borrowedBooks.add(book);
        }
        System.out.println();
    }

    public void returnBook(int numberOfBooks) {
        System.out.println(fullName + " returned " + numberOfBooks + " books");
        for (int i = 0; i < numberOfBooks; i++) {
            borrowedBooks.remove(borrowedBooks.size() - 1);
        }
    }

    public void returnBook(String... bookTitles) {
        System.out.print(fullName + " returned books: ");
        for (String title : bookTitles) {
            System.out.print(title + ", ");
            for (int i = 0; i < borrowedBooks.size(); i++) {
                if (borrowedBooks.get(i).getName().equals(title)) {
                    borrowedBooks.remove(i);
                    break;
                }
            }
        }
        System.out.println();
    }

    public void returnBook(Book... books) {
        System.out.print(fullName + " returned books: ");
        for (Book book : books) {
            System.out.print(book.getName() + ", ");
            borrowedBooks.remove(book);
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Phone phone = new Phone("1234567890", "iPhone");
        Readers reader1 = new Readers("Kamila Mukhammedova", 12345, "Science", "2006-10-30", phone);

        reader1.takeBook(3);
        reader1.takeBook("Adventures", "Dictionary", "Encyclopedia");

        Book book1 = new Book("Adventures");
        Book book2 = new Book("Dictionary");
        Book book3 = new Book("Encyclopedia");

        reader1.returnBook(book1, book2, book3);
    }
}

