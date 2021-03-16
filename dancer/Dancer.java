package dancer;

import character.Character;
import matango.Matango;

// chap12
// list12-09, 12-10
public class Dancer extends Character {

	public void dance() {
		System.out.println(this.name + "は情熱的に踊った１");
	}
	// list12-09 attack();をオーバーライドし忘れるとコンパイルエラーになる
	// list12-10
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃！");
		System.out.println(m.name + "に3ポイントのダメージをあたえた！");
		m.hp -= 3;
	}
}
