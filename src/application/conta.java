package application;

import java.util.Locale;
import java.util.Scanner;

import entities.DadosBancarios;

public class conta {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		DadosBancarios dadosBancarios;

		System.out.print("Enter account number: ");
		int account = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n):");
		char resp = sc.next().charAt(0);

		if (resp != 'y') {
			dadosBancarios = new DadosBancarios(account, holder);
		} else {
			System.out.println();
			System.out.println("Enter initial deposit value: ");
			double initialValue = sc.nextDouble();
			dadosBancarios = new DadosBancarios(account, holder, initialValue);
		}

		System.out.println("Account data: ");
		System.out.println(dadosBancarios);

		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		dadosBancarios.deposit(depositValue);
		System.out.println("Updated account data: ");
		System.out.println(dadosBancarios);

		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		dadosBancarios.withdraw(withdrawValue);
		System.out.println("Updated account data: ");
		System.out.println(dadosBancarios);

		sc.close();

	}

}
