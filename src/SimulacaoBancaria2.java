import java.util.Scanner;

public class SimulacaoBancaria2 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double saldo = 0;
            boolean continuar = true;
            
            while (continuar) {
                // Exibe o menu de opções
                System.out.println("Escolha uma opção:");
                System.out.println("1: Depositar");
                System.out.println("2: Sacar");
                System.out.println("3: Consultar Saldo");
                System.out.println("0: Encerrar");
                
                int opcao = scanner.nextInt();
                
                switch (opcao) {
                    case 1 -> {
                        // Depositar
                        System.out.println("Digite o valor a ser depositado:");
                        double deposito = scanner.nextDouble();
                        saldo += deposito;
                        System.out.printf("Saldo atual: %.1f%n", saldo);
                    }
                    case 2 -> {
                        // Sacar
                        System.out.println("Digite o valor a ser sacado:");
                        double saque = scanner.nextDouble();
                        if (saque > saldo) {
                            System.out.println("Saldo insuficiente.");
                        } else {
                            saldo -= saque;
                            System.out.printf("Saldo atual: %.1f%n", saldo);
                        }
                    }
                    case 3 -> // Consultar Saldo
                        System.out.printf("Saldo atual: %.1f%n", saldo);
                    case 0 -> {
                        // Encerrar
                        System.out.println("Programa encerrado.");
                        continuar = false;
                    }
                    default -> // Opção inválida
                        System.out.println("Opção inválida. Tente novamente.");
                }
            }
        }
    }
}
