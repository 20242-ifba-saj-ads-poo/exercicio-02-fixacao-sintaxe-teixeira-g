/*
Imprima a seguinte tabela, usando for encadeados:
1
2 4
3 6 9
4 8 12 16
n n*2 n*3 .... n*n
*/
public class Questao8 {
    public static void main(String[] args) {

        int n = 5; // Valor que define o numero de linhas
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }

    }
}
