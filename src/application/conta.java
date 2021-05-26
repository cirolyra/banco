package application;

import java.util.Locale;
import java.util.Scanner;

import entities.DadosBancarios;

public class conta {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		DadosBancarios account;

		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n):");
		char answer = sc.next().charAt(0);

		if (answer != 'y') {
			account = new DadosBancarios(number, holder);
		} else {
			System.out.println();
			System.out.println("Enter initial deposit value: ");
			double initialValue = sc.nextDouble();
			account = new DadosBancarios(number, holder, initialValue);
		}

		System.out.println("Account data: ");
		System.out.println(account);

		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Updated account data: ");
		System.out.println(account);

		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Updated account data: ");
		System.out.println(account);

		sc.close();

	}

}
