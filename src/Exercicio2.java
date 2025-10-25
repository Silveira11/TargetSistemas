import java.util.Scanner;

public class Exercicio2 {
     static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int numero = entrada.nextInt();

        int anterior = 0;
        int atual = 1;

        boolean pertence = false;

        while (atual <= numero) {
            if (atual == numero || numero == 0) {
                pertence = true;
                break;
            }
            int proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }

        if (pertence) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci!");
        } else {
            System.out.println("O número " + numero + " NÃO pertence à sequência de Fibonacci.");
        }
        entrada.close();
    }
}


