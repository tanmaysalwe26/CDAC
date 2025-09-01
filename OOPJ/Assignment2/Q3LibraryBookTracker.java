class Book {
    String title;
    String author;
    boolean issued;
    static int totalIssuedBooks = 0;

    Book(String title, String author, boolean issued) {
        this.title = title;
        this.author = author;
        this.issued = issued;
        if (issued) totalIssuedBooks++;
    }

    boolean isIssued() {
        return issued;
    }

    static void showTotalIssued() {
        System.out.println("Total books issued: " + totalIssuedBooks);
    }
}

class Q3LibraryBookTracker {
    public static void main(String[] args) {
        Book b1 = new Book("Harry Potter", "J.K. Rowling", true);
        Book b2 = new Book("Five Point Someone", "Chetan Bhagat", false);
        Book b3 = new Book("Rich Dad Poor Dad", "Robert Kiyosaki", true);

        System.out.println("Book1 issued? " + b1.isIssued());
        System.out.println("Book2 issued? " + b2.isIssued());
        System.out.println("Book3 issued? " + b3.isIssued());

        Book.showTotalIssued();
    }
}

/*Output
Book1 issued? true
Book2 issued? false
Book3 issued? true
Total books issued: 2
*/
