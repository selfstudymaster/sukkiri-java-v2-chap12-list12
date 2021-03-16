package fool;

import character.Character;
import human.Human;
import matango.Matango;

// chap12
// list12-17

// extendsとimplementsの両方使ったクラス定義
public class Fool extends Character implements Human {

	private String name;
	public String getName() {
		return this.name;
	}

	// CreatureからhpやgetName()などのメンバを継承している
	// Characterから継承した抽象メソッドattack()を実装
	public void attack(Matango m) {
		System.out.println(this.getName() + "は戦わず遊んでいる");
	}

	// さらにHumanから継承した4つの抽象メソッドを実装
	public void talk() {}
	public void watch() {}
	public void hear() {}
	public void run() {}
}
