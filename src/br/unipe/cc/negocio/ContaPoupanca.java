package br.unipe.cc.negocio;

public class ContaPoupanca extends Conta {

	@Override
	public void atualizaTaxa(double taxa) {
		this.saldo -= taxa * 3; // triplo da taxa

	}

	@Override
	public String toString() {
		return "Conta Poupan�a\nN�mero: " + this.numero
				+ "\nSaldo Dispon�vel: " + this.saldo;
	}

}
