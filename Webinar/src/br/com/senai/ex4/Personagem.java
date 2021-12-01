package br.com.senai.ex4;

public class Personagem {

	/*Atributo*/
	
	private int id_personagem;
	private String nome;
	private String genero;
	private int vida;
	private int forca;
	private int defesa;
	private int velocidade;
	
	/*Getters e Setters*/
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getGenero() {
		return this.genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getVida() {
		return this.vida;
	}
	public void setHp(int vida) {
		this.vida = vida;
	}
	public int getForca() {
		return this.forca;
	}
	public void setForca(int forca) {
		this.forca = forca;
	}
	public int getDefesa() {
		return this.defesa;
	}
	public void setDefesa(int defesa) {
		this.defesa = defesa;
	}
	public int getVelocidade() {
		return this.velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	
	/*Métodos*/
	
	private void ataca(Personagem quemSeraAtacado) {
		if(this.forca > quemSeraAtacado.defesa) {
			quemSeraAtacado.vida -= this.forca; 
		}else {
			quemSeraAtacado.vida -= this.forca/2;
		}
	}
	
	public static void atacarPrimeiro(Personagem a, Personagem b) {
		if(a.velocidade > b.velocidade) {
			a.ataca(b);
			b.ataca(a);
			a.morre();
			b.morre();
		}else {
			b.ataca(a);
			a.ataca(b);
			b.morre();
			a.morre();
		}
	}
	
	private void morre() {
		if(this.vida <= 0) {
			System.out.println("Personagem "+ this.nome +" morreu"); 
		}
	}
	
}
