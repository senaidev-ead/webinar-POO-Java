package br.com.senai.ex3;

public class ContaBancaria {
	private int numeroConta;
	private String titular;
	private double saldo;
	
	/*Construtor*/
	public ContaBancaria(int n, String t, double s) {
		this.numeroConta = n;
		this.titular = t;
		this.saldo = s;
	}

	public String getTitular() {
		return this.titular;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void saca(double valor) {
		
		if(this.saldo >= valor) {
			this.saldo -= valor; 
		}else {
			System.out.println("Valor do saque é maior que seu saldo!");
		}
		
	}
	
	public void deposita(double valor) {
		
		this.saldo += valor;
		
	}

	public void transfere(ContaBancaria contaDestino, double valor) {
		this.saca(valor);
		contaDestino.deposita(valor);
	}
}


