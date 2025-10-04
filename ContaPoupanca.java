public class ContaPoupanca extends Conta{
    private double taxaRendimentoMensal;
    ContaPoupanca(String numero, String titular, double saldo, double taxaRendimentoMensal){
        super(numero, titular, saldo);
        this.taxaRendimentoMensal= taxaRendimentoMensal;

       

    }
     public double gettaxaRendimentoMensal(){
            return taxaRendimentoMensal;
        }

    public void settaxaRendimentoMensal(double taxaRendimentoMensal){
        this.taxaRendimentoMensal = taxaRendimentoMensal;
    }
}
