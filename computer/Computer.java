package computer;
import tangibleasset.TangibleAsset;

//chap12
// practice12-01 自分で解答したコード
public class Computer extends TangibleAsset{
	private String makerName;

	// コンストラクタ
	public Computer(String name, int price, String color, String makerName) {
		super(name, price, color);
		this.makerName = makerName;
	}

	// getterメソッド
	public String getMakerName() { return this.makerName; }

}


//practice12-01 元のコード
//public class Computer {
//	private String name;
//	private int price;
//	private String color;
//	private String makerName;
//
//	// コンストラクタ
//	public Computer(String name, int price, String color, String makerName) {
//		this.name = name;
//		this.price = price;
//		this.color = color;
//		this.makerName = makerName;
//	}
//
//	// getterメソッド
//	public String getName() { return this.name;}
//	public int getPrice() { return this.price; }
//	public String getColor() { return this.color; }
//	public String getMakerName() { return this.makerName; }
//
//}
