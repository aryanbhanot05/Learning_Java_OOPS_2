package Java_OOPS_2;

public class Online_Library {
    static class Lib {
        // Think of issuing more than 1 book
        String Books[] = new String[6];
        String issued;

        public void add(String book) {
            for (int i = 0; i < 6; i++) {
                if (Books[i] == null) {
                    Books[i] = book;
                    break;
                }
                if (Books[5] != null) {
                    System.out.println("Lib is full.\nBook not added.");
                    break;
                }
            }
        }

        public void stock() {
            for (String e : Books) {
                if (e != null) {
                    System.out.println(e);
                }
            }
            System.out.println();
        }

        public void issue(String name) {
            for (int i = 0; i < 6; i++) {
                if (Books[i] == name) {
                    issued = Books[i];
                    Books[i] = null;
                    System.out.println("Book issued");
                }
            }
            if (issued == null) {
                System.out.println("Book not available.\n");
            }
        }

        public void returning(String name) {
            for (int i = 0; i < 6; i++) {
                if (issued == name) {
                    add(name);
                    break;
                }
                if (issued != name) {
                    System.out.println("Wrong Book");
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        Lib lb = new Lib();
        lb.add("A");
        lb.add("B");
        lb.add("C");
        lb.add("D");
        lb.add("E");
        // lb.add("F");
        // lb.add("G");

        lb.stock();

        // lb.issue("D");
        lb.issue("A");

        lb.stock();

        lb.returning("A");
        // lb.returning("D");

        lb.stock();
    }

    // // Code With Harry Code
    // static class Library {
    // String[] books = new String[4];
    // int no_of_books;

    // void addBook(String book) {
    // this.books[no_of_books] = book;
    // no_of_books++;
    // System.out.println(book + " has been added!");
    // }

    // void showAvailableBooks() {
    // System.out.println("Available Books are:");
    // for (String book : this.books) {
    // if (book == null) {
    // continue;
    // }
    // System.out.println("* " + book);
    // }
    // }

    // void issueBook(String book) {
    // for (int i = 0; i < this.books.length; i++) {
    // if (this.books[i].equals(book)) {
    // System.out.println("The book has been issued!");
    // this.books[i] = null;
    // return;
    // }
    // }
    // System.out.println("This book does not exist");
    // }

    // void returnBook(String book) {
    // addBook(book);
    // }

    // }

    // public static void main(String[] args) {
    // // You have to implement a library using Java Class "Library"
    // // Methods: addBook, issueBook, returnBook, showAvailableBooks
    // // Properties: Array to store the available books,
    // // Array to store the issued books

    // Library centralLibrary = new Library();
    // centralLibrary.addBook("Think and grow Rich");
    // centralLibrary.addBook("Algorithms");
    // centralLibrary.addBook("C++");
    // centralLibrary.showAvailableBooks();

    // centralLibrary.issueBook("Algorithms");
    // centralLibrary.showAvailableBooks();
    // centralLibrary.returnBook("Algorithms");
    // centralLibrary.showAvailableBooks();
    // }
}
