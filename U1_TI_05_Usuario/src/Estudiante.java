

public class Estudiante {
    
    private String nombre;
    private String matricula;
    private double[] notas=new double[5];
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public double getNotas(int i) {
        return notas[i];
    }
    public void setNotas(int i, double nota) {
        this.notas[i] = nota;
    }

    public double getAverage(){

      //double calificacion1=this.notas[0];
      //double calificacion2=this.notas[1];
      //double calificacion3=this.notas[2];
      //double calificacion4=this.notas[3];
     // double calificacion5=this.notas[4];
     //   double av = (calificacion1+calificacion2+calificacion3+calificacion4+calificacion5);
        double acum =0;
        for (int i = 0; i< notas.length; i++){
            acum += notas[i];

        }
        double res = acum / notas.length;
        return res;
    
    }
    public boolean isApproved(){
        //boolean approved;

        //if(getAverage()>=70){
            //return true;
       // }

        //return false;
        return getAverage()>=70;
    }
}
