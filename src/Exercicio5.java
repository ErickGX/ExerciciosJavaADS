import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salario_bruto , salario_liquido = 0, valor_hora, adicional_extra;
        float total_geralSalarios = 0F;
        int total_horas_mes, horas_extras;

     do {
         System.out.println("Digite o Salario Bruto");
         salario_bruto = scanner.nextDouble();

         if (salario_bruto <= 0){
             break;

         }

         System.out.println("Digite o total de horas trabalhadas no mes");
         total_horas_mes =  scanner.nextInt();


         //Caso ultrapassado as 160 horas , é realizado o calculo de hroa extra emcima do valor do salario Bruto
         //Para dar seguimento ao processamento de impostos caso necessario
         if (total_horas_mes > 160){

             horas_extras =  total_horas_mes - 160;

             valor_hora = salario_bruto / 160;

             adicional_extra =   horas_extras * valor_hora;

             salario_bruto =  salario_bruto + adicional_extra;

             System.out.println("salario bruto com adicional de " +horas_extras+"  Horas extras :  " +salario_bruto);
             System.out.println("Agora seguiremos para o calculo de descontos de IR e encargos do governo");

             } if (salario_bruto >= 800 && salario_bruto <= 1600){

                 salario_liquido = salario_bruto -  salario_bruto * 0.13;


                 System.out.println("Salario maior que 800 e menor que 1600 recebe 8% de IR e 7% de impostos : ");
                 System.out.println("Salario final Deste Funcionario  : " +salario_liquido);


                     }else if (salario_bruto > 1600) {
                         salario_liquido = salario_bruto - salario_bruto * 0.22;
                         System.out.println("Salario maior que 1600 subtrai 15% de IR e 7% de impostos");
                         System.out.println("Salario final Deste Funcionario  : " +salario_liquido);
                     }

                            else {
                              salario_liquido =  salario_bruto;
                             System.out.println("Salario menor que 800 não recebe nenhum desconto");
                             System.out.println("Salario final sem descontos é de :  " +salario_liquido);
                         }

         //somatoria de todos os salarios processados apos o final do loop While
        total_geralSalarios = (float) (total_geralSalarios + salario_liquido);

     }while(true);

        //Total de salarios a serem pagos , esta variavel é dada apenas apos a finalização do Loop
        System.out.println("Valor total de Salarios Liquidos para fazer o Pagamento : "  +total_geralSalarios);


     }




}
