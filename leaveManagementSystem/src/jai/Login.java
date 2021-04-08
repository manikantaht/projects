package jai;

import java.util.Scanner;

public class Login {
	static String LoginID, Pass;

	@SuppressWarnings("resource")
	public void Loginp() {
		System.out.println(
				"================================================================================================");
		System.out.println("Enter the UserName");
		Scanner Login = new Scanner(System.in);
		LoginID = Login.nextLine();
		System.out.println("Enter the Password");
		Pass = Login.nextLine();
		System.out.println(
				"================================================================================================");
	}

	public String returnLogin() {
		return LoginID;
	}

	public String returnPass() {
		return Pass;
	}

}