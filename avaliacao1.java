
import java.util.Scanner;

public class SistemaEscolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[8]; // 8 notas anuais
        double[] mediasBimestrais = new double[4]; // 4 médias bimestrais
        double[] mediasSemestrais = new double[2]; // 2 médias semestrais
        double mediaFinal;

        // Recebendo as 8 notas
        for (int i = 0; i < 8; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        // Calculando médias bimestrais
        for (int i = 0; i < 4; i++) {
            mediasBimestrais[i] = (notas[i * 2] + notas[i * 2 + 1]) / 2;
        }

        // Calculando médias semestrais
        mediasSemestrais[0] = (mediasBimestrais[0] + mediasBimestrais[1]) / 2;
        mediasSemestrais[1] = (mediasBimestrais[2] + mediasBimestrais[3]) / 2;

        // Calculando média final
        mediaFinal = (mediasSemestrais[0] + mediasSemestrais[1]) / 2;

        // Apresentando resultados
        System.out.println("\nPráticas\n");
        System.out.println("1º Bimestre: " + mediasBimestrais[0]);
        System.out.println("2º Bimestre: " + mediasBimestrais[1]);
        System.out.println("1º Semestre: " + mediasSemestrais[0]);
        System.out.println("----------------------");
        System.out.println("3º Bimestre: " + mediasBimestrais[2]);
        System.out.println("4º Bimestre: " + mediasBimestrais[3]);
        System.out.println("2º Semestre: " + mediasSemestrais[1]);
        System.out.println("----------------------");
        System.out.println("Média Final: " + mediaFinal);

        scanner.close();
    }
}
