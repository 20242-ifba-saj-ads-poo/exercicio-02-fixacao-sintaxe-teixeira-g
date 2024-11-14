import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        long factory = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero para ver a sequencia de seus fatoriais: ");
        int limite = scanner.nextInt();

        for (int n = 1; n <= limite; n++){

            factory *= n;
            System.out.println("O fatorial de " + n + " é: " + factory);
        }

    }
}