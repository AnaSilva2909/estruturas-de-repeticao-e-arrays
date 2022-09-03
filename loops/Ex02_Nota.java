import java.util.Scanner;

/*
Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso valor seja inválido. Contiue pedindo até que usuario informe valor válido.
 */
public class Ex02_Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int nota;

        System.out.println("Nota: ");
        nota = scan.nextInt();

        while(nota < 0 || nota > 10)
        {
            System.out.println("Nota inválida! Digite novamente: ");
            nota = scan.nextInt();

        }
    }
    
}
