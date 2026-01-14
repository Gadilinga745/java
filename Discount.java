package java651;
import java.util.Scanner;
public class Discount 
{
	public static void main(String[] args) 
	{		
		Scanner sc = new Scanner(System.in);
        int n;
        int price, discount_percent;
        int discPrice;
        int total = 0;
        int fc5 = 0, fc10 = 0;
        int finalCost;
        System.out.println("Enter the number of items:");
        n = sc.nextInt();
        System.out.println("Enter price and discount percentage for each item:");
        for (int i = 1; i <= n; i++) 
        {
            price = sc.nextInt();
            discount_percent = sc.nextInt();
            discPrice = price - (price * discount_percent / 100);
            total += discPrice;
        }
        if (total > 500) 
            fc5 = total - (total * 10/ 100);
        else 
            fc5 = total;
        if (total > 1000) 
            fc10 = total - 150;
        else 
            fc10 = total;
        finalCost = min(fc5, fc10);
        System.out.println("Final cost to be paid: " + finalCost);
        sc.close();
    }
    public static int min(int a, int b) 
    {
        if (a < b) 
            return a;
        else 
            return b;
	}

}
