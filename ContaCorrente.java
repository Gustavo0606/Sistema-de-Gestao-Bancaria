public class ContaCorrente extends Conta{
    private double limiteChequeEspecial;
    ContaCorrente(String numero, String titular, double saldo, double limiteChequeEspecial){
        super(numero, titular, saldo);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }
    public double getlimiteChequeEspecial(){
        return limiteChequeEspecial;
    }
    public void setlimiteChequeEspecial(double limiteChequeEspecial){
        this.limiteChequeEspecial = limiteChequeEspecial;
    }
}
