package br.unipe.cc.ui;
import java.util.Scanner;
import br.unipe.cc.fachada.CursoCapaci;
import br.unipe.cc.negocio.Aluno;
// Aplicação feita  em arquitetura  de camadas
public class PrincipalCursoCapacitacao {
	
	public static void main(String[] args) {
		CursoCapaci curso = new CursoCapaci();
		Scanner in = new Scanner(System.in);
		int opc = 1;
		Aluno al;
		System.out.println("Aplicação Curso de Capacitação\n");
		System.out.println("1\tCadastrar Alunos");
		System.out.println("2\tRemover Alunos");
		System.out.println("3\tVerificar alunos p/ matricula");
		System.out.println("4\tListar alunos aprovados");
		System.out.println("5\tListar alunos reprovados por falta");
		System.out.println("6\tListar por ordem alfabetica");
		System.out.println("0\tPara sair");
		while(opc!=0){
			opc = in.nextInt();
			switch(opc){
				case 0: break;
				case 1:  System.out.println("Digite o nome , qtd faltas e a média do aluno"); al = new Aluno(); al.setNome(in.next()); al.setFalta(in.nextInt());
				         al.setMedia(in.nextFloat()); 
						 curso.addAlunos(al);break;
				case 2:  System.out.println("Digite o numero da matricula");al = new Aluno();al.setMatricula(in.next());
					     curso.remoAlunos(al);break;
				case 3:  System.out.println("Digite a matricula");al = new Aluno();al.setMatricula(in.next());curso.verificarAlunos(al);break;
				case 4:  curso.aprovadosCurso();break;
				case 5:  curso.reproFalta();break;
				case 6:  curso.mostrarAlunos();
			}
		
			
	 }
	System.out.println("FIM DO PROGRAMA");	
  }

}
