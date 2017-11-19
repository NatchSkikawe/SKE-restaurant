import java.util.Scanner;

public class skerest {
	static Scanner  input = new Scanner(System.in);

	static int      choice, a = 0, b = 0, c = 0;
	static String   Ordering="| %-2s\t\t |  %4d  |   %5d     |\n";
        static String BTM="+---------------------------------------------------+\n| Total\t\t\t |\t\t %2d \t|\n----------------------------------------------------+\n";
	static String[] Menu = {"Cold noodles","Fried rice","Curry rice"};
	static int   [] Quantity = {a,b,c};
	static int   [] Price = {40,35,30};

	public static int getQuatity(){
		return input.nextInt();
	}
	static void SKErestaurant() {
		System.out.printf("--------- Welcome to SKE Restaurant ---------%n"
				+ "1) %-8s\t%3d Baht.%n"
				+ "2) %-8s\t%3d Baht.%n"
				+ "3) %-8s\t%3d Baht.%n"
				+ "4) Total%n5) Exit%n"
				,Menu[0],Price[0],Menu[1],Price[1],Menu[2],Price[2]);

		while (0 == 0) {
			System.out.printf("%nEnter your Choice: ");
			choice = input.nextInt();
			if (choice == 5) {
				System.out.print("=====Thank you=====");
				break;
			}

			switch (choice) {
			case 1:
				System.out.print("Enter Quantity: ");
				Quantity[0] += getQuatity();
				break;
			case 2:
				System.out.print("Enter Quantity: ");
				Quantity[1] += getQuatity();
				break;
			case 3:
				System.out.print("Enter Quantity: ");
				Quantity[2] += getQuatity();
				break;
			case 4:
				int sumPrice0 = Quantity[0] * Price[0];
				int sumPrice1 = Quantity[1] * Price[1];
				int sumPrice2 = Quantity[2] * Price[2];
				String Totally = Total(Quantity[0], Quantity[1], Quantity[2]);

				System.out.printf(Totally, Menu[0] , Quantity[0], sumPrice0,
							Menu[1] , Quantity[1], sumPrice1,
							Menu[2] , Quantity[2], sumPrice2);										

				System.out.printf(BTM,sumPrice0+sumPrice1+sumPrice2);
				break;
			}

		}
	}
        
	public static String Total(int a, int b, int c) {

		String total = "+------- Menu ------------Qty-------- Price---------+\n";
		if (a != 0) {
			total += Ordering;
		}
		if (b != 0) {
			total += Ordering;
		}
		if (c != 0) {
			total += Ordering;
		}

		return total;

	}

	public static void main(String[] args) {
		SKErestaurant();
	}

}