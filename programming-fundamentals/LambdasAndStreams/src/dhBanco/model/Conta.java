package dhBanco.model;

public abstract class Conta {

	private int agencia;
	private int numero;
	private double saldo;
	private Cliente cliente;

	public Conta(int agencia, int numero, double saldo, Cliente cliente) {
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
		this.cliente = cliente;
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

}
