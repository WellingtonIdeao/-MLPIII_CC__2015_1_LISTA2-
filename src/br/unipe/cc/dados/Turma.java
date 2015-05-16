package br.unipe.cc.dados;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import br.unipe.cc.negocio.Aluno;


public class Turma {
	private List<Aluno> alunos = null;
	private int idAluno;
	
	public Turma(){
		this.alunos = new ArrayList<>();
		this.idAluno = 1;
	}
	public List<Aluno> getAlunos() {
		return alunos;
	}
	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}
	
	public void addAlunos(Aluno aluno){
			aluno.setMatricula(String.valueOf(idAluno));
			this.alunos.add(aluno);
			this.idAluno++;
			Collections.sort(this.alunos);
		
	}
    public void remover(Aluno aluno){
    		this.alunos.remove(aluno);
    		System.out.println("Aluno Removido");
    }
    public Aluno verificar(Aluno aluno){
    	for(Aluno a: alunos){
    		if(a.equals(aluno))
    			return a;
        }
		return null;
    }
    public void mostrarTurma(){
    	if(this.alunos.size()> 0){
    		System.out.println("Alunos da Turma");
    		for(Aluno a: this.alunos){
    			System.out.println(a);
    		}
    	}else
    		System.out.println("Sem alunos cadastrados");
    }
    public void alunosAprovados(){
    	if(this.alunos.size()> 0){
    		for(Aluno a: alunos){
    			if(a.getMedia()>=7.0 && a.getFalta()<=15)
    				System.out.println(a);
    		}	
    	}else
    		System.out.println("Não há alunos aprovados");
    		
    	
    }
    public void reprovados(){
    	if(this.alunos.size()> 0){
    		for(Aluno a: alunos){
    			if(a.getFalta()>15)
    				System.out.println(a);
    		}
    	}else
    		System.out.println("Não há alunos reprovados por falta");
    		
    }
    
   

}
