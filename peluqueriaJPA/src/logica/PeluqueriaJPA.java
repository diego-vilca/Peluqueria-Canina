
package logica;

import igu.Principal;
import java.util.List;

public class PeluqueriaJPA {

   
    public static void main(String[] args) {
        // genero una instancia de controladora para que todo se conecte con la lógica.
        Controladora control = new Controladora();
        // llamo a mi interfaz gráfica.
        Principal princ = new Principal(control);
        // la hago visible
        princ.setVisible(true);
        // la centro
        princ.setLocationRelativeTo(null);
               

    }
    
}
