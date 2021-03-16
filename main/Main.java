package main;

import dancer.Dancer;
import hero.Hero;
import matango.Matango;

public class Main {

	public static void main(String[] args) {

		Hero h = new Hero();
		h.name = "ミナト";
		Matango m = new Matango();
		m.name = "マタンゴ";
		Dancer d = new Dancer();
		d.name = "踊り子";

		h.attack(m);
		d.attack(m);
	}
}
