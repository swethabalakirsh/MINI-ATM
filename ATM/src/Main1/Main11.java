package Main1;

import java.util.Scanner;
import java.io.*;

public class Main11 {

	// ------------forColor------------
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
	public static final String ANSI_YELLOW = "\u001B[33m";

	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";

	// ------------forColor------------

	public static void main(String[] args) throws InterruptedException {

		// -----implementsCode for the ATM
		Scanner sc = new Scanner(System.in);

		int ACCNO = 123456;
		int Balance = 900;
		int addAmt = 0;
		String name = "Nisha";
		System.out.println("*************************** Welcome To The ATM.....!***************************");

		Thread.sleep(2000);

		System.out.println("\n*************************** ENTER YOUR PIN.....!***************************");
		int s = sc.nextInt();

		Thread.sleep(1000);

		System.out.println(" LOADING.....!");

		// ------------------------------------STARTED---------------------------

		if (s == 123) {

			Thread.sleep(900);
			System.out.println(
					ANSI_GREEN_BACKGROUND + "\nEVERYTHING IS FINE...YOU MAY PROCEED...!" + name + "\n" + ANSI_RESET);

			while (true) {
				Thread.sleep(950);
				System.out.println("\t1.DEPOSIT\t2.WITHDRAW\t3.BALANCE-ENQURE \t4.MINISTMT \t5.EXIT");
				int tocheck = sc.nextInt();
				switch (tocheck) {
				
				case 1: {
					System.out.println("\n DEPOSIT \n");
					System.out.println("ENTER YOUR DEPOSITING SAVINGAMOUNT&AMOUNT =\n");
					int addmt = sc.nextInt();
					if (addmt >0) {
						Balance = Balance + addmt;
						System.out.println("\nYOUR SAVINGACCOUNT BALANCE = " + Balance + "\n");
					}
					else 
						System.out.println(ANSI_RED_BACKGROUND + "\nINVALITED PIN NUMBER" + ANSI_RESET);
//					Balance = Balance + addmt;
//					System.out.println("\nYOUR SAVINGACCOUNT BALANCE = " + Balance + "\n");

					break;

				}
				case 2: {
					System.out.println("WITHDRAW\n");
					System.out.println("\nENTER WITHDRAW AMOUNT =");
					int towith = sc.nextInt();

					System.out.println("\t1.SAVING-ACCOUNT\t2.CURRENT-ACCOUNT\n");
					int sAC = sc.nextInt();
					switch (sAC) {
					case 1: {

						if (towith < Balance && towith > 0) {
							Balance = Balance - towith;
							Thread.sleep(900);
							System.out.println("\nYOUR SAVINGACCOUNT BALANCE = " + Balance + "\n");
						} else
							System.out.println(ANSI_RED_BACKGROUND + "INVALIED AMOUNT" + ANSI_RESET);
						break;
					}

					case 2: {

						if (towith < Balance && towith > 0) {
							Balance = Balance - towith;
							System.out.println("\nYOUR CURRENT-ACCOUNT BALANCE = " + Balance + "\n");
						} else
							System.out.println(ANSI_RED_BACKGROUND + "INVALIED AMOUNT" + ANSI_RESET);
						break;
					}

					default:
						System.out.println("INVALIED NUMBER");
					}

					break;

				} // CASE2
				case 3: {
					System.out.println("BALANCE-ENQURE");
					System.out.println("YOUR CURRENT ACCOUNT-BALANCE IS : " + Balance);

					break;

				}
				case 4: {
					System.out.println("MINISTMT");
					Thread.sleep(900);
					System.out.println(ANSI_RED_BACKGROUND + "*********************************\n" + ANSI_RESET);
					System.out.println("YOUR-NAME :" + name + "\n");
					System.out.println("ACCOUNT-NO :" + ACCNO + "\n");
					System.out.println("CURRENT-BALANCES :" + Balance + "\n");

					System.out.println(ANSI_RED_BACKGROUND + "*********************************\n" + ANSI_RESET);

					break;

				}
				case 5: {
					System.out.println("Thanks for using this ATM.....!");
					System.exit(0);
				}

				default:{
					System.out.println("INVALIED NUMBER  " + tocheck);
//					// System.out.println("T " + tocheck);
//					 System.exit(0);
					break;

				}

			}

		}}

		else {
			Thread.sleep(900);

			System.out.println(ANSI_RED_BACKGROUND + "\nINVALITED PIN NUMBER" + ANSI_RESET);

		}

		
	}

}
