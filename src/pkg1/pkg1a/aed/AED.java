package pkg1.pkg1a.aed;

import pkg1.pkg1a.aed.modelos.BoletinPublicado;
import pkg1.pkg1a.aed.modelos.RevistaPublicada;
import pkg1.pkg1a.aed.vistas.MainView;
import java.util.ArrayList;

public class AED {

    public static void main(String[] args) {
        
        ArrayList <RevistaPublicada> nuevaRevistaPublicadas = new ArrayList<>();
        ArrayList <BoletinPublicado> nuevoBoletinesPublicados = new ArrayList<>();
        MainView pantallaPrincipal = new MainView(nuevaRevistaPublicadas, nuevoBoletinesPublicados);
        pantallaPrincipal.setVisible(true);
    }
    
}
