package org.example;

public class Library {
    private String fieldOfStudy;

    public Library(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

//methods within the library class
    public void research(){
        System.out.println("Field of study: " + fieldOfStudy);
        System.out.println("Wow, that a great choice of reading, let's get " +
                "you going with some recommendations");
    }

    public void accessReports() {
        System.out.println("Preparing reports from people in "+ fieldOfStudy+ " for you.");
    }

    public void accessArticlesAndFunFacts(){
        System.out.println("Here are some fun facts and articles produced by some scholars in " +
                fieldOfStudy + " Enjoy!");
    }

    public void leaveFeedback (){
        System.out.println("Tell us what stood out for you and some things you would" +
                " want us to implement before your next visit");

    }

    public void accessP_Questions(){
        System.out.println("Preparing past questions in "+ fieldOfStudy + " for you. Wait Patiently.");
    }
}


