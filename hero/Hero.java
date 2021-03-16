package hero;
import character.Character;
import matango.Matango;

// chap12
// list12-03,
public class Hero extends Character {

	public void attack(Matango m) { // Characterのattackメソッドをオーバーライドする
		System.out.println(this.name + "の攻撃！");
		System.out.println(m.name + "に10ポイントのダメージをあたえた！");
		m.hp -= 10;
	}
}
