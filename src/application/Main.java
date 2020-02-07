package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.entities.Funcionario;

public class Main {

	public static void main(String[] args) {
		List<Funcionario> list = new ArrayList<>();
		String path = "in.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			//ler a primeira linha e atribui para a variavel nome
			String funcionarioCSV = br.readLine();
			
			while(funcionarioCSV != null) {
				String[] colunas = funcionarioCSV.split(",");
				
				list.add(new Funcionario(colunas[0], Double.parseDouble(colunas[1])));
				funcionarioCSV = br.readLine();
			}
			
			//ordenar a lista
			Collections.sort(list);
			
			for(Funcionario f: list) {
				System.out.println(f.getNome() + ", R$"+ f.getSalario());
			}
			
		}
		catch(IOException e) {
			System.out.println("erro: " + e.getMessage());
		}

	}

}
