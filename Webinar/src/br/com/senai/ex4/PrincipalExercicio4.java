package br.com.senai.ex4;

public class PrincipalExercicio4 {

	public static void main(String[] args) {

		Personagem p1 = new Personagem();
		Personagem p2 = new Personagem();

		p1.setNome("Ryu");
		p1.setForca(100);
		p1.setHp(2000);
		p1.setVelocidade(100);
		
		p2.setNome("Rugal");
		p2.setForca(1000);
		p2.setHp(5000);
		p2.setVelocidade(50);
		
		Personagem.atacarPrimeiro(p1, p2);
		Personagem.atacarPrimeiro(p1, p2);
		
		System.out.println("Nome: " + p1.getNome()
					+"\n Vida: " + p1.getVida()+"\n");
		
		System.out.println("Nome: " + p2.getNome()
		+"\n Vida: " + p2.getVida());
	}

}
