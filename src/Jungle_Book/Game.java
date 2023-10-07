package Jungle_Book;

public class Game {
	public static void main(String args[])
	{
		Bear b= new Bear();
		b.name="Baloo";
		b.drink();
		b.eat();
		b.honeyDring();
		b.sleep();
		b.walk();
		
		Tiger t=new Tiger();
		t.name="Sherkhan";
		t.drink();
		t.eat();
		t.roar();
		t.sleep();
		t.walk();
		
		Snake s=new Snake();
		s.name="Ka";
		s.drink();
	    s.eat();
		s.sleep();
		s.bite();
		
		Human h=new Human();
		h.name="Mogli";
		h.drink();
		h.eat();
		h.think();
		h.sleep();
		h.walk();
		
		Wolf w=new Wolf();
		w.name="Bagira";
		w.drink();
		w.eat();
		w.bark();
		w.sleep();
		w.walk();




		
	}

}
 