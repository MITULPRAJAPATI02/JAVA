package p1;
import java.util.*;

public class pattern {

	public static void main(String[] args) {
			       
		System.out.println("WelCome TO  MMV"); 
		int ch;
		double finalbill = 0, offerbill = 0;
		int price = 0;
		int offer = 100;
		double discount = 0.2;
		do {
			System.out.println("1. For Gujarati");
			System.out.println("2. Punjabi");
			System.out.println("3. South India");
			System.out.println("4. Exit"); 
			Scanner obj = new Scanner(System.in);  
			System.out.println("Enter CH"); 
			ch = obj.nextInt(); 
			if (ch == 1) {
				price = 400;
			} else if (ch == 2) {
				price = 300;
			} else if (ch == 3) {
				price = 200;
			} else if (ch == 4) {
				break;
			// } else {
			// 	price = 0;
			}
			System.out.println("Enter Qnt"); 
			int qnt = obj.nextInt();
			int bill = qnt * price; 
			finalbill += bill; 
			System.out.println("Your Bill is " + bill); 
		} while (ch != 4); 
		System.out.println("Final Bill " + finalbill);  
		Scanner yo = new Scanner(System.in);  
		System.out.println("Do you have offer code? 1-yes or 2-no");
		int ch1 = yo.nextInt();
		if (ch1 == 1) {
			System.out.println("Enter offer code");
			Scanner mit = new Scanner(System.in);  
			int code = mit.nextInt();
			if (code == offer) {
				offerbill = finalbill - (finalbill * discount);
				System.out.println("Your offer price is " + offerbill); 
			}
		} else {
			System.out.println("Your Bill is " + finalbill); 
		}
	}
}
