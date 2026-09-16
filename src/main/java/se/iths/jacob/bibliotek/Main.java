package se.iths.jacob.bibliotek;

public class Main {

    static void main() {


        Author author = new Author ("Helena");
        IO.println(author);

        Book book = new Book("hej ", "12 ", "Helena ");

        IO.println(book);
    }
}
