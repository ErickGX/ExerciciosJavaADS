import java.util.Scanner;
public class Exercicio1 {

    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite um numero e iremos dizer se ele é par ou impar");
        num = scanner.nextInt();
         if(num % 2 == 0){
             System.out.println("par");
         }else {
             System.out.println("impar");
         }
    }
}
