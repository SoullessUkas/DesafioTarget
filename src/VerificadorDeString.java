import java.util.Scanner;

public class VerificadorDeString {
    public static int contarLetra(String str, char letra) {
        int contagem = 0;

        // Loop através da string e conta as ocorrências da letra
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == letra) {
                contagem++;
            }
        }

        return contagem;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário a string e a letra a ser contada
        System.out.print("Digite uma string: ");
        String str = scanner.nextLine();

        System.out.print("Digite a letra a ser contada: ");
        char letra = scanner.nextLine().charAt(0);

        // Chama o método para contar as ocorrências
        int contagem = contarLetra(str, letra);

        // Exibe o resultado
        if (contagem > 0) {
            System.out.println("A letra '" + letra + "' aparece " + contagem + " vez(es) na string.");
        } else {
            System.out.println("A letra '" + letra + "' não aparece na string.");
        }

        scanner.close();
    }

}
