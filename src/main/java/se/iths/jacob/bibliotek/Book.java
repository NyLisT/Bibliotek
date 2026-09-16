package se.iths.jacob.bibliotek;

public class Book {

    private String title;
    private String isbn;
    private Author author;

    public Book(String title, String isbn, Author author) {
        this.title = title;
        this.isbn = isbn;
        this.author = author;
    }

    public String getTitle() {
        return "Boktitel: " + title;
    }

    public String getIsbn() {
        return "ISBN: " + isbn;
    }

    public Author getAuthor() {
       System.out.print("Författare: ");
        return author;
    }

    public String toString() {
        return "Titel: " + title + " ISBN: " + isbn + " Författare: " + author;
    }

}
