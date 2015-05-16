package br.unipe.cc.fachada;
import br.unipe.cc.negocio.Aluno;
import br.unipe.cc.negocio.CadastroCursoCapaci;

public class CursoCapaci {
	private CadastroCursoCapaci curso;
	

	public  CursoCapaci(){
		this.curso = new CadastroCursoCapaci();
	}
	public CadastroCursoCapaci getCurso() {
		return curso;
	}

	public void setCurso(CadastroCursoCapaci curso) {
		this.curso = curso;
	}
	
	public void addAlunos(Aluno aluno){
		this.curso.addAlunoTurma(aluno);
	}
	public void remoAlunos(Aluno aluno){
		this.curso.remNaturma(aluno);
	}
	public void mostrarAlunos(){
		this.curso.mostrarTurma();
	}
	public void aprovadosCurso(){
		this.curso.aprovadosTurma();
	}
	public void reproFalta(){
		this.curso.reprovados();
	} 
	public  void verificarAlunos(Aluno aluno){
		Aluno al = this.curso.verificar(aluno);
		if(al != null){
			System.out.println(al);
		}else
			System.out.println("Aluno não matriculado");

	}
}
