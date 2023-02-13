package tarefamod11;

import java.util.Scanner;

public class TarefaMod11 {
    public static void main(String[] args) {
        Scanner leitorNome = new Scanner(System.in);
        System.out.println("Digite os nomes e separe com virgula: ");
        String input = leitorNome.nextLine();

        String[] nomes = input.split(",");
        System.out.println("Nomes: " + String.join(", ", nomes));

    }

}


