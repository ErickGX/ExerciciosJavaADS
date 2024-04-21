import java.util.Scanner;
import java.util.Random;
public class Exercicio2 {
    public static void main(String[] args) {

        int num, numRandom = 0, resultado;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero entre 0 e 100 para informar-mos o quanto ele esta distante do nosso numero chave");
         num = scanner.nextInt();

         //gera um numero aleatorio usando a lib random
         Random rand = new Random();
         numRandom = rand.nextInt(101);

        System.out.println("O numero gerado aleatoriamente pelo sistema é : " +numRandom);

            if (num > numRandom){
                resultado = num - numRandom;
                System.out.println("O Numero informado pelo usuario é: " +num+  " e está  "+resultado+ " unidades distante do numero chave do sistema:  "+numRandom);
            } else if (num < numRandom) {
                resultado = numRandom - num;
                System.out.println("O Numero informado pelo usuario é : " +num+  " e está  "+resultado+ " unidades distante do numero chave do sistema:  "+numRandom);
            }else {
                System.out.println("Devido a sua grande sorte o numero Gerado randomicamente pelo sistema é igual ao numero que você Digitou :D");
            }

    }
}
