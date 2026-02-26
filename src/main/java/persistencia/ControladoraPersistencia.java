package persistencia;

// Persistencia y Logica necesitan de una clase controladora que se encargue de ser el puente entre lo que se manda
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Duenio;
import logica.Mascota;
import persistencia.exceptions.NonexistentEntityException;

// es decir, recibe los datos que se ingresan y se encargar de ver en donde iria cada dato
public class ControladoraPersistencia {

    DuenioJpaController dueniojpa = new DuenioJpaController();
    MascotaJpaController mascojpa = new MascotaJpaController();

    public void guardar(Duenio duenio, Mascota masco) {

        // Creamos primero el duenio en la bd, para que asi, cuando se cree la mascota, se relacione con ese duenio
        dueniojpa.create(duenio);

        // Creamos la mascota en la bd
        mascojpa.create(masco);
    }

    public List<Mascota> traerMascotas() {
        // El findMascotaEntities es, trae todas las entidades que encuentre en la bd y las asigna en donde nosotros digamos
        // pero al poner el return, se lo devuelve a la controladora de la logica y la logica lo pasa y asi
        return mascojpa.findMascotaEntities();
    }

    public void borrarMascota(int num_cliente) {
        // En este caso, necesitamos encapsular todo en un try-catch, en caso de que el numero de cliente no exita en la bd
        // En un caso real, relacion 1 duenio puede tener muchas mascotas, el duenio no se eliminaria, porque en un futuro el duenio
        // puede llegar a tener mas mascotas
        try {
            mascojpa.destroy(num_cliente);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Mascota traerMascota(int num_cliente) {
        // Ponemos nuevamente el return y en lugar de el metodo .edit, usamos el .findMascota, para buscarla por el numero de cliente
        return mascojpa.findMascota(num_cliente);
    }

    public void modificarMascota(Mascota masco) {
        // En caso de no encontrar el duenio, lo hacmeos el try-catch
        // Y ahora si, usamos el metodo edit, para editar la mascota
        try {
            mascojpa.edit(masco);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Duenio traerDuenio(int id_duenio) {
        return dueniojpa.findDuenio(id_duenio);
    }

    public void modificarDuenio(Duenio duenio) {
        // En caso de no encontrar el duenio, lo hacmeos el try-catch
        // Y ahora si, usamos el metodo edit, para editar el duenio
        try {
            dueniojpa.edit(duenio);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
