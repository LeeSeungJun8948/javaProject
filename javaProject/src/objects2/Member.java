package objects2;

public class Member {
	private String id;
	private String name;
	private Book[] rentBooks = new Book[5]; // Book 을 담을수 있는 배열 선언
	public Member() {
		
	}
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void rent(Book book) {

		for (int i = 0; i < rentBooks.length; i++) {
			if (rentBooks[i] == null) {
				rentBooks[i] = book;
				break;
			}
		}
	}
	public void overdue(Book book) {
		for (int i = 0; i < rentBooks.length; i++) {
			if (rentBooks[i].getBookName().equals(book.getBookName())) {
				rentBooks[i] = null;
				break;
			}
		}
	}
	public void getBookInfo() {
		String bookInfo = name;		
		for (int i = 0; i<rentBooks.length; i++) {
			if (rentBooks[i] != null) {
				bookInfo = bookInfo + " / " + rentBooks[i].getBookName();	
			}
		}
		System.out.println("멤버이름 - " + bookInfo);
	}
}
