//Imprima os primeiros números da série de Fibonacci até passar de 100. A série de Fibonacci é a seguinte: 0, 1, 1, 2, 3, 5, 8, 13, 21, etc... Para calculá-la, o primeiro elemento vale 0, o segundo vale 1, daí por diante, o n-ésimo elemento vale o (n-1)-ésimo elemento somado ao (n-2)-ésimo elemento (ex: 8 = 5 + 3).
public class Questao6 {
    public static void main(String[] args) {

        int n1 = 0;
        int n2 = 1;

        int i = 1;
        while (n1 <= 200){

            n2 = n1 + n2;
            n1 = n2 - n1;

            System.out.println("O resultado é: " +n1);
            i++;
        }

    }
}
