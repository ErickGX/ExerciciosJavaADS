import java.util.Scanner;
import java.lang.Math;

public class Exercicio4 {
    public static void main(String[] args) {


        System.out.println("Digite 3 numeros para e exibiremos o maior e menor numero , e tambem o numero do meio entre os digitados");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo número:");
        int num2 = scanner.nextInt();

        System.out.println("Digite o terceiro número:");
        int num3 = scanner.nextInt();

        int maior = Math.max(num1, Math.max(num2, num3));
        int menor = Math.min(num1, Math.min(num2, num3));

        //O número do meio é calculado somando todos os três números e subtraindo o maior e o menor número;
        int meio = (num1 + num2 + num3) - maior - menor;

        System.out.println("O menor número é: " + menor);
        System.out.println("O número do meio é: " + meio);
        System.out.println("O maior número é: " + maior);




    }
}
