package br.unipe.cc.negocio;

public abstract class Conta {
	protected double saldo;
	protected String numero;

	public abstract void atualizaTaxa(double taxa); // método para sobreescrita
	
	public void creditar(double valor) {
		this.saldo += valor;

	}

	public void debitar(double valor) {
		if (valor <= this.saldo) // impossibilita retirar o que não possui de saldo.
			this.saldo -= valor;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	@Override
	public boolean equals(Object obj) {
		Conta c = (Conta) obj;
		return this.numero.contains(c.getNumero());
	}

}
