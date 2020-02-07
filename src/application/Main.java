package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		String path = "in.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			//ler a primeira linha e atribui para a variavel nome
			String nome = br.readLine();
			
			while(nome != null) {
				list.add(nome);
				nome = br.readLine();
			}
			
			
			Collections.sort(list);
			for(String nomes: list) {
				System.out.println(nomes);
			}
			
		}
		catch(IOException e) {
			System.out.println("erro: " + e.getMessage());
		}

	}

}
