package br.com.senai.ex1;

public class Alunos {

	/*Atributos*/
	private int matricula = 123;
	private String nome="Jos�";
	private double nota1 = 10;
	private double nota2 = 7;
	
	/*Setters*/
	
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	
	/*M�todo*/
	
	public void media() {
		double media;

		media = (this.nota1 + this.nota2)/2;
		
		System.out.println("M�dia �: "+ media);
		
	}
	
}
