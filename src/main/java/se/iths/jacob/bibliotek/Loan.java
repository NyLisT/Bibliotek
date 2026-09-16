package se.iths.jacob.bibliotek;

import java.time.LocalDateTime;

public class Loan {

    private LocalDateTime loanDate;
    private Borrower borrower;
    private Book book;

    public Loan(LocalDateTime loanDate, Borrower borrower, Book book) {
        this.loanDate = LocalDateTime.now();
        this.borrower = borrower;
        this.book = book;
    }

    public String toString(){
        return loanDate + " " + borrower + " " + book;
    }
}
