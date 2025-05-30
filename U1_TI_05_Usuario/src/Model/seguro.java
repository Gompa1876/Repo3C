package Model;

public class seguro {

    private String nombreUsuario;
    private String password;



   
   public void setNombreUsuario(String nombreUsuario) {
    this.nombreUsuario = nombreUsuario;
    if(nombreUsuario != null && nombreUsuario.isEmpty()){
        System.out.println("no se aceptan cadenas vacías");
    }
}


    public void setPassword(String password) {
        this.password = password;

        if (password.length() >= 8) {
         
            System.out.println("Escribe una contraseña con 8 o mas caracteres");
        }
        boolean mayuscula = false;
        boolean minuscula = false;
        boolean digito = false;

        for (int i = 0; i< password.length(); i++){
            char charter = password.charAt(i);

            if(Character.isUpperCase(charter)){
            mayuscula = true;
            }
            if (Character.isLowerCase(charter)){
                minuscula = true;
            }
            if (Character.isDigit(charter)){
                digito = true;
            }
        }

        if (mayuscula == false){
             System.out.println("La contraseña debe tener al menos una letra mayúscula.");
        }
        if (minuscula == false){
             System.out.println("La contraseña debe tener al menos una letra minúscula.");
        }
        if (digito == false){

        }
    }
    public boolean autenticar (String intentPassword){
    
        if(intentPassword == password){

        }
        return true;
    }    
    

    
}
