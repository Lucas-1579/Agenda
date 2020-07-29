package application;

import java.util.Scanner;

import entites.Agenda;
import entites.Contato;

public class program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o nome de sua agenda: ");
		String name = sc.nextLine();
		Agenda agenda = new Agenda();

		System.out.print("Digite a quantidade de contatos para inserir na " + name + ": ");
		Integer n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Sobrenome: ");
			sc.nextLine();
			String sobrenome = sc.nextLine();
			System.out.print("ddd: ");
			String ddd = sc.next();
			System.out.print("Telefone: ");
			String telefone = sc.next();
			System.out.print("Email: ");
			String email = sc.next();
			Contato contato = new Contato(nome, sobrenome, ddd, telefone, email);
			agenda.addContato(contato);

		}
		
		System.out.println(agenda);

		sc.close();

	}

}
