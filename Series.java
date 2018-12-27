import java.util.Scanner;

public class Series {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double w = sc.nextDouble();
		double i = sc.nextDouble();
		double r = 1;
		double l = 1;
		double d = 1;
		
		
		
		for (int f = 1; f<i; f++) {
			r=r*f;
			l = (double) Math.pow(w, (f));
			d = d + (l/r);
			
		}
		//System.out.println(d);
		System.out.printf("%.2f", d);
	}

}
