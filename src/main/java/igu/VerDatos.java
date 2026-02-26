package igu;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import logica.Controladora;
import logica.Mascota;

public class VerDatos extends javax.swing.JFrame {

    // Es buena practica siempre inicializar las variables de algun modo, aunque ya las tengamos en el constructor
    Controladora control = null;

    public VerDatos() {
        control = new Controladora();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMascotas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnVolver = new javax.swing.JButton();

        jTextField1.setText("Datos de las mascotas:");

        jButton2.setText("jButton1");

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 48)); // NOI18N
        jLabel1.setText("Visualizacion de Datos");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tablaMascotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaMascotas);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Datos de las mascotas:");

        btnEditar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Alejo UTN\\Desktop\\Programacion-Java\\imgsPeluqueria\\4226577-removebg-preview.png")); // NOI18N
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Alejo UTN\\Desktop\\Programacion-Java\\imgsPeluqueria\\png-clipart-computer-icons-scalable-graphics-icon-design-delete-button-logo-sign-thumbnail-removebg-preview.png")); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 879, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel2))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        btnVolver.setIcon(new javax.swing.ImageIcon("C:\\Users\\Alejo UTN\\Desktop\\Programacion-Java\\imgsPeluqueria\\59098-removebg-preview.png")); // NOI18N
        btnVolver.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVolver, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(16, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(193, 193, 193)
                        .addComponent(jLabel1)))
                .addContainerGap(151, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(107, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
        // Aca controlamos dos cosas
        // Si la tabla tiene por lo menos 1 registro al obtener las filas (getRowCount) (osea que sea mayor a 1) entramos al codigo
        if (tablaMascotas.getRowCount() > 0) {
            // Si la en nuestra tabla hay por lo menos 1 registro seleccionado, las tablas empiezan de 0, si el resultado de getSelectedRow es
            // -1, siginifica que no hay nada seleccionado, en ese caso, el boton no cumple su funcion
            if (tablaMascotas.getSelectedRow() != -1) {
                // Este pedazo de codigo lo que hace es lo siguiente:
                // Traeme y asigname en num_cliente, el valor en la tabla de mascotas(tablaMascotas.getValueAt()),
                // que esta ubicado en la columna 0 de la fila seleccionada(tablaMascotas.getSelectedRow(), 0)
                int num_cliente = Integer.parseInt(String.valueOf(tablaMascotas.getValueAt(tablaMascotas.getSelectedRow(), 0)));
                // Llamamos al metodo borrar de la logica
                control.borrarMascota(num_cliente);
                // Por ultimo le avisamos al usuario
                control.mostrarMensaje("Mascota eliminada correctamentte", "Info", "Borrado de mascota");
                // Al terminar de borrar la mascota y luego de darle click al "OK" del mensaje, volvemos a cargar la tabla para ver los datos actualizados
                cargarTabla();
            } else {
                control.mostrarMensaje("Ninguna mascota seleccionada", "Error", "Error al eliminar");
            }
        } else {
            control.mostrarMensaje("No hay nada para eliminar en la tabla", "Error", "Error al eliminar");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    // Este evento se inicializa cuando la ventana se abre
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        cargarTabla();

    }//GEN-LAST:event_formWindowOpened

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // Aca controlamos dos cosas
        // Si la tabla tiene por lo menos 1 registro al obtener las filas (getRowCount) (osea que sea mayor a 1) entramos al codigo
        if (tablaMascotas.getRowCount() > 0) {
            // Si la en nuestra tabla hay por lo menos 1 registro seleccionado, las tablas empiezan de 0, si el resultado de getSelectedRow es
            // -1, siginifica que no hay nada seleccionado, en ese caso, el boton no cumple su funcion
            if (tablaMascotas.getSelectedRow() != -1) {
                int num_cliente = Integer.parseInt(String.valueOf(tablaMascotas.getValueAt(tablaMascotas.getSelectedRow(), 0)));

                // Detalle a tener en cuenta: al constructor del modificador, le tenemos que pasar el numero de cliente al constructor,
                // sino nunca va a saber a quien tiene que editar. Modificamos el constructor tambien
                ModificarDatos pantallaModif = new ModificarDatos(num_cliente);
                pantallaModif.setVisible(true);
                pantallaModif.setLocationRelativeTo(null);
                
                this.dispose(); // Al llamar a modificar datos, cerramos la ventana de VerDatos, porque no se estaria utilizando
                
            } else {
                control.mostrarMensaje("Ninguna mascota seleccionada", "Error", "Error al editar");
            }
        } else {
            control.mostrarMensaje("No hay nada para editar en la tabla", "Error", "Error al editar");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tablaMascotas;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {

        // Definir el modelo que queremos que tenga la tabla
        // Esta clase especial nos permite establecer un modelo para nuestra tabla e ir agregandole columnas de forma personalizada
        DefaultTableModel modeloTabla = new DefaultTableModel() {

            // Aca con este metodo lo que estamos haciendo basicamente es, las filas y columnas de la tabla NO son editables
            // Esto lo hacemos creando un booleano para "isCellEditable" que significa si las celdas son editables, en este caso le ponemos que no
            
            // isCellEditable es un metodo unico de las tablas, por eso hay que sobreescribirla
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        ;

        };
        
        // Establecemos los nombres de la columna con un vector
        String titulos[] = {"Num", "Nombre", "Color", "Raza", "Alergico", "Att. Especial", "Dueño", "Celular"};
        // Ahora hacemos que estos titulos se setteen en la tabla
        modeloTabla.setColumnIdentifiers(titulos);

        // Carga de los datos desde la base de datos y lo guardamos en una lista
        List<Mascota> listaMascotas = control.traerMascotas();

        // Ahora tiene que recorrer la lista y mostrar cada uno de los elementos
        if (listaMascotas != null) {
            for (Mascota masco : listaMascotas) {
                // Creamos un array de objetos, utilizamos array porque cada mascota tiene distintos tipos de datos (string, int, boolean)
                // Estos son todos los valores que necesitamos, al necesitar 2 cosas del duenio, cuando llamamos al getDuenio, tenemos que hacer
                // otro punto mas y de ese duenio, traer su nombre y cel utilizando sus respectivos gettes
                Object[] objeto = {masco.getNum_cliente(), masco.getNombre(), masco.getColor(), masco.getRaza(), masco.getAlergico(),
                    masco.getAtencion_especial(), masco.getUnDuenio().getNombre(),
                    masco.getUnDuenio().getCelDuenio()};

                // Por ultimo agregamos el objeto que creamos a una row, que seria agregar una fila
                modeloTabla.addRow(objeto);
            }
        }
        // Al crear la tabla, hay que indicarle adonde tiene que aparecer el modelo, por eso, usamos la variable que tiene la tabla
        // y mediante el metodo setModel, le seteamos el modelo de tabla que creamos a la tabla original en la interfaz
        tablaMascotas.setModel(modeloTabla);
    }
}
