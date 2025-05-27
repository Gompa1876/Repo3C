import Model.Banco;

public class menu {

     public static void main(String[] args) throws Exception 
     {
     Banco CB =new Banco();

     CB.setTitular("cliente");
     System.out.println("cliente"+ CB.getTitular());

     CB.depositar(1000);
     System.out.println("saldo"+ CB.getSaldo());
     System.out.println();
     CB.retirar(200);
     CB.retirar(1000);
     }
}

