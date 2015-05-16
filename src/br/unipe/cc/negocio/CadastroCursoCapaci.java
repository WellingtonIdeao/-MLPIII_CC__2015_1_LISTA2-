package br.unipe.cc.negocio;

import br.unipe.cc.dados.Turma;

public class CadastroCursoCapaci {
	private Turma turma;
	private Professor professor;
	private String nome;
	private int id;
	
	public CadastroCursoCapaci(){
		this.turma = new Turma();
		this.professor = new Professor();
		
	}
	
	public void addAlunoTurma(Aluno aluno){
		this.turma.addAlunos(aluno);
	}
	public void mostrarTurma(){
		this.turma.mostrarTurma();
	}
	public void remNaturma(Aluno aluno){
		this.turma.remover(aluno);
	}
	public Aluno verificar(Aluno aluno){
		return this.turma.verificar(aluno);
	}
	public void aprovadosTurma(){
		this.turma.alunosAprovados();
	}
	public void reprovados(){
		this.turma.reprovados();
	}
	
	public Turma getTurma() {
		return turma;
	}
	public void setTurma(Turma turma) {
		this.turma = turma;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	

}
