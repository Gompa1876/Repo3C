public class App {
    public static void main(String[] args) throws Exception 
    {
     Empleado empleado1 = new EmpleadoPorHora("1", "Pancho", 50, 8);
     System.out.println("salario total del trabajador es:" + empleado1.calcularSalario());
     Empleado empleado2 =new EmpleadoTiempoCompleto("11", "Juan", 100, 8);
     System.out.println("salario total del trabajador es:"+ empleado2.calcularSalario());
      
    }

}
