package creature;

//chap12
//list12-11 抽象クラスとして、抽象メソッドを定義
//public abstract class Creature {
//	public abstract void run();
//}

//list12-12 インターフェースとして定義
//public interface Creature {
//	public abstract void run();
//}

//list12-13 インターフェースとして定義
//インターフェースに宣言されたメソッドは自動的にpublic かつabstract になるので記述を省略可
public interface Creature {
	void run();
}
