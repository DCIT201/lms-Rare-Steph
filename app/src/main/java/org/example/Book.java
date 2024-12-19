package org.example;

//A  book class, its field and functionalites.
public class Book {
     private String title;
     private String author;
     private int genre;

 //A book constructor to access objects within the Book class
     public Book(String title, String author, int genre) {
          this.title = title;
          this.author = author;
          this.genre = genre;


     }
//This method is used to get and set the title, author and year Published of the book
     public String getTitle() {
          return title;
     }
     public String getAuthor() {return author;}
     public void setTitle(String title) {
          this.title = title;
     }

//A method that enables the user to search for a particular book
     public void search(String search) {
          System.out.println("The file: "+ search + " is being retrieved to from archives");
     }

//A method that allows a new book to be added
     public void addBook(String add){
          System.out.println("The file: "+ add + " was added to your collection successfully.");
     }

//A method that allows a book to be deleted.
     public void removeBook(String remove, String author){
          System.out.println("The file: "+ remove + " was removed from your collection successfully.");
     }

     public int getYearPublished() {
          return genre;
     }
}
//End of the book class