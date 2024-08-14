package area;

import java.util.Scanner;

public class AreaRectangle {

	
		// TODO Auto-generated method stub
		static double areaRectangle(double height, double base) {
			return 1.0 * height * base;
		}
		
		


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("give me input of base");
			double base = sc.nextDouble();

		    Scanner sc1 = new Scanner(System.in);
			System.out.println("give me height");
			double height = sc1.nextDouble();
			
			
			System.out.println("the area of the Rectangle is: "+areaRectangle(height, base));

	}

}
