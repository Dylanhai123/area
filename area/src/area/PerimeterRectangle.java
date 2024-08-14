package area;

import java.util.Scanner;

public class PerimeterRectangle {

	
		// TODO Auto-generated method stub
	static double perimeterRectangle(double height, double base) {
		return 2.0 *  height +   base;
		}	
			


			public static void main(String[] args) {
				// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in);
				System.out.println("give me input of base");
				double base = sc.nextDouble();

			    Scanner sc1 = new Scanner(System.in);
				System.out.println("give me height");
				double height = sc.nextDouble();
				
				
				System.out.println("the perimeter of the rectangle is: "+perimeterRectangle(height, 2.0 * base));


		
			
			
			

	}

}	






