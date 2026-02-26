package logica;

// Persistencia y Logica necesitan de una clase controladora que se encargue de ser el puente entre lo que se manda
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import persistencia.ControladoraPersistencia;

// es decir, recibe los datos que se ingresan y se encargar de ver en donde iria cada dato
public class Controladora {

    // Llamamos a la controladora de la persistencia, y es a su vez, llamara a los metodos de los jpa
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void mostrarMensaje(String mensaje, String tipo, String titulo) {
        // Creamos un popup que, cuando le damos click al boton de guardar, aparezca un cartelito que se guardo exitosamente
        JOptionPane optionPane = new JOptionPane(mensaje);

        // Aca lo que hacemos es, dependiendo ddel tipo de mensaje que le pasemos, lo igualamos (equals) a un string, usamos equals para
        // comparar strings porque es mas facil y recomendado, y si eso da true, ejecutamos segun corresponda
        if (tipo.equals("Info")) {
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE); //Definimos que clase de mensaje queremos que sea
        } else if (tipo.equals("Error")) {
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE); //Definimos que clase de mensaje queremos que sea
        }

        JDialog dialog = optionPane.createDialog(titulo); // Ponemos una pantallita que queremos que aparezca, va a estar dentro del optionPane que creamos con el titulo
        dialog.setAlwaysOnTop(true); // Ponerlo siempre arriba
        dialog.setVisible(true); // Que este visible
    }

    public void guardar(String nombreMasco, String raza, String color, String observaciones, String alergico, String atenEsp, String nombreDuenio, String celDuenio) {

        Duenio duenio = new Duenio();
        duenio.setNombre(nombreDuenio);
        duenio.setCelDuenio(celDuenio);

        Mascota masco = new Mascota();
        masco.setNombre(nombreMasco);
        masco.setRaza(raza);
        masco.setColor(color);
        masco.setAlergico(alergico);
        masco.setAtencion_especial(atenEsp);
        masco.setObservaciones(observaciones);
        masco.setUnDuenio(duenio); // En este lo que hacemos en el set duenio, asignamos el duenio que creamos arriba, 
        // automaticamente nos relaciona la mascota creada con el duenio creado.

        controlPersis.guardar(duenio, masco); // Creamos a ambos en la bd y los guardamos (la persistencia se encarga de guardar todo en la bd)
    }

    public List<Mascota> traerMascotas() {
        // Al ser un metodo que tiene que devolver una lista, se utiliza return
        return controlPersis.traerMascotas();
    }

    public void borrarMascota(int num_cliente) {
        controlPersis.borrarMascota(num_cliente);
    }

    public Mascota traerMascota(int num_cliente) {
        // Ponemos un return porque esto nos devuelve un objeto mascota para editar
        return controlPersis.traerMascota(num_cliente);
    }

    public void modificarMascota(Mascota masco, String nombreMasco, String raza, String color,
            String observaciones, String alergico, String atenEsp, String nombreDuenio, String celDuenio) {
        // Ahora la controladora logica tiene la tarea de, al objeto masco, que es el original sin modificar, asignarle los nuevos datos
        // Modificamos la mascota
        masco.setNombre(nombreMasco);
        masco.setRaza(raza);
        masco.setColor(color);
        masco.setObservaciones(observaciones);
        masco.setAlergico(alergico);
        masco.setAtencion_especial(atenEsp);
        controlPersis.modificarMascota(masco);

        // Para modificar el duenio, tenemos que primero identificalo
        Duenio duenio = this.buscarDuenio(masco.getUnDuenio().getId_duenio());
        duenio.setNombre(nombreDuenio);
        duenio.setCelDuenio(celDuenio);
        this.modificarDuenio(duenio);
    }

    // Lo mas optimo es crear un metodo para buscar un duenio, para tener un metodo exclusivo,
    // si quiero en algun momento modificar solamente el duenio
    private Duenio buscarDuenio(int id_duenio) {
        return controlPersis.traerDuenio(id_duenio);
    }

    // Tambien los mas optimo es crear un metodo para modificar un duenio, no solamente para traerlo
    private void modificarDuenio(Duenio duenio) {
        controlPersis.modificarDuenio(duenio);
    }

}
