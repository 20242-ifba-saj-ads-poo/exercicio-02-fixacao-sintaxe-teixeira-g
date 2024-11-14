//Imprima os fatoriais de 1 a 10.
//O fatorial de um número $n$ é $n * n-1 * n-2$ ... até $n = 1$. Lembre-se de utilizar os parênteses.
public class Questao4 {
    public static void main(String[] args) {
        int fatorial = 1;

        for (int n = 1; n <= 10; n++){

            fatorial *= n;
            System.out.println("O fatorial de " + n + " é: " + fatorial);
        }

    }
}
