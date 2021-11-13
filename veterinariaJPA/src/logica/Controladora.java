
package logica;

import java.util.List;
import persistencia.ControladoraPersistencia;

public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void altaMascota(Mascota pet){
        controlPersis.crearMascota(pet);
    }
    
    public void bajaMascota(Mascota pet){
        controlPersis.eliminarMascota(pet);
    }
    
    public void bajaMascota(int id){
        controlPersis.eliminarMascota(id);
    }
    
    public List<Mascota> obtenerMascotas(){
        return controlPersis.obtenerMascotas();
    }
    
    public void modificarMascota(Mascota pet){
        controlPersis.modificarMascota(pet);
    }
    
    public Mascota buscarMascota(Mascota pet){
        return controlPersis.buscarMascota(pet);
    }
    
    public Mascota buscarMascota(int id){
        return controlPersis.buscarMascota(id);
    }
    
    
    
}
