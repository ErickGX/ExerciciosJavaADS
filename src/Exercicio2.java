import java.util.Scanner;
import java.lang.Math;
import java.util.Random;
public class Exercicio2 {
    public static void main(String[] args) {
        int num, numRandom = 0, resultado;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero entre 0 e 100para informar-mos o quanto ele esta distante do nosso numero chave");
         num = scanner.nextInt();
         //gera um numero aleatorio usando a lib random
         //Random rand = new Random();
         //numRandom = rand.nextInt(101);
            numRandom = 10;
            if (numRandom > num){
            resultado = numRandom - num;
                System.out.println("random maior que num"+resultado);
            }if (numRandom < num){
                resultado = num - numRandom;
            System.out.println("random menor que num" + resultado);
            }else{
            System.out.println("Os numeros gerados sãio iguais");
        }

         //if (num >= 0 && num <= 100){

         ///}

    }
}
