package br.unipe.cc.ui;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ComparacaoSet {

	public static void main(String[] args) {
		Set<Integer> tree = new TreeSet<>();
		Set<Integer> linked = new LinkedHashSet<>();
		System.out.println("Iniciando testes de performance da treeSet...");
		long inic = System.currentTimeMillis();
		int it = 30000;
		for (int i = 0; i < it; i++) {
			tree.add(i);
		}
		for (int i = 0; i < it; i++) {
			tree.contains(i);
		}
		long fim = System.currentTimeMillis();
		long tempo = fim - inic;
		System.out.println("Tempo gasto: " + tempo);
		inic = fim = tempo = 0;
		System.out.println("Iniciando testes de performance da LinkedHashSet...");
		inic = System.currentTimeMillis();
		for (int i = 0; i < it; i++) {
			linked.add(i);
		}
		for (int i = 0; i < it; i++) {
			linked.contains(i);
		}
		fim = System.currentTimeMillis();
		tempo = fim-inic;
		System.out.println("Tempo gasto: " + tempo);
		
//      Conclus�o da Compara��o
		
//		Como podemos observar pela execu��o do codigo, a implementa��o TreeSet, 
//		na maioria das vezes � mais lenta que a implementa��o LinkedHashSet.
//		Em algumas execu��es LinkedHashSet � tr�s vezes mais r�pida que a TreeSet.
//		A estrutura LinkedHashSet al�m de possuir todas as garantias da treeSet, seu
//		desempenho � bem superior e chega pr�ximo ao desepenho da estrutura HashSet.
//		Logo isso pode ser um fator determinante para que o envio de mensagems esteja t�o lenta no sistema do facebook.
//		Portanto, � recomendado a substitu���o  de todas as implementa��es TreeSet por LinkedHashSet.
		
		

	}

}
