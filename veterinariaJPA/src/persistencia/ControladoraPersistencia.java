
package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Mascota;
import persistencia.exceptions.NonexistentEntityException;

public class ControladoraPersistencia {
    
    MascotaJpaController mascotaJPA = new MascotaJpaController();
    
    //método para alta
    public void crearMascota(Mascota pet){
        try {
            mascotaJPA.create(pet);
        } catch (Exception e) {
            System.out.println("La mascota no pudo ser creada. Error: "+ e.getLocalizedMessage());
        }
    }
    
    //método para baja
    public void eliminarMascota(Mascota pet){
        try {
            mascotaJPA.destroy(pet.getId());
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void eliminarMascota(int id){
        try {
            mascotaJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //método para lectura
    public List<Mascota> obtenerMascotas(){
        /*Devuelve todos los registros de una entidad*/
        return mascotaJPA.findMascotaEntities();
    }    
    
    //método para modificación
    public void modificarMascota(Mascota pet){
        try {
            mascotaJPA.edit(pet);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //método para modificación
    public Mascota buscarMascota(int id){
        return mascotaJPA.findMascota(id);
    }
    
    public Mascota buscarMascota(Mascota pet){
        return mascotaJPA.findMascota(pet.getId());
    }
            
    
}
