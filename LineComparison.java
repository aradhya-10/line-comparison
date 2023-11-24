import java.util.*;
import java.text.*;

public class LineComparison {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Line Comparison Computation Program on Main Branch");
		
		System.out.println("Enter the coordinates for 1st Point: ");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		System.out.println("Enter the coordinates for 2nd Point: ");
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();

		double distance = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
		DecimalFormat fmt = new DecimalFormat("#.00");
		System.out.println("Distance Between the points = "+ fmt.format(distance));
		sc.close();
	}
}
