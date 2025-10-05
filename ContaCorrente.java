public class ContaCorrente extends Conta{
    private double limiteChequeEspecial;
    ContaCorrente(String numero, String titular, double saldo, double limiteChequeEspecial, double projecaoMensal){
        super(numero, titular, saldo, projecaoMensal);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }
    public double getlimiteChequeEspecial(){
        return limiteChequeEspecial;
    }
    public void setlimiteChequeEspecial(double limiteChequeEspecial){
        this.limiteChequeEspecial = limiteChequeEspecial;
    }
    public void mostrarDados(boolean detalharLimite){
        super.mostrarDados();
        System.out.println("Limite do Cheque Especial: " + limiteChequeEspecial);
        if (detalharLimite){
            System.out.println("Saldo + Limite do Cheque Especial: " + (getsaldo() + limiteChequeEspecial) + " R$");
        }
        System.out.println("-------------------------");
    }
}
