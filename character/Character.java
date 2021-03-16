package character;

import matango.Matango;

// chap12
// list12-01
//public class Character {
//	String name;
//	int hp;
//
//	public void run() {
//		System.out.println(this.name + "は逃げ出した！");
//	}
//
//	public void attack(Matango m) {
//		System.out.println(this.name + "の攻撃！");
//		m.hp = ??; // 不都合A 継承先により変わるため詳細未定メソッド
//		System.out.println("的に？？ポイントのダメージを与えた！");
//	}
//}

// list12-02
//public class Character {
//	public String name;
//	public int hp;
//
//	public void run() {
//		System.out.println(this.name + "は逃げ出した！");
//	}
//
//	public void attack(Matango m) {
//		// 不都合A 継承先により変わるため詳細未定メソッドのため、空にしておくと、
//		// 「現時点で処理内容を確定できないメソッド」なのか「何もしないメソッド」なの区別がつかない。
//	}
//}

// list12-07
// 抽象メソッドabstractをもつことを、クラスの宣言する時にも明示する必要がある
// 抽象クラスはnewによるインスタンス化が禁止される
public abstract class Character {

	public String name;
	public int hp;

	public void run() {
		System.out.println(this.name + "は逃げ出した！");
	}
	// abstractをつけて明示的に「現時点で処理内容を確定できないメソッド」と表明する
	public abstract void attack(Matango m);

}