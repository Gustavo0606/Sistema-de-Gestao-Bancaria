import java.util.Scanner;
import java.util.Locale;
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Escolha um tipo de conta para cadastrar:");
            System.out.println("1 - Conta Corrente");
            System.out.println("2 - Conta Poupança");
            System.out.println("3 - Conta Investimento");
            System.out.println("0 - Encerrar o programa");
            int escolha = sc.nextInt();
            sc.nextLine();
            if (escolha ==1){
                System.out.println("Digite o numero da conta: ");
                String numConta = sc.nextLine();
                System.out.println("Digite o nome do titular da conta: ");
                String titular = sc.nextLine();
                System.out.println("Digite o saldo da conta: (ex: 1500.50) ");
                double saldo = sc.nextDouble();
                System.out.println("Digite a projeção mensal (em porcentagem) para o próximo mês: (ex: 10)");
                double projecaoMensal = sc.nextDouble()/100;
                System.out.println("Digite o limite do cheque especial: ");
                double limiteChequeEspecial = sc.nextDouble();
                ContaCorrente contaCorrente = new ContaCorrente(numConta, titular, saldo, limiteChequeEspecial, projecaoMensal);
                System.out.println("Gostaria de um detalhamento na exibiçao dos dados da conta? 1- sim 2- não");
                int detalhamento = sc.nextInt();
                sc.nextLine();
                boolean detalharLimite = (detalhamento == 1);
                contaCorrente.mostrarDados(detalharLimite);
                
            }else if (escolha ==2){
                System.out.println("Digite o numero da conta: ");
                String numConta = sc.nextLine();
                System.out.println("Digite o nome do titular da conta: ");
                String titular = sc.nextLine();
                System.out.println("Digite o saldo da conta: (ex: 1500.50) ");
                double saldo = sc.nextDouble();
                System.out.println("Digite a projeção mensal (em porcentagem) para o próximo mês: (ex: 10)");
                double projecaoMensal = sc.nextDouble()/100;
                System.out.println("Digite a taxa de rendimento mensal (em porcentagem): ");
                double taxaRendimentoMensal = sc.nextDouble()/100;
                ContaPoupanca contaPoupanca = new ContaPoupanca(numConta, titular, saldo, taxaRendimentoMensal, projecaoMensal);
                System.out.println("Gostaria de exibir o rendimento anual da conta? 1- sim 2- não");
                int exibirRendimento = sc.nextInt();
                sc.nextLine();
                boolean taxaAnual = (exibirRendimento == 1);
                contaPoupanca.mostrarDados(taxaAnual);

            }else if (escolha ==3){
                System.out.println("Digite o numero da conta: ");
                String numConta = sc.nextLine();
                System.out.println("Digite o nome do titular da conta: ");
                String titular = sc.nextLine();
                System.out.println("Digite o saldo da conta: (ex: 1500.50) ");
                double saldo = sc.nextDouble();
                System.out.println("Digite a projeção mensal (em porcentagem) para o próximo mês: (ex: 10)");
                double projecaoMensal = sc.nextDouble()/100;
                System.out.println("Digite a taxa de administração (em porcentagem): ");
                double taxaAdministracao = sc.nextDouble()/100;
                ContaInvestimento contaInvestimento = new ContaInvestimento(numConta, titular, saldo, taxaAdministracao, projecaoMensal);
                System.out.println("Gostaria de ver o saldo da conta após a projeção mensal e taxas? 1- sim 2- não");
                int exibirSaldo = sc.nextInt();
                sc.nextLine();
                boolean considerarTaxas = (exibirSaldo == 1);
                contaInvestimento.mostrarDados(considerarTaxas);
            }else if (escolha ==0){
                System.out.println("Obrigado por utlizar o sistema de gestão bancária. Até logo!");
                break;
            }
        }
    }
}
