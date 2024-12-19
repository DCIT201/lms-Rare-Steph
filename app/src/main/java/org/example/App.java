package org.example;

public class App {
    public static void main(String[] args) {

        System.out.println("Hello, Welcome to Steph's Library");

// Various object constructors
        Patron pat= new Patron("Stephanie", "2024", "Member", "anokyewaa@gmail.com" );

        Library lib = new Library("Mathematics");

        Book b = new Book("Good habits", "Nicole Edwards", 10);

 //Block of code to execute users information
        System.out.println("This is the user information we have in our system.");
        System.out.println("Your name: " + pat.getName());
        System.out.println("Your membership status: " + pat.getStatus());
        System.out.println("Email: " + pat.getEmail());
        System.out.println("Field of Study: "+ lib.getFieldOfStudy());

        System.out.println("                                     ");

 //methods be accessed within the book class
        b.getAuthor();
        b.getYearPublished();
        b.getTitle();
        b.setTitle("BeHappy");

        b.addBook("HappinessIsForAll");
        b.removeBook("MoneyIsGood", "Cole James");
        b.search("ArtOfMoneyMaking");

        System.out.println("                                    ");

// methods to be accessed within the Library class
        lib.getFieldOfStudy();
        lib.research();
        lib.accessP_Questions();
        lib.accessArticlesAndFunFacts();
        lib.accessReports();
        lib.leaveFeedback();

        System.out.println("                                   ");

// methods to be accessed within the Patron class
        pat.getuserId();
        pat.borrowBook("HopeForAll");
        pat.returnBook("HopeForNone");
     };
    }

