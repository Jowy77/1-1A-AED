package pkg1.pkg1a.aed.modelos;

public class CheckErrors {

    public CheckErrors() {

    }

    public boolean comprobarCamposVacioRevistaPublicada(RevistaPublicada revista) {
        
        return revista.getTitulo().isEmpty() | revista.getCorreo().isEmpty() 
                | revista.getEditorial().isEmpty() | revista.getNombreAutor().isEmpty() 
                | revista.getNumeroDePaginas() <= -1;

    }
    
    public boolean comprobarCorreoElectronico(String correo) {
    
        return correo.matches("^[a-zA-Z0-9._-]+@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}$");
    }
    
    public boolean comprobarNumerosNegativos(int numero) {
        
        return numero < 0;
    }
    
    public boolean comprobarNumerosNegativos(float numero) {
        
        return numero < 0;
    }
    
    public boolean comprobarPrecioConComa(String precio) {
    
        return precio.matches("^[0-9]+\\.?[0-9]*");
    }
    
    public boolean comprobarNumeroDePagina(String numero) {
    
        return numero.matches("[0-9]+$");
    }
    
    public void revistaOBoletinAniadidosCorrectamente(String clase) {
        
        if (clase.equals(RevistaPublicada.class)) {
        
            System.out.println("[i] Revista añadida con exito");
            
        } else if (clase.equals(RevistaPublicada.class)) {
        
            System.out.println("[i] Boletin añadido con exito");
        } 
    }

    public boolean comprobarFechaFormato(String fecha) {

        return fecha.matches("^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$");
    }
    
    public boolean comprobarNombres(String nombre) {
    
        return nombre.matches("^[a-zA-ZáéíóúÁÉÍÓÚüÜñÑ'´`]+$");
    }
}
