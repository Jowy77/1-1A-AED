
package pkg1.pkg1a.aed.modelos;

public class BoletinPublicado extends ArticulosPublicados {
    
    private String nombre;
    private String fecha;

    public BoletinPublicado() {
    }
    
    public BoletinPublicado(String nombre, String fecha) {
        this.nombre = nombre;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
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
        return String.format("Nombre del boletin: %s\nFecha: %s\nNumero de paginas: %d\nPrecio: %.2f\n",
                nombre, fecha, this.getNumeroDePaginas(), this.getPrecio());
    }
    
    
    
}
