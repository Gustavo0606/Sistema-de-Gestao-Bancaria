public class ContaPoupanca extends Conta{
    private double taxaRendimentoMensal;
    ContaPoupanca(String numero, String titular, double saldo, double taxaRendimentoMensal, double projecaoMensal){
        super(numero, titular, saldo, projecaoMensal);
        this.taxaRendimentoMensal= taxaRendimentoMensal;

       

    }
     public double gettaxaRendimentoMensal(){
            return taxaRendimentoMensal;
        }

    public void settaxaRendimentoMensal(double taxaRendimentoMensal){
        this.taxaRendimentoMensal = taxaRendimentoMensal;
    }
    public void mostrarDados(boolean taxaAnual){
        super.mostrarDados();
        System.out.println("Rendimento mensal estimado: " + (getsaldo()*gettaxaRendimentoMensal()) + " R$");

        if (taxaAnual){System.out.println("Rendimento anual estimado: " + (getsaldo()*(gettaxaRendimentoMensal()*12)) + " R$");
        }
        System.out.println("-------------------------");
    }
    }

