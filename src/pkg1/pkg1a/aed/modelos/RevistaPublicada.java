
package pkg1.pkg1a.aed.modelos;

public class RevistaPublicada extends ArticulosPublicados {
    
    public String titulo;
    public String formato; 
    public String correo;  
    public String nombreAutor;
    public String editorial;
    
    
    public RevistaPublicada() {
        
    }
   
    public RevistaPublicada(String titulo, String formato, String correo, String nombreAutor, String Editorial) {
        this.titulo = titulo;
        this.formato = formato;
        this.correo = correo;
        this.nombreAutor = nombreAutor;
        this.editorial = Editorial;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String Editorial) {
        this.editorial = Editorial;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float Precio) {
        this.precio = Precio;
    }

    @Override
    public String toString() {
        return String.format( "Titulo: %s\nAutor: %s\nEditorial: %s\nFormato: %s\nCorreo: %s\nNimero de paginas: %d\nPrecio: %.2f\n",
            titulo, nombreAutor, editorial, formato, correo, this.getNumeroDePaginas(), this.getPrecio());
    }
    
    
  
}
