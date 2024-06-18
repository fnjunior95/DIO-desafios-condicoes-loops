import java.util.Scanner;

public class VerificadorNumeroConta {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            try {
                String numeroConta = scanner.nextLine();
                verificarNumeroConta(numeroConta);
                // Caso nenhuma exceção seja lançada, imprime a mensagem de sucesso.
                System.out.println("Numero de conta valido.");
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            } finally {
                // Fechar o scanner para evitar vazamentos de recursos
                scanner.close();
            }
        }
    }

    private static void verificarNumeroConta(String numeroConta) {
        if (numeroConta.length() != 8) {
            throw new IllegalArgumentException("Numero de conta invalido. Digite exatamente 8 digitos.");
        }
    }
}