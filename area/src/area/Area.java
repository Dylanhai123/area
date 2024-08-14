package area;
import java.util.Scanner;
public class Area {
	
	
	static double areaTriangle(double height, double base) {
		return 0.5 * height * base;
	}
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("give me input of base");
		double base = sc.nextDouble();

	    Scanner sc1 = new Scanner(System.in);
		System.out.println("give me height");
		double height = sc1.nextDouble();
		
		
		System.out.println("the area of the triangle is: "+areaTriangle(height, base));

}
}

	
	
