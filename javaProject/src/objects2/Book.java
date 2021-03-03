package objects2;


public class Book {
	private String bookName;
	private String author;
	private String company;
	private int sell;

	public Book(String bookName, String author, String company, int sell) {
		this.bookName = bookName;
		this.author = author;
		this.company = company;
		this.sell = sell;
	}
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getSell() {
		return sell;
	}
	public void setSell(int sell) {
		this.sell = sell;
	}
}