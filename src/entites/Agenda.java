package entites;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

	private String name;

	private List<Contato> contatos = new ArrayList<>();

	public Agenda() {
	}

	public Agenda(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Contato> getContato() {
		return contatos;
	}

	public void addContato(Contato contato) {
		contatos.add(contato);
	}

	public void removeContato(Contato contato) {
		contatos.add(contato);
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Contato c : contatos) {
			
			sb.append("Contatos: \n" + "Nome: " + c.getNome() + " " + c.getSobrenome() + "\n");
			sb.append("Telefone: " + c.getDdd() + "-" + c.getTelefone() + "\n" + "Email: " + c.getEmail() + "\n");
		}
		return sb.toString();
	}

}
