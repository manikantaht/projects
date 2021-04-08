package jai;

import java.util.Scanner;

class admin extends manager {
	static int num;

	public static void checkadmin(String loginID, String pass) {
		int num = 0;
		for (int i = 0; i < AdminName.length; i++) {
			if (loginID.equals(AdminName[i]) && pass.equals(AdminPass[i])) {
				num = 1;
				none.getname("hello");
				System.out.println();
				none.getname("Mr " + AdminName[i]);
			}

		}
		if (num != 1) {
			System.out.println(
					"================================================================================================");
			System.out.println("you have entered wrong username or password, try again");
			Launch.main(AdminName);
			System.out.println(
					"================================================================================================");
		}

	}

	public static void completeadmin() {
		int number = adminfunction();
		if (number < 1 || number > 6) {
			System.out.println(
					"================================================================================================");
			Launch.main(AdminName);
			System.out.println("you are logged out");
			System.out.println(
					"================================================================================================");
		}
		functionaction(number);
	}

	static int adminfunction() {
		System.out.println(
				"================================================================================================");
		System.out.println("enter 1 to view the list of employees");
		System.out.println("enter 2 to view the list of managers");
		System.out.println("enter 3 to add new manager");
		System.out.println("enter 4 to add new employees");
		System.out.println("enter 5 to remove the existing manager");
		System.out.println("enter 6 to remove the existing employee");
		System.out.println("enter any other number to logout");
		System.out.println(
				"================================================================================================");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		return num;
	}

	static void functionaction(int number) {
		if (number == 1) {
			System.out.println(
					"================================================================================================");
			System.out.println("the list of employees is");
			for (int i = 0; i < emp_ids.length; i++) {
				System.out.println(emp_names[i]);
			}
			for (int i = 0; i < empnamelist.size(); i++) {
				System.out.println(empnamelist.get(i));
			}
			System.out.println(
					"================================================================================================");
		} else if (number == 2) {
			System.out.println(
					"================================================================================================");
			System.out.println("the list of managers is");
			for (int i = 0; i < man_ids.length; i++) {
				System.out.println(man_names[i]);
			}
			for (int i = 0; i < mannamelist.size(); i++) {
				System.out.println(mannamelist.get(i));
			}
			System.out.println(
					"================================================================================================");
		} else if (number == 3) {
			System.out.println(
					"================================================================================================");
			System.out.println("enter the new manager ID for new manager");
			Scanner sc = new Scanner(System.in);
			manidlist.add(sc.nextInt());
			System.out.println("enter the name of the new manager");
			Scanner scan = new Scanner(System.in);
			String man_name = scan.nextLine();
			mannamelist.add(man_name);
			System.out.println("enter the password for the new manager");
			Scanner scaned=new Scanner(System.in);
			manpasslist.add(scaned.nextLine());
			System.out.println("the new manager " + man_name + " is added in the database");
			System.out.println(
					"================================================================================================");
		} else if (number == 4) {
			System.out.println(
					"================================================================================================");
			System.out.println("enter the new employee ID for new employee");
			Scanner sc = new Scanner(System.in);
			empidlist.add(sc.nextInt());
			System.out.println("enter the name of the new employee");
			Scanner scan = new Scanner(System.in);
			String emp_name = scan.nextLine();
			empnamelist.add(emp_name);
			System.out.println("enter the password for the new employee");
			Scanner scaned=new Scanner(System.in);
			emppasslist.add(scaned.nextLine());
			System.out.println("enter the name of the assigned manager of the perticular");
			System.out.println("the new manager " + emp_name + " is added in the database");
			System.out.println(
					"================================================================================================");
		} else if (number == 5) {
			System.out.println(
					"================================================================================================");
			System.out.println("enter the id of an manager who should be removed");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			int a = 0;
			for (int i = 0; i < man_ids.length; i++) {
				if (num == man_ids[i]) {
					man_ids[i] = 0;
					man_names[i] = null;
					man_passs[i] = null;
					a = 1;
				}
			}
			for (int i = 0; i < manidlist.size(); i++) {
				if (num == manidlist.get(i)) {
					manidlist.remove(i);
					mannamelist.remove(i);
					manpasslist.remove(i);
					a = 1;
				}
			}
			if (a != 1) {
				System.out.println(
						"================================================================================================");
				System.out.println("Manager ID not found, try again");
				completeadmin();
				System.out.println(
						"================================================================================================");
			} else {
				System.out.println(
						"================================================================================================");
				System.out
						.println("The Manager with manager ID: " + num + " is successfully removes from the database");
			}

		} else if (number == 6) {
			System.out.println(
					"================================================================================================");
			System.out.println("enter the id of an employee who should be removed");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			int a = 0;
			for (int i = 0; i < emp_ids.length; i++) {
				if (num == emp_ids[i]) {
					emp_ids[i] = 0;
					emp_names[i] = null;
					emp_passs[i] = null;
					emp_man[i] = null;
					a = 1;
				}
			}
			for (int i = 0; i < empidlist.size(); i++) {
				if (num == empidlist.get(i)) {
					empidlist.remove(i);
					empnamelist.remove(i);
					emppasslist.remove(i);
					empmanlist.remove(i);
					a = 1;
				}
			}
			if (a != 1) {
				System.out.println(
						"================================================================================================");
				System.out.println("Employee ID not found, try again");
				completeadmin();
				System.out.println(
						"================================================================================================");
			} else {
				System.out.println(
						"================================================================================================");
				System.out.println(
						"The Employee with employee ID: " + num + " is successfully removes from the database");
			}

		}
		System.out.println("To repeat the menu enter 1");
		System.out.println("To logout Enter any number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (num == 1) {
			completeadmin();
		} else {
			System.out.println(
					"================================================================================================");
			System.out.println("You Are Logged Out");
			Launch.main(AdminName);
			System.out.println(
					"================================================================================================");
		}

	}

}