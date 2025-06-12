public class EmpleadoPorHora extends Empleado {
 
    private int horasTrabajadas;

    public EmpleadoPorHora(String Id, String Nombre, double salarioBase, int horasTrabajadas) {
        super(Id, Nombre, salarioBase);
        this.horasTrabajadas = horasTrabajadas;
    }

     
    public double calcularSalario()
    {
    return salarioBase * horasTrabajadas;
   
    }
   
}
