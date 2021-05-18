package practice3.controller;

import practice3.model.vo.Animal;
import practice3.model.vo.Cat;
import practice3.model.vo.Dog;

public class AnimalManager {
	
	public static void main(String[] args) {
		
		Animal[] ani = new Animal[5];
		
		ani[0] = new Cat("깜돌이","턱시도","한국","검은색");
		ani[1] = new Dog("럭키","푸들",2);
		ani[2] = new Cat("하양이","삼색이","한국","삼색");
		ani[3] = new Cat("아깽이","고등어","한국","고등어색");
		ani[4] = new Dog("예삐","시고르자브종",10);
		
		
		for(Animal a : ani) {
			a.speak();
		}
	}
}
