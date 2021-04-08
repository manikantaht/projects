package jai;

import java.util.Scanner;

class manager extends Employee {

	public void checkmanager(String loginID, String pass) {
		int num = 0;
		for (int i = 0; i < man_names.length; i++) {
			if (loginID.equals(man_names[i]) && pass.equals(man_passs[i])) {
				num = 1;
				none.getname("hello");
				System.out.println();
				none.getname("Mr " + man_names[i]);
			}
		}
		for (int i = 0; i < mannamelist.size(); i++) {
			if (loginID.equals(mannamelist.get(i)) && pass.equals(manpasslist.get(i))) {
				num = 1;
				none.getname("hello");
				System.out.println();
				none.getname("Mr " + mannamelist.get(i));
				index = i;
			}
		}

		if (num != 1) {
			System.out.println(
					"================================================================================================");
			System.out.println("you have entered wrong username or password, try again");
			Launch.main(man_names);
			System.out.println(
					"================================================================================================");
		}
	}

	static void completemanager() {
		int number = managerfunction();
		if (number > 3 || number < 1) {

			System.out.println(
					"================================================================================================");
			Launch.main(man_names);
			System.out.println("you are logged out");
			System.out.println(
					"================================================================================================");
		}
		manfunaction(number);
	}

	static int managerfunction() {
		System.out.println(
				"================================================================================================");
		System.out.println("Enter 1 to view all the employees");
		System.out.println("Enter 2 to view the leave requests");
		System.out.println("Enter 3 to to take action for the requests");
		System.out.println("Enter any other number to log out");
		System.out.println(
				"================================================================================================");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		return num;
	}

	public static void manfunaction(int number) {

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
			int ind=0;
			for (int i = 0; i < emp_names.length; i++) {
				if (leaverequest[i]!=0)
				{ind=1;
					System.out.println(
							"================================================================================================");
					System.out.println("You Have a Leave request from Mr." + emp_names[i]);
					System.out.println(
							"================================================================================================");
				} 
			}
			
			for (int i = 0; i < empnamelist.size(); i++) {
				if (leaverequest[i + 10]!=0) {ind=1;
					System.out.println(
							"================================================================================================");
					System.out.println("You Have a Leave request from Mr." + emp_names[i]);
					System.out.println(
							"================================================================================================");
				}
				if(ind!=1) {
					System.out.println(
							"================================================================================================");
					System.out.println("There are no Leave requests pending");
					System.out.println(
							"================================================================================================");
					}

			}
		} else if (number == 3) {
			int ind=0;
			for (int i = 0; i < emp_names.length; i++) {
				if (leaverequest[i]!=0) {ind=1;
					System.out.println(
							"================================================================================================");
					System.out.println("You Have a Leave request from Mr." + emp_names[i] + " for " + leaverequest[i]
							+ " number of days");
					System.out.println("enter 1 to grant the leave");
					System.out.println("enter 0 to reject the leave");
					Scanner sc = new Scanner(System.in);
					int num = sc.nextInt();
					if (num == 1) {
						leavestatus[i] = "yes";
						System.out.println(
								"You have granted the leave to Mr." + emp_names[i] + " for " + leaverequest[i] + " days");
						leaveleft[i] = leaveleft[i] - leaverequest[i];

					} else if (num == 0) {
						leavestatus[i] = "no";
						System.out.println(
								"You have rejected the leave to Mr." + emp_names[i] + " for " + leaverequest[i] + " days");

					} else {
						System.out.println("you have entered wrong input");
						completemanager();
					}
					System.out.println(
							"================================================================================================");
				
				}
			}
			for (int i = 0; i < empnamelist.size(); i++) {
				if (leaverequest[i + emp_ids.length]!=0) {ind=1;
					System.out.println(
							"================================================================================================");
					System.out.println("You Have a Leave request from Mr." + empnamelist.get(i) + " for " + leaverequest[i + emp_ids.length]
							+ " number of days");
					System.out.println("enter 1 to grant the leave");
					System.out.println("enter 0 to reject the leave");
					Scanner sc = new Scanner(System.in);
					int num = sc.nextInt();
					if (num == 1) {
						leavestatus[i] = "yes";
						System.out.println("You have granted the leave to Mr." + empnamelist.get(i) + " for " + leaverequest[i + emp_ids.length]
								+ " days");
						leaveleft[i] = leaveleft[i] - leaverequest[i + emp_ids.length];

					} else if (num == 0) {
						leavestatus[i] = "no";
						System.out.println("You have rejected the leave to Mr." + empnamelist.get(i) + " for "
								+ leaverequest[i + emp_ids.length] + " days");

					} else {
						System.out.println("you have entered wrong input");
						completemanager();
					}
					System.out.println(
							"================================================================================================");
				} 

			}if(ind!=0) {
				System.out.println(
						"================================================================================================");
				System.out.println("There are no Leave requests pending");
				System.out.println(
						"================================================================================================");
				}
		}

		System.out.println("enter 1 to repeat the menu");
		System.out.println("enter any other number to log out");
		System.out.println(
				"================================================================================================");
		Scanner sc = new Scanner(System.in);
		int numbe = sc.nextInt();
		if (number == 1) {
			completemanager();
		} else {
			System.out.println(
					"================================================================================================");
			System.out.println("You Are Logged Out");
			Launch.main(man_names);
			System.out.println(
					"================================================================================================");
		}

	}
}
