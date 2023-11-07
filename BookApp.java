package miniproject;

import java.util.ArrayList;

public class BookApp {
	  private ArrayList<Book> bookList = new ArrayList<>();
	    private int nextBookId = 1;

	    public void addBook(String bookTitle, String author, double price, int stock) {
	        Book book = new Book(nextBookId, bookTitle, author, price, stock);
	        bookList.add(book);
	        nextBookId++;
	    }

	    public void displayAllBooks() {
	        if (bookList.isEmpty()) {
	            System.out.println("No books available in the store.");
	        } else {
	            for (Book book : bookList) {
	                System.out.println(book.toString() + "\n");
	            }
	        }
	    }

	    public Book findBookById(int bookId) {
	        for (Book book : bookList) {
	            if (book.getBookId() == bookId) {
	                return book;
	            }
	        }
	        return null;
	    }


	    public void purchaseBook(int bookId) {
	        Book book = findBookById(bookId);
	        if (book != null && book.getStock() > 0) {
	            book.setStock(book.getStock() - 1);
	            System.out.println("Purchase successful! Enjoy your book.");
	        } else if (book != null && book.getStock() == 0) {
	            System.out.println("Sorry, this book is out of stock.");
	        } else {
	            System.out.println("Book not found. Invalid book ID.");
	        }
	    }

}
