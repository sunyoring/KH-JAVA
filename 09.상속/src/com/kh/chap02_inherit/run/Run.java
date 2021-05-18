package com.kh.chap02_inherit.run;

import com.kh.chap02_inherit.model.vo.Airplane;
import com.kh.chap02_inherit.model.vo.Car;
import com.kh.chap02_inherit.model.vo.Ship;
import com.kh.chap02_inherit.model.vo.Vehicle;

public class Run {

	public static void main(String[] args) {

		/*
		 * Car c = new Car("벤틀리",12.5,"sedan",4);
		 * 
		 * Airplane a = new Airplane("비행기", 0.021, "제트기",16,5);
		 * 
		 * Ship s = new Ship("낚시배",3,"어선",1);
		 * 
		 * System.out.println(c.information()); System.out.println(a.information());
		 * System.out.println(s.information()); c.howToMove(); a.howToMove();
		 * s.howToMove();
		 * 
		 */

		Vehicle[] ve = new Vehicle[3];
		ve[0] = new Car("벤틀리",12.5,"sedan",4);
		ve[1] = new Airplane("비행기", 0.021, "제트기",16,5);
		ve[2] = new Ship("낚시배", 3, "어선", 1);

		for (Vehicle v : ve) {
			if (v instanceof Airplane) {
				System.out.println(((Airplane) v).information());
				
			}else if (v instanceof Car) {
				System.out.println(((Car) v).information());
				

			}else {
				System.out.println(((Ship) v).information());
			

			}
			v.howToMove();

		}

	}

}
