import java.math.BigInteger;
import java.util.Scanner;

public class main {

    private static int opcao = -1;
    private static double x;
    private static double y;
    private static double z;

    public static void limparVariaveis() {
        x = 0;
        y = 0;
        z = 0;
    }

    public static void calcularArea() {
        Scanner in = new Scanner(System.in);

        if (opcao != 0) {
            System.out.println("-----------------------------");
            System.out.println(" 1 - Quadrado");
            System.out.println(" 2 - Retângulo");
            System.out.println(" 3 - Triângulo");
            System.out.println(" 4 - Trapézio");
            System.out.println(" 5 - Losango");
            System.out.println("-----------------------------");

            System.out.println("Opção desejada: ");
            opcao = in.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("Digite o valor do lado: ");
                    x = in.nextDouble();
                    System.out.println("\n" + "Área = " + x * x);
                    break;

                case 2:
                    System.out.println("Digite o valor do lado menor: ");
                    x = in.nextDouble();
                    System.out.println("Digite o valor do lado maior: ");
                    y = in.nextDouble();
                    System.out.println("\n" + "Área = " + x * y);
                    break;

                case 3:
                    System.out.println("Digite o valor da base: ");
                    x = in.nextDouble();
                    System.out.println("Digite o valor da altura: ");
                    y = in.nextDouble();
                    System.out.println("\n" + "Área = " + (x * y) / 2);
                    break;

                case 4:
                    System.out.println("Digite o valor da base menor: ");
                    x = in.nextDouble();
                    System.out.println("Digite o valor da base maior: ");
                    y = in.nextDouble();
                    System.out.println("Digite o valor da altura: ");
                    z = in.nextDouble();
                    System.out.println("\n" + "Área = " + ((x + y) * z) / 2);
                    break;

                case 5:
                    System.out.println("Digite o valor da diagonal menor: ");
                    x = in.nextDouble();
                    System.out.println("Digite o valor da diagonal maior: ");
                    y = in.nextDouble();
                    System.out.println("\n" + "Área = " + (x * y) / 2);
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    public static void calcularVolume() {
        Scanner in = new Scanner(System.in);

        if (opcao != 0) {
            System.out.println("----------------------------------------");
            System.out.println(" 1 - Cubo");
            System.out.println(" 2 - Paralelepípedo");
            System.out.println(" 3 - Pirâmide de base quadrangular");
            System.out.println(" 4 - Prisma triangular");
            System.out.println(" 5 - Prisma pentagonal");
            System.out.println("----------------------------------------");

            System.out.println("Opção desejada: ");
            opcao = in.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("Digite o valor do lado: ");
                    x = in.nextDouble();
                    System.out.println("\n" + "Volume = " + x * x * x);
                    break;

                case 2:
                    System.out.println("Digite o valor do comprimento: ");
                    x = in.nextDouble();
                    System.out.println("Digite o valor da altura: ");
                    y = in.nextDouble();
                    System.out.println("Digite o valor da largura: ");
                    z = in.nextDouble();
                    System.out.println("\n" + "Volume = " + x * y * z);
                    break;

                case 3:
                    System.out.println("Digite o valor do lado da base: ");
                    x = in.nextDouble();
                    System.out.println("Digite o valor da altura: ");
                    y = in.nextDouble();
                    System.out.println("\n" + "Volume = " + ((x * x) * y) / 3);
                    break;

                case 4:
                    System.out.println("Digite o valor da base: ");
                    x = in.nextDouble();
                    System.out.println("Digite o valor da altura do triângulo: ");
                    y = in.nextDouble();
                    System.out.println("Digite o valor da altura do prisma: ");
                    z = in.nextDouble();
                    System.out.println("\n" + "Volume = " + 0.5 * x * y * z);
                    break;

                case 5:
                    System.out.println("Digite o valor da aresta da base: ");
                    x = in.nextDouble();
                    System.out.println("Digite o valor do apótema da base: ");
                    y = in.nextDouble();
                    System.out.println("Digite o valor da altura do prisma: ");
                    z = in.nextDouble();
                    System.out.println("\n" + "Volume = " + (((5 * x) * y) / 2) * z);
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }

    }

    public static void calcularRaizes() {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o valor do coeficiente a: ");
        x = in.nextDouble();
        
        if(x==0){
            System.out.println("Equação inválida.");
            return;
        }
        
        System.out.println("Digite o valor do coeficiente b: ");
        y = in.nextDouble();
        System.out.println("Digite o valor do coeficiente c: ");
        z = in.nextDouble();
        
        if (Math.sqrt(Math.pow(y, 2)-(4*x*z))%1 != 0){
            System.out.println("Equação inválida.");
            return;
        }
        
        z = Math.sqrt((Math.pow(y, 2))-(4*x*z));
        System.out.println("z = " +z);
        
        System.out.println("\n" + "Xi = " + ((-y+z)/(2*x)));
        System.out.println("Xii = " + ((-y-z)/(2*x)));
    }

    public static void calcularFibonacci() {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o limite da sequência.");
        BigInteger x = in.nextBigInteger();
        BigInteger y = BigInteger.valueOf(1);
        BigInteger z = BigInteger.valueOf(0);

        while (y.compareTo(x) <= 0) {
            System.out.print(y + " ");
            y = y.add(z);
            z = y.subtract(z);
        }
    }

    public static void calcularFatorial() {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o número desejado: ");
        BigInteger b = in.nextBigInteger();
        BigInteger a = b.subtract(BigInteger.valueOf(1));

        while (a.compareTo((BigInteger.valueOf(0))) > 0) {
            b = b.multiply(a);
            a = a.subtract(BigInteger.valueOf(1));
        }
        System.out.println(b);
    }

    public static void verificarPalindromo() {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite uma palavra.");
        String palavra = in.nextLine();

        if (palavra.equals(new StringBuilder(palavra).reverse().toString())) {
            System.out.println("A palavra é um palíndromo.");
        } else {
            System.out.println("A palavra não é um palíndromo.");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (opcao != 0) {
            System.out.println("----------------------------------------");
            System.out.println(" 1 - Área de cinco figuras geométricas");
            System.out.println(" 2 - Volume de cinco sólidos geométricos");
            System.out.println(" 3 - Raízes de uma equação válida do segundo grau");
            System.out.println(" 4 - Sequência de Fibonacci");
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
