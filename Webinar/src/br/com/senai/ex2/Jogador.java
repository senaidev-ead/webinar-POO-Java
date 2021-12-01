package br.com.senai.ex2;

public class Jogador {

	
	/*atributos*/
	private int id_jogador;
	private String nome;
	private int idade;
	private String posicao;
	private String nacionalidade;
	private double altura;
	private double peso;
	
	/*Setter e Getters*/
	
	public void setIdJogador(int id) {
		this.id_jogador = id;
	}
	
	public int getIdJogador() {
		return this.id_jogador;
	}
	
	
	public void setNome(String n) {
		this.nome = n;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setIdade(int i) {
		this.idade = i;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public void setPosicao(String p) {
		this.posicao = p;
	}
	
	public String getPosicao() {
		return this.posicao;
	}
	
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	
	public String getNacionalidade() {
		return this.nacionalidade;
	}
	
	public void setAltura(double a) {
		this.altura = a;
	}
	
	public double getAltura() {
		return this.altura;
	}
	
	public void setPeso(double p) {
		this.peso = p;
	}
	
	public double getPeso() {
		return this.peso;
	}
	
	/*Métodos*/
	
	public void quandoAposenta() {
		
		int tempoRestante = 0;
		
		if(this.posicao == "d") {
			tempoRestante = 40 - this.idade;
			
		}else if(this.posicao == "m"){
			
			tempoRestante = 38 - this.idade;
		}else {
			tempoRestante = 35 - this.idade;
		}
		
		System.out.println("Posição " + this.posicao);
		System.out.println("Falta "+ tempoRestante + " anos para se aposentar!");
	}
	
}
