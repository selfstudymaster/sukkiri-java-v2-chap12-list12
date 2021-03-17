package asset;

// chap12
// practice12-02

//practice12-02 解答
//(ア):Asset, (イ):IntangibleAsset, (ウ):Patent
public abstract class Asset {
	private String name;
	private int price;

	// コンストラクタ
	public Asset(String name, int price) {
		this.name = name;
		this.price = price;
	}

	// getterメソッド
	public String getName() { return this.name; }
	public int getPrice() { return this.price; }
}
