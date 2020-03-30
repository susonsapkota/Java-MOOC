
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Suson
 */
public class Library {

    private ArrayList<Book> book;

    public Library() {
        book = new ArrayList<Book>();
    }

    public void addBook(Book newBook) {

        book.add(newBook);
    }

    public void printBooks() {
        for (Book books : book) {
            System.out.println(books.toString());
        }
    }

    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> found = new ArrayList<Book>();

        // iterate the list of books and add all the matching books to the list found
        for (Book books : book) {
            if (StringUtils.included(books.title(), title)) {
                found.add(books);
            }
        }
        return found;
    }

    public ArrayList<Book> searchByPublisher(String publisherName) {
        ArrayList<Book> found = new ArrayList<Book>();

        // iterate the list of books and add all the matching books to the list found
        for (Book books : book) {
            if (StringUtils.included(books.publisher(), publisherName)) {
                found.add(books);
            }
        }
        return found;
    }

    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> found = new ArrayList<Book>();

        // iterate the list of books and add all the matching books to the list found
        for (Book books : book) {
            if (books.year() == year) {
                found.add(books);
            }
        }
        return found;
    }

}
