
import java.util.Scanner;

public class main {

    private static int opcao = -1;
    private static int x;
    private static int y;
    private static int z;

    public static void limparVariaveis() {
        x = 0;
        y = 0;
        z = 0;
    }

    public static void calcularArea() {
    }

    public static void calcularVolume() {
    }

    public static void calcularRaizes() {
    }

    public static void calcularFibonacci() {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite quantos termos deverá ter a sequência.");
        x = in.nextInt();
        y = 1;

        for (int i = 1; i <= x; i++) {
            System.out.print(y + " ");
            y += z;
            z = y - z;
        }
    }

    public static void calcularFatorial() {
    }

    public static void verificarPalindromo() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (opcao != 0) {
            System.out.println("----------------------------------------");
            System.out.println(" 1 - Área de cinco figuras geométricas");
            System.out.println(" 2 - Volume de cinco sólidos geométricos");
            System.out.println(" 3 - Raízes de uma equação válida do segundo grau");
            System.out.println(" 4 - Seqüência de Fibonacci");
            System.out.println(" 5 - Fatorial de um número");
            System.out.println(" 6 - Palavra palíndromo");
            System.out.println(" 0 - Encerrar programa");
            System.out.println("----------------------------------------");

            System.out.println("Opção desejada: ");
            opcao = in.nextInt();

            if (opcao != 0) {

                switch (opcao) {

                    case 1:
                        calcularArea();
                        limparVariaveis();
                        System.out.println("");
                        break;

                    case 2:
                        calcularVolume();
                        limparVariaveis();
                        System.out.println("");
                        break;

                    case 3:
                        calcularRaizes();
                        limparVariaveis();
                        System.out.println("");
                        break;

                    case 4:
                        calcularFibonacci();
                        limparVariaveis();
                        System.out.println("");
                        break;

                    case 5:
                        calcularFatorial();
                        limparVariaveis();
                        System.out.println("");
                        break;

                    case 6:
                        verificarPalindromo();
                        limparVariaveis();
                        System.out.println("");
                        break;

                    default:
                        System.out.println("Opção inválida.");
                }
            }
        }
    }
}

