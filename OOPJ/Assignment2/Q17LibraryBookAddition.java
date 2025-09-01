class LibBook {
    int bookId;
    String title;
    String author;

    LibBook(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }
}

class Library {
    String libraryName;
    static int totalBooks = 0;

    Library(String libraryName) {
        this.libraryName = libraryName;
    }

    void addBook(LibBook b) {
        totalBooks++;
    }

    void displayTotalBooks() {
        System.out.println("Total Books: " + totalBooks);
    }
}

class Q17LibraryBookAddition {
    public static void main(String[] args) {
        Library lib = new Library("CDAC Library");
        LibBook b1 = new LibBook(1, "Harry Potter", "J.K. Rowling");
        LibBook b2 = new LibBook(2, "Rich Dad Poor Dad", "Robert Kiyosaki");

        lib.addBook(b1);
        lib.addBook(b2);

        lib.displayTotalBooks();
    }
}

/*Output
Total Books: 2
*/
