import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double n1 = sc.nextDouble();
        System.out.print("Digite o segundo número: ");
        double n2 = sc.nextDouble();

        System.out.print("Escolha a operação (1-Média, 2-Diferença, 3-Produto, 4-Divisão): ");
        int cod = sc.nextInt();

        switch (cod) {
            case 1: System.out.println("Média: " + (n1 + n2) / 2); break;
            case 2: System.out.println("Diferença: " + Math.abs(n1 - n2)); break;
            case 3: System.out.println("Produto: " + (n1 * n2)); break;
            case 4:
                if (n2 != 0) System.out.println("Divisão: " + (n1 / n2));
                else System.out.println("Erro: divisão por zero!");
                break;
            default: System.out.println("Código inválido!");
        }
    }
}