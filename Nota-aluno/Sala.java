package Tarefa;

import java.util.Scanner;

//Faça um programa para ler 3 notas e o número de faltas, após mostrar a média e uma 
//mensagem se aprovado, em recuperação ou reprovado. 
//Para estar aprovado, deve ter média maior ou igual a 7 e o número de faltas menor do que 
//6. Em recuperação, deve ter media entre 4 e 7, e o número de faltas menor do que 6. 
//Reprovado se a media for menor ou igual 4, ou ter faltas igual ou superior a 6.
//Para esta questão, usar pelo menos 2 funções.


public class Sala {
	
	Scanner leitor = new Scanner(System.in);
	private int falta;
	private double nota;
	private double totalDaNota;
	private double mediaNotas;
	int i;
	
	public void notasAluno() {
		
		for(i=0;i<3;i++) {
			System.out.println("Digite nota");
			nota = leitor.nextDouble();
			totalDaNota+=nota;
		}
	}
	public void faltaAluno() {
		System.out.println("Digite falta:");
		this.falta = leitor.nextInt();
	}
	public void mediaNotas() {
		this.mediaNotas = totalDaNota/3;
		System.out.println("Media:" + this.mediaNotas);
	}
	public void aprovadoRecuperacao() {
		if (mediaNotas>=7 && falta<6) {
			System.out.println("Aprovado!");
	} else if (mediaNotas>=4 && falta<6) {
			System.out.println("Recuperacao!");
	}
	}
	public void reprovado() {
		if (mediaNotas<4 || falta>6) {
			System.out.println("Reprovado!");
		}
	}
	
	public static void main(String[] args) {
		Sala aluno = new Sala();
		aluno.notasAluno();
		aluno.faltaAluno();
		aluno.mediaNotas();
		aluno.aprovadoRecuperacao();
		aluno.reprovado();
	}
}