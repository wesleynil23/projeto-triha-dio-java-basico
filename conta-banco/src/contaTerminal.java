import java.util.Locale;
import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // exibir as mensagens para o usuário
        // obter valor digitado pelo usuário

        System.out.println("Por favor, digite o número do seu banco");
        int Banco = scanner.nextInt();

        System.out.println("Por favor, digite o número da sua agéncia");
        double Agencia = scanner.nextInt();

        System.out.println("Por favor, digite seu nome");
        String Nome = scanner.next();

        // exibir mensagem conta criada

        System.out.println("Olá " + Nome + "!");
        System.out.println("Obrigado por criar uma conta em nosso banco, sua agência é " + Banco + "");
        System.out.println("Sua conta é " + Agencia + "!");
        System.out.println("Seu saldo é " + 100 + " já está disponível para saque. Obrigado pela preferencia e tenha um ótimo dia!");

    }
}
