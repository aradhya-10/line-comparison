import java.util.*;
import java.text.*;

public class LineComparison {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Line Comparison Computation Program on Main Branch");
		
		System.out.println("Enter the coordinates for 1st Point(x1,y2) for the first line: ");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		System.out.println("Enter the coordinates for 2nd Point(x2,y2) or the first line: ");
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		
		System.out.println("Enter the coordinates for 1st Point(x1,y2) for the second line: ");
		int a1 = sc.nextInt();
		int b1 = sc.nextInt();
		System.out.println("Enter the coordinates for 2nd Point(x2,y2) or the second line: ");
		int a2 = sc.nextInt();
		int b2 = sc.nextInt();
		sc.close();

		double distance1 = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
		double distance2 = Math.sqrt(Math.pow((a2-a1), 2) + Math.pow((b2-b1), 2));

		DecimalFormat fmt = new DecimalFormat("#.00");
		System.out.println("Length of First Line = "+ fmt.format(distance1));
		System.out.println("Length of Second Line = "+ fmt.format(distance2));
		
		int check = Double.toString(distance1).compareTo(Double.toString(distance2));
		switch(check){
			case 0:
				System.out.println("Lengths are equal.");
				break;
			case 1:
				System.out.println("Line1 is bigger than Line 2.");
				break;
			default:
				System.out.println("Line1 is smaller than Line 2.");
		}
	}
}
