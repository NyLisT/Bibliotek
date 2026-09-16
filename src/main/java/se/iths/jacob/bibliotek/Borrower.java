package se.iths.jacob.bibliotek;

public class Borrower {
    private String username;
    private final String password;
    private String name;

    public Borrower(String username, String password, String name) {
        this.username = username;
        this.password = password;
        this.name = name;

}
        public String toString(){
            return "Användare: " + username + " aka: "  + name;
        }
    }
