import java.util.Scanner;
/*
Faça um programa que leia conjuntos de dois valores, o primeiro representando o nome do aluno e o segundo representando  a sua idade.(Pare o progrma inserindo o valor 0 no campo nome)
 */

public class Ex01_NomeEIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;
        
        
        while(true){ 
            System.out.println("Nome: ");
        nome = scan.next();
        if(nome.equals("0")) break; //Quando nome for igual a zero, saia do loop 
        
        System.out.println("Idade: ");
        idade = scan.nextInt();
        }

        System.out.println("Continua aqui...");

    }
}
