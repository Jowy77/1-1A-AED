package pkg1.pkg1a.aed.modelos;

public class ArticulosPublicados {

    public int numeroDePaginas;
    public float precio;

    public ArticulosPublicados() {
    }

    public ArticulosPublicados(int numeroDePaginas, float Precio) {
        this.numeroDePaginas = numeroDePaginas;
        this.precio = Precio;
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
}
