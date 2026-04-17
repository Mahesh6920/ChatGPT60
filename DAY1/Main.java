package DAY1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Admin ID: ");
		int aID = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Admin Name: ");
		String aName = sc.nextLine();
		System.out.println("Enter Admin Mail: ");
		String aMail = sc.nextLine();
		System.out.println("Enter Password: ");
		String aPassword = sc.nextLine();
		
		System.out.println("Admin Level: ");
		String adminLevel = sc.nextLine();


		Admin admin = new Admin(aID, aName, aMail, aPassword);

		admin.setAdminLevel(adminLevel);

		System.out.println("Admin ID: " + admin.getId());
		System.out.println("Admin Name: " + admin.getName());
		System.out.println("Admin Mail: " + admin.getMail());
		System.out.println("Admin Level: " + admin.getAdminLevel());

		System.out.println();

		System.out.println("Enter User ID: ");
		int uID = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter User Name: ");
		String uName = sc.nextLine();
		System.out.println("Enter User Mail: ");
		String uMail = sc.nextLine();
		System.out.println("Enter Password: ");
		String uPassword = sc.nextLine();

		
		Customer customer = new Customer(uID, uName, uMail, uPassword);

		customer.addMoney(100);

		System.out.println("Customer ID: " + customer.getId());
		System.out.println("Customer Name: " + customer.getName());
		System.out.println("Customer Mail: " + customer.getMail());
		System.out.println("Wallet Balance: " + customer.getWalletBalance());
	}
}
