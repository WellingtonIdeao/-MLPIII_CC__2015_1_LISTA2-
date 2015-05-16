package br.unipe.cc.negocio;

public class ContaPoupanca extends Conta {

	@Override
	public void atualizaTaxa(double taxa) {
		this.saldo -= taxa * 3; // triplo da taxa

	}

	@Override
	public String toString() {
		return "Conta Poupança\nNúmero: " + this.numero
				+ "\nSaldo Disponível: " + this.saldo;
	}

}
