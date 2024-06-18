import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double saldo = 0;
            boolean continuar = true;

            while (continuar) {
                System.out.println("Escolha uma opção:");
                System.out.println("1 - Depositar");
                System.out.println("2 - Sacar");
                System.out.println("3 - Ver saldo");
                System.out.println("0 - Sair");

                int opcao = scanner.nextInt();

                switch (opcao) {
                    case 1 -> {
                        System.out.println("Digite o valor a ser depositado:");
                        saldo += scanner.nextDouble();  // Consome a quebra de linha após o número
                        System.out.printf("Saldo atual:"+"%.1f%n", saldo);
                    }
                    case 2 -> {
                        System.out.println("Digite o valor a ser sacado:");
                        double aux = scanner.nextDouble();  // Consome a quebra de linha após o número
                        if(aux > saldo)
                        {
                            System.out.println("Saldo insuficiente.");
                        }
                        else
                        {
                            saldo -= aux;
                            System.out.printf("Saldo atual:"+"%.1f%n", saldo);
                        }
                    }
                    case 3 ->System.out.printf("Saldo atual:"+"%.1f%n", saldo);

                    case 0 -> {
                        System.out.println("Programa encerrado.");
                        continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    }
                    default -> System.out.println("Opção inválida. Tente novamente.");
                }
            }
            scanner.close();
        }
    }
}