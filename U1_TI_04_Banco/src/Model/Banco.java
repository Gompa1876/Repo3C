package Model;

public class Banco {
    
private String titular;
private double saldo;

public void depositar(double monto){
    if (monto >0) {
        this.saldo+= monto;
    }
}

public boolean retirar(double monto){
    if (monto > 0 && saldo>=monto){
       saldo -= monto;
       System.out.println("operacion completada");
       System.out.println();
       System.out.println("saldo:" +getSaldo());
        return  true;
    }else{
     System.out.println("sin presupuesto");
        return false;
    }
}

public String getTitular() {
    return titular;
}

public void setTitular(String titular) {
    this.titular = titular;
}

public double getSaldo() {
    return saldo;
}

}
