package dhBanco.model;

import java.util.stream.Collectors;

/*
 * 
 * Questão: Insira 5 clientes, mostre o saldo total somado de todos os clientes e depois liste os nomes
 *  
 * */

public class TestaBanco {

	public static void main(String[] args) {
		Banco banco = new Banco("Bradesco", 237);
		banco.adicionaConta(
				new ContaCorrente(1, 1000, 2000, new Cliente("123456789", "Ian1", "ian.digitalhouse.com")));
		banco.adicionaConta(
				new ContaCorrente(2, 1001, 4000, new Cliente("123456789", "Ian2", "ian.digitalhouse.com")));
		banco.adicionaConta(
				new ContaCorrente(3, 1002, 6000, new Cliente("123456789", "Ian3", "ian.digitalhouse.com")));
		banco.adicionaConta(
				new ContaCorrente(4, 1003, 8000, new Cliente("123456789", "Ian4", "ian.digitalhouse.com")));
		banco.adicionaConta(
				new ContaCorrente(5, 1004, 10000, new Cliente("123456789", "Ian5", "ian.digitalhouse.com")));

		System.out.println(banco.getContas().stream().mapToDouble(Conta::getSaldo).sum());
		
		System.out.println(banco.getContas().stream().map(Conta::getCliente).map(Cliente::getNome).collect(Collectors.toList()));

	}
}
