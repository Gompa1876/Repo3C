public class EmpleadoTiempoCompleto extends Empleado 
 {

    private String beneficio;
    

     public EmpleadoTiempoCompleto(String Id, String Nombre, double salarioBase, int horasTrabajadas) {
        super(Id, Nombre, salarioBase);
    }
    public  double calcularSalario()
    {
        return salarioBase;
    }
    public String getBeneficio() {
        return beneficio;
    }
     
}
