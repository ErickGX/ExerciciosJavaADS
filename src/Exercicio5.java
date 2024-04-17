import java.sql.SQLOutput;
import java.util.Scanner;
import java.lang.Math;
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salario_bruto , total_horas_mes;

     do {
         System.out.println("Digite o Salario Bruto");
         salario_bruto = scanner.nextDouble();

         if (salario_bruto <= 0){
             break;
         }

         System.out.println("Digite o total de horas trabalhadas no mes");
         total_horas_mes =  scanner.nextDouble();

         System.out.println(salario_bruto);
         System.out.println(total_horas_mes);

     }while(true);

     }
}
