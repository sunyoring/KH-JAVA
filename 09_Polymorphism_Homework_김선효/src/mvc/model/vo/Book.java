package mvc.model.vo;

public class Book {
	private String title;// 도서명
	private String author; // 저자명
	private String publisher;  // 출판사명
	
	
	public Book() {
		// TODO Auto-generated constructor stub
	}


	public Book(String title, String author, String publisher) {
		super();
		this.title = title;
		this.author = author;
		this.publisher = publisher;
	}


	@Override
	public String toString() {
		return "title=" + title + ", author=" + author + ", publisher=" + publisher;
	}
	
	

}
