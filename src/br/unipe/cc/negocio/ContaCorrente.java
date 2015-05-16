package br.unipe.cc.negocio;

public class ContaCorrente extends Conta {

	@Override
	public void creditar(double valor) {
		super.creditar(valor);
		this.saldo -= 0.10; //A conta corrente  retira 10 centavos a cada deposito, independente da taxa.
	}

	@Override
	public void atualizaTaxa(double taxa) {
		this.saldo -= taxa * 2; // dobro da taxa

	}

	@Override
	public String toString() {
		return "Conta Corrente\nNúmero: " + this.numero
				+ "\nSaldo Disponível: " + this.saldo;
	}

	
}
