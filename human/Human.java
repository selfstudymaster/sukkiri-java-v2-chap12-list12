package human;
import creature.Creature;

// chap12
// list12-16

// 親インターフェースから子インターフェースの継承はextendsを用いる
public interface Human extends Creature {
	void talk();
	void watch();
	void hear();
	// さらに親インターフェースからrun()メソッドを継承している
}
