public class Conta{
private String numero;
private String titular;
private double saldo;
private double projecaoMensal;
 Conta(String numero, String titular, double saldo, double projecaoMensal){
    this.numero = numero;
    this.titular = titular;
    this.saldo = saldo;
    this.projecaoMensal = projecaoMensal;

}
public String getnumero(){
    return numero;
}

public void setnumero(String numero){
    this.numero = numero;
}

public String gettitular(){
    return titular;
}

public void settitular(String titular){
    this.titular = titular;
}

public double getsaldo(){
    return saldo;
}

public void setsaldo(double saldo){
    this.saldo = saldo;

}
public double getprojecaoMensal(){
    return projecaoMensal;
}
public void setprojecaomensal(double projecaoMensal){
    this.projecaoMensal = projecaoMensal;
}


    public void mostrarDados(){
        System.out.println("Número da conta: " + numero);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo original: " + saldo + " R$");
        System.out.println("Saldo estimado após a projeção mensal: " + (saldo+(saldo*projecaoMensal)) + " R$");
    }
    
}

