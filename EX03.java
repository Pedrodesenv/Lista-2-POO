import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de a: ");
        double a = sc.nextDouble();
        System.out.print("Digite o valor de b: ");
        double b = sc.nextDouble();
        System.out.print("Digite o valor de c: ");
        double c = sc.nextDouble();

        if (a == 0) {
            System.out.println("Não é equação do 2º grau.");
        } else {
            double delta = b * b - 4 * a * c;
            System.out.println("Delta: " + delta);

            if (delta >= 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("x' = " + x1);
                System.out.println("x'' = " + x2);
            } else {
                System.out.println("A equação não possui soluções reais.");
            }
        }
    }
}