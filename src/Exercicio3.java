import java.util.Scanner;
import java.lang.Math;
public class Exercicio3 {
    public static void main(String[] args) {
        float nota = 0f, praCima, praBaixo, cima, baixo, resto;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a nota da média do Aluno ");
         nota = scanner.nextFloat();

         if (nota  > 0 && nota <= 10){
        System.out.println("A nota digitada foi : " +nota);

        //atribuindo o valor resultante da funcao a outra variavel
        cima  = (float) Math.ceil(nota);
        baixo = (float) Math.floor(nota);

        resto =   nota -  baixo;

        if (resto <= 0.5){
            System.out.println("Sua nota foi arredondada para baixo devido a ela estar com resto de 0.5 ou menos");
            System.out.println("Sua nota final foi : " +baixo);
        }else {
            System.out.println("Sua nota foi arredondada para cima devido a e ela estar com resto maior que 0.5");
            System.out.println("Sua nota final foi : " +cima);
        }}else {
             System.out.println("Digite uma nota valida entre 0 e 10");
         }






    }
}
