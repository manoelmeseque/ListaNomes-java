package model.entities;

public class Funcionario implements Comparable<Funcionario> {
	private String nome;
	private double salario;
	
	
	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public int compareTo(Funcionario other) {
		//caso queria comparar com salario
		//return salario.compareTo(other.getSalario());
		return nome.compareTo(other.getNome());
	}
	
	
}
