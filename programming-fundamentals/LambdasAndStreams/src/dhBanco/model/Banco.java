package dhBanco.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Banco {

	private String nome;
	private int numero;
	private List<Conta> contas;

	public Banco(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
		this.contas = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public int getNumero() {
		return numero;
	}

	public List<Conta> getContas() {
		return Collections.unmodifiableList(contas);
	}

	public void adicionaConta(Conta conta) {
		this.contas.add(conta);
	}

}
