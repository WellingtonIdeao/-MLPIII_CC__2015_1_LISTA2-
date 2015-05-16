package br.unipe.cc.negocio;

public class Aluno extends Pessoa implements Comparable {
	private float media;
	private int falta;

	public int getFalta() {
		return falta;
	}

	public void setFalta(int falta) {
		this.falta = falta;
	}

	public float getMedia() {
		return media;
	}

	public void setMedia(float nota) {
		this.media = nota;
	}

	@Override
	public String toString() {
		return "Nome: " + this.nome + "\nMatricula: " + this.matricula
				+ "\nMedia: " + this.media + "\nFaltas: " + this.falta+"\n";
	}

	@Override
	public boolean equals(Object obj) {
		Aluno a = (Aluno) obj;
		return this.matricula.contains(a.getMatricula());
	}

	@Override
	public int compareTo(Object arg0) {
		Aluno a = (Aluno) arg0;
		return this.nome.compareTo(a.nome);
	}

}
