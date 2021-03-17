package book;
import tangibleasset.TangibleAsset;

// chap12
//practice12-01 自分で解答したコード
public class Book extends TangibleAsset {
	private String isbn;

	// コンストラクタ
	public Book(String name, int price, String color, String isbn) {
		super(name, price, color);
		this.isbn = isbn;
	}
	// getterメソッド
	public String getIsbn() { return this.isbn;}
}

// practice12-01 元のコード
//public class Book {
//	private String name;
//	private int price;
//	private String color;
//	private String isbn;
//
//	// コンストラクタ
//	public Book(String name, int price, String color, String isbn) {
//		this.name = name;
//		this.price = price;
//		this.color = color;
//		this.isbn = isbn;
//	}
//	// getterメソッド
//	public String getName() { return this.name; }
//	public int getPrice() { return this.price; }
//	public String getColor() { return this.color; }
//	public String getIsbn() { return this.isbn;}
//}
