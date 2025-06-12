package U1_TI_05_Usuario.src.Model.App;

import U1_TI_05_Usuario.Cuenta;
import U1_TI_05_Usuario.src.CuentaAhorro;
import U1_TI_05_Usuario.src.CuentaComun;

public class App {
public static void main (String[] args) throws Exception {
    Cuenta CuentaComun = new CuentaComun("EDRV123456-CC","Eliel");
    CuentaComun.depositar(500);
    CuentaComun.retirar(500);

    CuentaAhorro = new CuentaAhorro("EDRV123456", "David");
    