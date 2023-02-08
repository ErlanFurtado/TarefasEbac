package Tarefa_Controle_Fluxo;

import java.util.Scanner;

public class Controle_Fluxo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite a primira nota: ");
        int result1 = s.nextInt();
        System.out.println("Digite a segunda nota: ");
        int result2 = s.nextInt();
        System.out.println("Digite a terceira nota: ");
        int result3 = s.nextInt();
        System.out.println("Digite a quarta nota: ");
        int result4 = s.nextInt();
        int result5 = (result1+result2+result3+result4)/4;
        System.out.println("A média do aluno foi: " + result5);

        if(result5 >= 7){
            System.out.println("Aluno APROVADO! ");
        }else if(result5 >=5 && result5 <=6) {
            System.out.println("Aluno de RECUPERAÇÃO! ");
        }else if(result5 < 5){
            System.out.println("Aluno REPROVADO! ");
        }




    }
}
