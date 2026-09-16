package se.iths.jacob.bibliotek;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {

    static void main() {


        Author author1 = new Author ("Helena");
        Author author2 = new Author ("Per");

        Book book1 = new Book("hej", "12", author1);
        Book book2 = new Book("då", "123", author1);
        Book book3 = new Book("hej", "124", author2);

        Borrower borrower1 = new Borrower("Glarp", "666", "Jacob");
        Borrower borrower2 = new Borrower("Hork", "777", "Pierre");

        /*
        String username1 = IO.readln("Ange användarnamn: ");
        String password1 = IO.readln("Ange lösenord: ");
        String name1 = IO.readln("Ange namn: ");
        Borrower borrower3 = new Borrower(username1, password1, name1);


        String username = IO.readln("Username: ");



        String password = IO.readln("Password: ");
           */

        Loan loan1 = new Loan(LocalDateTime.now(),borrower1, book1);

        IO.println(loan1);

        List<Borrower> borrowers = new ArrayList<>();
        List<Book> books = new ArrayList<>();
        List<Loan> loans = new ArrayList<>();
        borrowers.add(borrower1);
        borrowers.add(borrower2);
        books.add(book1);
        books.add(book2);
        books.add(book3);

        IO.println(borrowers);
        IO.println(books);
        IO.println(loans);
        for (Book i : books){
            System.out.println(i);
        }
    }
}
