
package logica;

import java.util.List;
import persistencia.ControladoraPersistencia;

public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void crearMascota(String num_cliente, String nombre_perro, String raza, String color, boolean alergico, boolean atencion_especial, String nombre_duenio, String celular_duenio, String observaciones){
        Mascota pet = new Mascota();
        
        pet.setNum_cliente(num_cliente);
        pet.setNombre_perro(nombre_perro);
        pet.setRaza(raza);
        pet.setColor(color);
        pet.setAlergico(alergico);
        pet.setAtencion_especial(atencion_especial);
        pet.setNombre_duenio(nombre_duenio);
        pet.setCelular_duenio(celular_duenio);
        pet.setObservaciones(observaciones);
        
        controlPersis.crearMascota(pet);
    }
    
    public void crearMascota(Mascota pet){
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
