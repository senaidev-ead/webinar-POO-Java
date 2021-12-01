package br.com.senai.ex2;

public class PrincipalExercicio2 {

	public static void main(String[] args) {
		
		Jogador jogador = new Jogador();
		
		jogador.setNome("Neymar");
		jogador.setPosicao("a");
		jogador.setIdade(29);
		
		System.out.println(jogador.getNome());
		jogador.quandoAposenta();

	}

}
