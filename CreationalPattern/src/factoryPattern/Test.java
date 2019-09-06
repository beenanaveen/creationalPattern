package factoryPattern;

import java.util.Scanner;

public class Test {

	public static void main(String[] a) {
		FactoryClass fact=new FactoryClass();
		System.out.println("Please enter type of  shape");
		Scanner input=new Scanner(System.in);
		String type=input.nextLine();
		
		Shapes t=fact.getShape(type);
		if(t!=null)
			System.out.println("Triangle has "+t.getNumberOfSides()+" sides");
		else
			System.out.println("There is no such shape");
		
		
	}
}
