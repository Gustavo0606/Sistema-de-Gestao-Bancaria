public class Conta{
private String numero;
private String titular;
private double saldo;
 Conta(String numero, String titular, double saldo){
    this.numero = numero;
    this.titular = titular;
    this.saldo = saldo;


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

}