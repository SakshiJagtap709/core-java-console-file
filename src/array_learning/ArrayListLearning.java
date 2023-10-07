package array_learning;

import java.util.ArrayList; 
public class ArrayListLearning {
	
	public static void main(String args[]) {
		String[] stArr = new String[5];
		
		
		
		ArrayList<User> alHomo = new ArrayList<>();
		
	    ArrayList alHetero = new ArrayList<>();//Generics
	
	
	alHetero.add("Sakshi");
	alHetero.add(123);
	alHetero.add(1.3);
	alHetero.add(true);
	alHetero.add('c');
	alHetero.add(new User ());
	
	System.out.println(alHetero.get(0));
	System.out.println(alHetero.get(1));
	System.out.println(alHetero.get(2));
	System.out.println(alHetero.get(3));
	System.out.println(alHetero.get(4));
	System.out.println(alHetero.get(5));
	
}
}




