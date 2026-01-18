public class MyBookList {
    public static void main(String[] args) {
        // 1.) Create the following books that contain the title, author, and year published.
        // Use the Book class for this part.
        Book book1 = new Book("Rich Dad Poor Dad", "Robert Kiyosaki", 1997);
        Book book2 = new Book("The Power of Habit", "Charles Duhigg", 2012);
        Book book3 = new Book("Atomic Habits", "James Clear", 2018);
        Book book4 = new Book("Java Programming", "John Doe", 2020);
        Book book5 = new Book("Think Like a Monk", "Jay Shetty", 2020); 


        // 2.) Display the details of each book using the displayDetails method.
        System.out.println("\n--- Book Details ---");
        book1.displayDetails();
        book2.displayDetails();
        book3.displayDetails();
        book4.displayDetails();
        book5.displayDetails();


        // 3.) Change the current page of "Rich Dad Poor Dad" to 50 
        // and "Atomic Habits" to 100 using the changePage method.
        book1.changePage(50);
        book3.changePage(100);

        System.out.println("\n--- Updated Page Details ---");
        book1.displayDetails();
        book3.displayDetails();


        // 4.) Change the current page of your favorite book to any page number you like.
        book5.changePage(75);

        System.out.println("\n--- Favorite Book Updated ---");
        book5.displayDetails();


        // 5.) Change the author of "Java Programming" to "Jane Smith".
        book4.changeAuthor("Jane Smith");

        System.out.println("\n--- Updated Author for Java Programming ---");
        book4.displayDetails();


        // 6.) Create an array of Book objects to store all the books you created. Loop through the array and display the title of books published after 2010.
        Book[] books = { book1, book2, book3, book4, book5 };

        System.out.println("\n--- Books Published After 2010 ---");
        for (int i = 0; i < books.length; i++) {
            if (books[i].year > 2010) {
                System.out.println(books[i].title);
            }
        }
    }
}

class Book {

    String title;
    String author;
    int year;
    int currentPage;

    Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.currentPage = 0;
    }
    void displayDetails() {
        System.out.println("Title: " + title + ", Author: " + author + ", Year: " + year + ", Current Page: " + currentPage);
    }
    void changePage(int newPage) {
        currentPage = newPage;
    }
    void changeAuthor(String newAuthor) {
        author = newAuthor;
    }
}

