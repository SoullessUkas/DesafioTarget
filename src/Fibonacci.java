import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {
    // segunda vez que faço esse dasafio será que dessa vez vai?

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário o número limite
        System.out.print("Digite um número para buscar na sequência de Fibonacci: ");
        int limite = scanner.nextInt();

        // Cria a lista para armazenar a sequência de Fibonacci
        List<Integer> fibonacciList = new ArrayList<>();
        int a = 0, b = 1;

        // Adiciona os primeiros números da sequência
        fibonacciList.add(a);
        fibonacciList.add(b);

        // Gera a sequência até atingir o limite
        while (true) {
            int proximo = a + b;
            if (proximo > limite) {

                break;
            }
            fibonacciList.add(proximo);
            a = b;
            b = proximo;
        }

        // Se o número foi encontrado, mostra a lista
        if (fibonacciList.contains(limite)) {
            System.out.println("O número " + limite + " foi encontrado na sequência de Fibonacci.");
            System.out.println("Sequência de Fibonacci gerada até o limite: " + fibonacciList);
        } else {
            System.out.println("Numero não encontrado na sequência");
            // Exibe a sequência gerada até o momento
            System.out.println("Sequência de Fibonacci gerada até o limite: " + fibonacciList);
        }

        scanner.close();
    }

}
