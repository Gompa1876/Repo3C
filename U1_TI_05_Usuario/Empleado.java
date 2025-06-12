package U1_TI_05_Usuario;

public abstract class Empleado {

private String Id;
private String nombre;
private double salarioBase;

public void depositar (double Cantidad){
    if(Cantidad >0){
        saldo += Cantidad;

    }else{
        System.out.println("no se puede hacer un deposito:"+ Cantidad);
    }
} 
public void retirar (double Cantidad){
    if(Cantidad > 0 && saldo >= Cantidad){
        if(Cantidad%100==0){
            saldo = saldo-Cantidad;
            //setSaldo(getSaldo()-Cantidad); 
        }else{
            System.out.println("solo puedes retirar en multiplos de 100");
        }
    }else{
        System.out.println("no cuentas con suficiente saldo");
    }
}
public String getNumeroCuenta() {
    return numeroCuenta;
}
public void setNumeroCuenta(String numeroCuenta) {
    this.numeroCuenta = numeroCuenta;
}
public String getTitula() {
    return titular;
}
public void setTitula(String titula) {
    this.titular = titula;
}
public double getSaldo() {
    return saldo;
}
public void setSaldo(double saldo) {
    this.saldo = saldo;
}


}
