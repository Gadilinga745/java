package java651;
import java.util.*;
public class Labsheet2{

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number, exponent and modulo value:");
		int n=sc.nextInt();
		long m=sc.nextInt();
		long sum=0;
		for (int i =0; i<n; i++) {
			long z = sc.nextInt();
			sum = (sum+z)%m;
			}
		    System.out.println(sum);
	}
}
