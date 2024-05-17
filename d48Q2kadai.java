// s23006
// 動物を産み出して,鳴き声を出力するプログラム

class Animal {
    public void makeSound() {
	System.out.println("動物の音");
    }
    public void test() {
	System.out.println("テスト出力");
    }
}

class Dog extends Animal {
    public void makeSound() {
	System.out.println("ワンワン");
    }
}

public class d48Q2kadai {
    public static void main(String[] args) {
 	Animal a = new Dog();
	Animal c = new Cat();
	a.makeSound();
	a.test();
	c.makeSound();
    }
}

class Cat extends Animal {
    public void makeSound() {
	System.out.println("ニャンニャン");
    }
}
