import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sim = 0, nao = 0;

        for (int i = 1; i <= 15; i++) {
            System.out.print("Usuário " + i + ", você gosta de beterraba? (1-SIM / 2-NÃO): ");
            int resp = sc.nextInt();
            if (resp == 1) sim++;
            else if (resp == 2) nao++;
        }

        System.out.println("\nSIM: " + sim);
        System.out.println("NÃO: " + nao);
    }
}
