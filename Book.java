package lab4.com;

public class Book {
	private String bookName;
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public String getBookid() {
		return bookid;
	}
	public void setBookid(String bookid) {
		this.bookid = bookid;
	}
	public String getBooktyupe() {
		return booktyupe;
	}
	public void setBooktyupe(String booktyupe) {
		this.booktyupe = booktyupe;
	}
	public int getBookcopy() {
		return bookcopy;
	}
	public void setBookcopy(int bookcopy) {
		this.bookcopy = bookcopy;
	}
	private String bookAuthor;
	private String bookid;
	private String booktyupe;
	private int bookcopy;
	
	public void showinfo() {
		  System.out.println(bookName+" : " +bookAuthor +" : "+bookid+" :" +bookcopy+": "+booktyupe);
		 
	
}
	
	public String toString() {
		return "Book [bookName=" + bookName + ", bookAuthor=" + bookAuthor + ", bookid=" + bookid + ", booktyupe="
				+ booktyupe + ", bookcopy=" + bookcopy + "]";
	}
}

