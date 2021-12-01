package br.com.senai.ex3;

public class PrincipalExercicio3 {

	public static void main(String[] args) {

		ContaBancaria contaA = new ContaBancaria(123, "Felipe", 100.50);
		ContaBancaria contaB = new ContaBancaria(456, "Janaina", 1000000);
		
		contaB.saca(500000);
		
		System.out.println("Titular: "+ contaB.getTitular()
				+"\n R$ "+contaB.getSaldo());
		
		contaA.deposita(1000);
		
		System.out.println("Titular: "+ contaA.getTitular()
		+"\n R$ "+contaA.getSaldo());
		
		
		contaB.transfere(contaA, 500000);
		
		System.out.println("Titular: "+ contaB.getTitular()
		+"\n R$ "+contaB.getSaldo());
		
		System.out.println("Titular: "+ contaA.getTitular()
		+"\n R$ "+contaA.getSaldo());
	}

}
