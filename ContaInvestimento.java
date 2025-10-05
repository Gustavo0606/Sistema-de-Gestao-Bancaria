public class ContaInvestimento extends Conta{
    private double taxaAdministracao;
    ContaInvestimento(String numero, String titular, double saldo, double taxaAdministracao, double projecaoMensal){
        super(numero, titular, saldo, projecaoMensal);
        this.taxaAdministracao = taxaAdministracao;
    }
    public double gettaxaAdministracao(){
        return taxaAdministracao;
    }
    public void settaxaAdministracao(double taxaAdministracao){
        this.taxaAdministracao = taxaAdministracao;
    }
public void mostrarDados(boolean considerarTaxas){
    super.mostrarDados();
    System.out.println("Taxa de Administração: " + taxaAdministracao);
    if (considerarTaxas){
        System.out.println("Saldo após projeção mensal e taxas: " + (getsaldo() + (getsaldo()*getprojecaoMensal()) - (getsaldo()*gettaxaAdministracao())) + " R$");
    }
    System.out.println("-------------------------");
}
}

