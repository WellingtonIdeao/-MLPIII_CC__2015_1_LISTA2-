package br.unipe.cc.ui;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class Propriedades {

	public static void main(String[] args) throws IOException  {
		Scanner in = new Scanner(System.in);
		String str;
		int opc = 1;
		Properties prop = new Properties(); // Basta modificar o caminho para pasta do arquivo properties e funcionará.
		FileInputStream file = new FileInputStream("D:/Dados/workstation/MLPIII_CC__2015_1_LISTA2/properties/database.properties");
		prop.load(file);
		
		while(opc != 0){
			System.out.println("Digite a chave procurada");
			str = prop.getProperty(in.next());
			if(str != null)
				System.out.println(str);
			else
				System.out.println("Chave inexistente");
			System.out.println("Deseja Continuar:\n 1-Sim    0-não");
			opc = in.nextInt();
		}
		System.out.println("FIM DO PROGRAMA");
	}

}
