package array_learning;
public class ArrayPrimitive {
   public static void main(String args[]) {
		int[]rollNumber = new int [10];//Array
		for (int i=0;i<10;i++)
		{
			rollNumber[i]=i+100;
		}
		String[]names= new String[10];
		        names[0]="Sakshi";
				names[1]="Nikita";
				names[2]="Rashi";
				names[3]="Harsh";
				names[4]="Rutu";
				names[5]="Pratik";
				names[6]="Madhuri";
				names[7]="Akshta";
				names[8]="Arti";
				names[9]="Pratiksha";
				
				String[]adress= new String[10];
				adress[0]="Pune";
			    adress[1]="Junnar";
				adress[2]="Buldhana";
				adress[3]="Daund";
				adress[4]="Wagholi";
				adress[5]="Baramati";
				adress[6]="Beed";
				adress[7]="Bhigwan";
				adress[8]="Khadki";
				adress[9]="Karjat";
				for(int i=0;i<10;i++)
				{
					System.out.println("RollNumber:"+rollNumber[i]  +" "+"Name:"+names[i]  +" "+"Adress:"+adress[i]);
				}
	       }
	}