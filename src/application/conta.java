package application;

import java.util.Locale;
import java.util.Scanner;

import entities.DadosBancarios;

public class conta {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DadosBancarios dadosBancarios = new DadosBancarios();

		System.out.print("Enter account number: ");
		int account = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String name = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n):");
		char resp = sc.next().charAt(0);

		if (resp != 'y') {
			System.out.println();
			dadosBancarios = new DadosBancarios(account, name);
		} else {
			System.out.println();
			System.out.println("Enter initial deposit value: ");
			double value = sc.nextDouble();
			dadosBancarios = new DadosBancarios(account, name, value);
		}
		
		System.out.println("Account data: ");
		System.out.println(dadosBancarios);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double value = sc.nextDouble();
		dadosBancarios.deposit(value);
		System.out.println("Updated account data: ");
		System.out.println(dadosBancarios);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		value = sc.nextDouble();
		dadosBancarios.withdraw(value);
		System.out.println("Updated account data: ");
		System.out.println(dadosBancarios);
		

		sc.close();

	}

}
