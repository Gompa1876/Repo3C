import javax.swing.JOptionPane;

public class calificaciones {

    public static void main (String[] args)throws Exception {

    String calificacion1 = JOptionPane.showInputDialog("dame la primer calificacion");
    String calificacion2 = JOptionPane.showInputDialog("dame la segunda calificacion");
    String calificacion3 = JOptionPane.showInputDialog("dame la tercera calificacion");
    float resultado = (Integer.parseInt(calificacion1) + Integer.parseInt(calificacion2) + Integer.parseInt(calificacion3)/3);

    System.out.println("El promedio es:" + resultado);
    }
}
 
