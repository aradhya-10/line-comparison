import java.util.*;
import java.text.*;

public class LineComparison {
	int x1, x2, y1, y2;
	double length;

	LineComparison(int x1, int x2, int y1, int y2){
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}

	void calcLength(){
		this.length = Math.sqrt(Math.pow((this.x2-this.x1), 2) + Math.pow((this.y2-this.y1), 2));
		
		DecimalFormat fmt = new DecimalFormat("#.00");
		System.out.println("Length of Line P1("+this.x1+", "+this.y1+") - P2("+this.x2+", "+this.y2+"): "+ fmt.format(this.length));
	}

	int compareLength(LineComparison l){
		return Double.toString(this.length).compareTo(Double.toString(l.length));
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Line Comparison Computation Program on Main Branch");
		
		System.out.println("Enter the coordinates for 1st Point(x1,y2) for the first line: ");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		System.out.println("Enter the coordinates for 2nd Point(x2,y2) or the first line: ");
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		
		LineComparison L1 = new LineComparison(x1, x2, y1, y2);
		
		System.out.println("Enter the coordinates for 1st Point(x1,y2) for the second line: ");
		x1 = sc.nextInt();
		y1 = sc.nextInt();
		System.out.println("Enter the coordinates for 2nd Point(x2,y2) or the second line: ");
		x2 = sc.nextInt();
		y2 = sc.nextInt();

		LineComparison L2 = new LineComparison(x1, x2, y1, y2);
		sc.close();

		// double distance1 = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
		// double distance2 = Math.sqrt(Math.pow((a2-a1), 2) + Math.pow((b2-b1), 2));
		// System.out.println("Length of First Line = "+ fmt.format(distance1));
		// System.out.println("Length of Second Line = "+ fmt.format(distance2));
		
		L1.calcLength();
		L2.calcLength();
		
		// int check = Double.toString(distance1).compareTo(Double.toString(distance2));
		int check = L1.compareLength(L2);
		
		switch(check){
			case 0:
				System.out.println("Lengths are equal.");
				break;
			case 1:
				System.out.println("Line1 is bigger than Line2.");
				break;
			default:
				System.out.println("Line1 is smaller than Line2.");
		}
	}
}

