package miniproject;

public class Book {
	   private int bookId;
	    private String bookTitle;
	    private String author;
	    private double price;
	    private int stock;
		public Book(int bookId, String bookTitle, String author, double price, int stock) {
			super();
			this.bookId = bookId;
			this.bookTitle = bookTitle;
			this.author = author;
			this.price = price;
			this.stock = stock;
		}
		public int getBookId() {
			return bookId;
		}
		public void setBookId(int bookId) {
			this.bookId = bookId;
		}
		public String getBookTitle() {
			return bookTitle;
		}
		public void setBookTitle(String bookTitle) {
			this.bookTitle = bookTitle;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public int getStock() {
			return stock;
		}
		public void setStock(int stock) {
			this.stock = stock;
		}
		@Override
		public String toString() {
			return "Book [bookId=" + bookId + ", bookTitle=" + bookTitle + ", author=" + author + ", price=" + price
					+ ", stock=" + stock + "]";
		}
	    
	    
}
