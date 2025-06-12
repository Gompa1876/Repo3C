package U1_TI_05_Usuario.src;

import U1_TI_05_Usuario.Cuenta;

public class CuentaAhorro extends Cuenta{
private double tasaInteresAnual;
public void aplicarInteres(){
    double interes = saldo*(tasaInteresAnual /12);
    //saldo = saldo+interes;
    saldo+=interes;
    //setSaldo(getSaldo()+interes);
} 

public double getTasaInteresAnual() {
    return tasaInteresAnual;
}
public CuentaAhorro(String numeroCuenta, String titular, double saldo, double tasaInteresAnual){
          super(numeroCuenta, titular, saldo);
          this.tasaInteresAnual =tasaInteresAnual;
public void setTasaInteresAnual(double tasaInteresAnual) {
    this.tasaInteresAnual = tasaInteresAnual;
}


}
