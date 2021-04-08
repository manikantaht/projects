package jai;

import java.util.Scanner;

class Employee extends AllData {
	static NewG none = new NewG();
	static int index, leaves, holidays;
	static String username;

	public void checkemployee(String loginID, String pass) {
		int num = 0;
		for (int i = 0; i < emp_names.length; i++) {
			if (loginID.equals(emp_names[i]) && pass.equals(emp_passs[i])) {
				num = 1;
				none.getname("hello");
				System.out.println();
				none.getname("Mr " + emp_names[i]);
				index = i;
				username = emp_names[i];
				leaves = leaveleft[i];
			}
		}
		for (int i = 0; i < empnamelist.size(); i++) {
			if (loginID.equals(empnamelist.get(i)) && pass.equals(emppasslist.get(i))) {
				num = 1;
				none.getname("hello");
				System.out.println();
				none.getname("Mr " + empnamelist.get(i));
				index = i;
				username = empnamelist.get(i);
				leaves = leaveleft[i + 10];

			}
		}

		if (num != 1) {
			System.out.println(
					"================================================================================================");
			System.out.println("you have entered wrong username or password, try again");
			Launch.main(emp_names);
			System.out.println(
					"================================================================================================");
		}

	}

	public void completeemployee() {
		int num = employefunction();
		if (num > 4 || num < 0) {
			System.out.println(
					"================================================================================================");
			System.out.println("You Are Logged Out");
			Launch.main(emp_names);
			System.out.println(
					"================================================================================================");
		}
		empfunaction(num);
	}

	static int employefunction() {
		System.out.println(
				"================================================================================================");
		System.out.println("enter 1 to view number of leave pending");
		System.out.println("enter 2 to request for leave");
		System.out.println("enter 3 to check the status of leave request");
		System.out.println("enter any other number to logout");
		System.out.println(
				"================================================================================================");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		return num;
	}

	public void empfunaction(int num) {
		if (num == 1) {
			System.out.println(
					"================================================================================================");
			for (int i = 0; i < emp_ids.length; i++) {
				if (username.equals(emp_names[i])) {

					System.out.println(
							"Mr." + username + " You have total of " + leaveleft[i] + " days of leaves pending");
				} else if (username.equals(emp_names[i])) {

					System.out.println(
							"Mr." + username + " You have total of " + leaveleft[i + 10] + " days of leaves pending");
				}
			}
			System.out.println(
					"================================================================================================");
		} else if (num == 2) {
			System.out.println(
					"================================================================================================");
			for (int i = 0; i < emp_ids.length; i++) {
				if (username.equals(emp_names[i])) {
					System.out.println("Mr." + username + ", how many days of leaves do you need");
					Scanner sc = new Scanner(System.in);
					int holidays = sc.nextInt();
					if (holidays > leaveleft[i]) {
						System.out.println("you cannot take a leave for " + holidays + " days");
						completeemployee();
					} else {
						leaverequest[i] = holidays;
						System.out.println("leave request sent to the manager");
					}
				}
			}
			for (int i = 0; i < empnamelist.size(); i++) {
				if (username.equals(empnamelist.get(i))) {
					System.out.println("Mr." + username + ", how many days of leaves do you need");
					Scanner sc = new Scanner(System.in);
					holidays = sc.nextInt();
					if (holidays > leaveleft[i + emp_ids.length]) {
						System.out.println("you cannot take a leave for " + holidays + " days");
						completeemployee();
					} else {
						leaverequest[i + emp_ids.length] = holidays;
						System.out.println("leave request sent to the manager");
					}
				}
			}
			System.out.println(
					"================================================================================================");
		} else if (num == 3) {
			System.out.println(
					"================================================================================================");
			for (int i = 0; i < emp_names.length; i++) {
				if (username.equals(emp_names[i])) {
					if (leavestatus[i].equalsIgnoreCase("pending")) {
						System.out.println("Your Leave Status is still pending");
					} else if (leavestatus[i].equalsIgnoreCase("yes")) {
						System.out.println("Your Leave Status approved");
						leavestatus[i] = "pending";
					} else if (leavestatus[i].equalsIgnoreCase("no")) {
						System.out.println("Your Leave Status is not approved");
						leavestatus[i] = "pending";
					}

				}
			}
			for (int i = 0; i < empnamelist.size(); i++) {
				if (username.equals(empnamelist.get(i))) {
					if (leavestatus[i + emp_ids.length].equalsIgnoreCase("pending")) {
						System.out.println("Your Leave Status is still pending");
					} else if (leavestatus[i + emp_ids.length].equalsIgnoreCase("yes")) {
						System.out.println("Your Leave Status approved");
						leavestatus[i + emp_ids.length] = "pending";
					} else if (leavestatus[i + emp_ids.length].equalsIgnoreCase("no")) {
						System.out.println("Your Leave Status is not approved");
						leavestatus[i + emp_ids.length] = "pending";
					}

				}
			}
			System.out.println(
					"================================================================================================");
		}
		System.out.println("enter 1 to repeat the menu");
		System.out.println("enter any other number to log out");
		System.out.println(
				"================================================================================================");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if (number == 1) {
			completeemployee();
		} else {
			System.out.println(
					"================================================================================================");
			System.out.println("You Are Logged Out");
			Launch.main(emp_names);
			System.out.println(
					"================================================================================================");
		}

	}

}