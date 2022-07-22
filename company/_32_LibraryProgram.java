package com.company;

class Library{

    String[]  books;
    int no_of_books;
    Library(){
        this.books = new String[100];
        this.no_of_books = 0;
    }
    void addBook(String Book){
        this.books[no_of_books] = Book;
        no_of_books++;
        System.out.println(books+ "has been added !");
    }
    void showAvailableBooks(){
        System.out.println("Available Books are:");

        for (String books : this.books){
            if(books == null){
                  continue;
            }
            System.out.println("* " + books);
        }
    }
    void issueBook(String Book) {

        for (int i = 0; i < this.books.length; i++) {

            if (this.books[i].equals(Book)) {
                System.out.println("This Book has been issued !"+ Book);
                this.books[i] = null;
                return;
            }
        }
        System.out.println("This Book does not exist:");
    }
    void returnBook(String Book){

        addBook(Book);
        System.out.println("Return Book is "+ Book);
    }

}
public class _32_LibraryProgram {
    public static void main(String[] args) {
        //You have to implement a library using java class "Library"
        //Methods: addBook, issueBook, returnBook,showAvailableBook
        //Properties: Array to store the available books,
        //Array to store the issued Books

        Library centralLibrary = new Library();
        centralLibrary.addBook("Think and Grow Rich");
        centralLibrary.addBook("Algorithms");
        centralLibrary.addBook("C++");
        centralLibrary.showAvailableBooks();

        centralLibrary.issueBook("Algorithms");
        centralLibrary.showAvailableBooks();

        centralLibrary.returnBook("Algorithms");
        centralLibrary.showAvailableBooks();
    }
}
