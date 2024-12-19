package org.example;

public class Patron {

 //Fields within a Patron class
    private String name;
    private String userId;
    private String Status;
    private String Email;

    public Patron(String name, String userId, String Status, String Email) {
        this.name = name;
        this.userId = userId;
        this.Status = Status;
        this.Email = Email;

    }

    public String getName() {return name;}

    public String getuserId() {return userId;}

    public String getStatus() {return Status;}

    public String getEmail() {return Email;}

    public void borrowBook(String bookname) {
        System.out.println("Borrow request granted.");
        System.out.println("Remember, borrowed books are to be returned in a week time");
    }

    public void returnBook(String bookname) {
        System.out.println("File has been successfully returned. Thank you. ");
    }
}
