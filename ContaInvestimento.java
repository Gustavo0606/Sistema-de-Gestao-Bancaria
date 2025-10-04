public class ContaInvestimento extends Conta{
    private double taxaAdministracao;
    ContaInvestimento(String numero, String titular, double saldo, double taxaAdministracao){
        super(numero, titular, saldo);
        this.taxaAdministracao = taxaAdministracao;
    }
    public double gettaxaAdministracao(){
        return taxaAdministracao;
    }
    public void settaxaAdministracao(double taxaAdministracao){
        this.taxaAdministracao = taxaAdministracao;
    }

}

