public abstract class Empleado {

    private String Id;
    private String Nombre;
    protected double salarioBase;


    public  Empleado(String Id, String Nombre,double salarioBase){
        this.Id = Id;
        this.Nombre = Nombre;
        this.salarioBase = salarioBase;
    }
     
    public abstract double calcularSalario();

    








    public String getId() {
        return Id;
    }
    public void setId(String id) {
        Id = id;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public double getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    
}
