import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // TO DO LIST:       
        //Conhecer e importar a classe scanner.
        Scanner scanner = new Scanner(System.in).useLocale((Locale.US));

       // Enviar as mensagens para o nosso usuário.
       // Obter os valores pelo scanner.

        System.out.println("Seja bem vindo(a) ao Banco SantanaDer!");

        System.out.print("Informe seu nome: ");
        String nome = scanner.next();

        System.out.print("Informe o sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Agora vamos aos seus dados bancários.");

        System.out.print("Agência: ");
        String agencia = scanner.next();

        System.out.print("Conta: ");
        int conta = scanner.nextInt();

        System.out.print("Qual o seu saldo bancário? ");
        float saldo = scanner.nextFloat();

       // Exibir a mensagem conta criada.

       System.out.println("Olá " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
