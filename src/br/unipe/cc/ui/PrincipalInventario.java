package br.unipe.cc.ui;
import java.util.Collections;
import java.util.Scanner;
import br.unipe.cc.dados.Inventario;
import br.unipe.cc.negocio.Item;

public class PrincipalInventario {

	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		Inventario myInventario = new Inventario();
		int op = 1;
		Item i = null;
		System.out.println("Digite uma das opcoes ");
		System.out.println("1\tAdd items a coleção");
		System.out.println("2\tOrdenar a coleção");
		System.out.println("3\tMostrar Coleção");
		System.out.println("4\tColeção vazia?");
		System.out.println("5\tItem existe na coleção?");
		System.out.println("0\tSair");
		while(op!=0){
			op = in.nextInt();
			switch(op){
				case 0: break;
				case 1: System.out.println("digite um cod p/ Item"); i = new Item(); i.setCod(in.nextInt());
						myInventario.addItems(i);break;
				case 2: System.out.println("Coleção Ordenada.");Collections.sort(myInventario.getMyItems());break;
				case 3: myInventario.mostrarList();break;
				case 4: if(myInventario.getMyItems().isEmpty()){
							System.out.println("Coleção Vazia");}
						else{
							System.out.println("Coleção possui elementos");}break;
				case 5: System.out.println("digite o cod do item procurado");i = new Item(); i.setCod(in.nextInt()); 
				        if(myInventario.getMyItems().contains(i)){
				        	System.out.println("Item pertence a coleção");
				        }else{
				        	System.out.println("Item não pertence a coleção");}break;
			
			}
		}
		System.out.println("FIM DO PROGRAMA!");
	}

}
