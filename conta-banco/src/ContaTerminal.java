import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        // Exibir as mensagens para nosso usuário
        System.out.println("Por favor, digite seu nome e sobrenome:");
        String nome = scanner.nextLine();

        System.out.println("Por favor, digite o número da agência com o dígito:");
        String agencia = scanner.next();

        System.out.println("Por favor, digite os quatro números da conta:");
        int conta = scanner.nextInt();

        System.out.println("Por favor, digite o valor do saldo:");
        double saldo = scanner.nextDouble();

        // Exibir a mensagem de conta criada
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");
        
        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
