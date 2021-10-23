package ATM;

import java.io.IOException;
import java.util.Scanner;

public class Atm_Banking {
	
	
	
	public static void main(String[] args) throws IOException {
		int pilihan, tambah, kurang, hasil, simpan;

		Scanner input = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		System.out.println("=========== LOGIN ==========");
		System.out.println("				");
		System.out.print("-----------= Masukan PIN =-----------");
		int pin = input.nextInt();
		String status = null;

		Login login = new Login();
		Balance balance = new Balance();
		ReadFile readfile = new ReadFile();
		login.enter_menu(pin);

		status = login.getStatus();

		while (status.equalsIgnoreCase("masuk")) {
			System.out.println("        ");
			System.out.println("-----------= MENU ATM =-----------");
			System.out.println("-1. BALANCE           =-----------");
			System.out.println("-2. DEPOSIT           =-----------");
			System.out.println("-3. TRANSFER          =-----------");
			System.out.println("-4. KELUAR            =-----------");
			System.out.println("-----------= ######## =-----------");
			System.out.print("Masukkan Pilihan Anda : ");
			pilihan = Integer.parseInt(input.next());

			switch (pilihan) {
			case 1:
				// System.out.println("Your Balance is : $ "+ balance.getSaldo());

				if (pin == 1234) {

					if (Double.parseDouble(readfile.readText().get(1)) < 0) {
						System.out.println("Your Balance is  : $ " + 0);
						System.out.println("Owed " + Math.abs(Integer.parseInt(readfile.readText().get(1))));
					} else {
						System.out.println("Your Balance is  : $ " + readfile.readText().get(1));
					}
				}

				else if (pin == 2345) {

					if (Double.parseDouble(readfile.readText().get(3)) < 0) {
						System.out.println("Your Balance is  : $ " + 0);
						System.out.println("Owed " + Math.abs(Integer.parseInt(readfile.readText().get(3))));
					} else {
						System.out.println("Your Balance is  : $ " + readfile.readText().get(3));
					}
				}

				break;

			case 2:
				System.out.print("DEPOSIT = $ ");
				int deposit = input.nextInt();
				balance.setSaldo(deposit, pin);

				if (pin == 1234) {

					if (Double.parseDouble(readfile.readText().get(1)) < 0) {
						System.out.println("Your Balance is  : $ " + 0);
						System.out.println("Owed " + Math.abs(Integer.parseInt(readfile.readText().get(1))));
					} else {
						System.out.println("Your Balance is  : $ " + readfile.readText().get(1));
					}
				}

				else if (pin == 2345) {

					if (Double.parseDouble(readfile.readText().get(3)) < 0) {
						System.out.println("Your Balance is  : $ " + 0);
						System.out.println("Owed " + Math.abs(Integer.parseInt(readfile.readText().get(3))));
					} else {
						System.out.println("Your Balance is  : $ " + readfile.readText().get(3));
					}
					
				}
				break;

			case 3:
				System.out.print("Transfer to ");
				String name = input2.nextLine();

				System.out.print("Transfer = $ ");
				int transfer = input.nextInt();
				balance.setTransfer(transfer, pin);

				System.out.println("Transferred " + transfer + " to " + name);
				if (pin == 1234) {

					if (-1 <= 0) {
						System.out.println("true");
					}

					if (Double.parseDouble(readfile.readText().get(1)) <= 0) {
						System.out.println("Your Balance is  : $ " + 0);
						System.out.println(
								"Owed " + Math.abs(Integer.parseInt(readfile.readText().get(1))) + " to " + name);
					} else {
						System.out.println("Your Balance is  : $ " + readfile.readText().get(1));
					}
				}

				else if (pin == 2345) {

					if (Double.parseDouble(readfile.readText().get(3)) <= 0) {
						System.out.println("Your Balance is  : $ " + 0);
						System.out.println(
								"Owed " + Math.abs(Integer.parseInt(readfile.readText().get(3))) + " to " + name);
					} else {
						System.out.println("Your Balance is  : $ " + readfile.readText().get(3));
					}
				}

				break;

			case 4:
				Logout logout = new Logout();
				logout.keluar(login.getName());
//	    System.exit(0);
				break;

			default:
				System.out.println("Anda Harus memilih menu (1,2,3,4)");
				break;
			}
		}
	}


}
