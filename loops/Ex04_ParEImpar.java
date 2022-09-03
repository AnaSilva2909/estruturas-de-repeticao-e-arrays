import java.util.Scanner;
/*
 Faça um programa que peça N numeros inteiros, calcule e mostre a quantidade de números pares e numeros impares.
 */
public class Ex04_ParEImpar {
   public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

    int qtdnumeros = 0;
    int numeros = 0;
    int count = 0;
    int qtdPares = 0;
    int qtdImpares = 0;

    System.out.println("Quantidade de numeros: ");
    qtdnumeros = scan.nextInt();
    
    do {

    System.out.println("Números: ");
    numeros = scan.nextInt();

    if(numeros % 2 == 0)qtdPares++;    
    else
    qtdImpares++;
    
    count++;
    } while (count < qtdnumeros);

    System.out.println("Números Pares: " + qtdPares);
    System.out.println("Números Impares: " + qtdImpares);
   }
}
