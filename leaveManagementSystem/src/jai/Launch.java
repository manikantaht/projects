package jai;

import java.util.Scanner;

public class Launch {
	static String LoginID, Pass;

	public static void login() {
		Login Log = new Login();
		Log.Loginp();
		LoginID = Log.returnLogin();
		Pass = Log.returnPass();
	}

	public static void main(String[] args) {
		admin a = new admin();

		System.out.println(
				"================================================================================================");
		System.out.println("login here");
		System.out.println("Enter 1 if you are an Admin");
		System.out.println("Enter 2 if you are an Manager");
		System.out.println("Enter 3 if you are an Employee");
		System.out.println(
				"================================================================================================");
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		if (option == 1) {
			login();
			a.checkadmin(LoginID, Pass);
			a.completeadmin();
		} else if (option == 2) {
			login();
			a.checkmanager(LoginID, Pass);
			a.completemanager();

		} else if (option == 3) {
			login();
			a.checkemployee(LoginID, Pass);
			a.completeemployee();

		} else {
			System.out.println("enter proper input, try again");
			main(args);
		}

	}
}