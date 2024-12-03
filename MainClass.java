/**
 * 作業編號：Lab1
 * 作業內容：實作Book Class
 * @author 411177031
 * @version 1.0
 */
public class MainClass {
	public static void main(String[] args) {
		Book w1 = new Book("BOOK1", "ISBN1", 85); //(書名，ISBN編號，售價)
		Book w2 = new Book("BOOK2", "ISBN2", 135);
		String str1 = w1.get_bname() + "," + w1.get_isbn();
		str1 += "," + (w1.get_price() + w1.get_shipping());
		String str2 = w2.get_bname() + "," + w2.get_isbn();
		str2 += "," + (w2.get_price() + w2.get_shipping());
		System.out.println(str1 + "," + str2);
	}
}
class Book{
	private String bookTitle;
	private String bookISBN;
	private int bookPrice;
	
	public Book(String title, String ISBN, int price){
		this.bookTitle = title;
		this.bookISBN = ISBN;
		this.bookPrice = price;
	}
	
	public String get_bname() {
		return bookTitle;
	}
	public String get_isbn() {
		return bookISBN;
	}
	public int get_price() {
		return bookPrice;
	}
	public int get_shipping() {
		if(bookPrice > 100) {
			return 50;
		}
		else {
			return 20;
		}
	}
}