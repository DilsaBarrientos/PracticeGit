package co.edu.udea.edatos.practica1.vista;

import co.edu.udea.edatos.ejemplo1.modelo.Propietario;
import co.edu.udea.edatos.ejemplo1.negocio.PropietarioBsn;
import co.edu.udea.edatos.ejemplo1.negocio.exceptions.NoSeEncuentraException;
import co.edu.udea.edatos.ejemplo1.negocio.exceptions.YaExisteException;
import co.edu.udea.edatos.ejemplo1.negocio.impl.PropietarioBsnImpl;
import co.edu.udea.edatos.practica1.reportes.ExportarExcel;
import co.edu.udea.edatos.practica1.reportes.GeneradorStyleExcel;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/**
 * @author Luis Angel
 */
public class FrmPropietarios extends javax.swing.JFrame {

    ExportarExcel obj;
    PropietarioBsn propietarioBsn = new PropietarioBsnImpl();

    public FrmPropietarios(String llamo) {
        initComponents();
        this.setLocationRelativeTo(null);//para centrar la ventana
        String ruta = "C:\\Users\\Public\\Documents\\propietarios.txt";
        File archivo = new File(ruta);
        if (!archivo.exists()) {
            try {
                archivo.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        mostrarTodos();
        //validamos que submenu llamo a este formulario, para saber que controles habilitar
        switch (llamo) {
            case "registrar"://si se llamo desde el submenu registrar entonces
                //habilito tales controles y deshabilito tales controles
                txteliminardoc.setEnabled(false);
                btneliminar.setEnabled(false);
                txtbuscardoc.setEnabled(false);
                btnbuscar.setEnabled(false);
                btnmostrartodos.setEnabled(false);
                btndescargarreportes.setEnabled(false);
                jTable1.setEnabled(false);
                break;
            case "eliminar":
                txtapellidos.setEnabled(false);
                txtdocumento.setEnabled(false);
                txtedad.setEnabled(false);
                txtnombres.setEnabled(false);
                txttelefono.setEnabled(false);
                cmbgenero.setEnabled(false);
                btnguardar.setEnabled(false);
                btnlimpiar.setEnabled(false);
                txtbuscardoc.setEnabled(false);
                btnbuscar.setEnabled(false);
                btnmostrartodos.setEnabled(false);
                btndescargarreportes.setEnabled(false);
                jTable1.setEnabled(false);
                break;
            case "buscar":
                txtapellidos.setEnabled(false);
                txtdocumento.setEnabled(false);
                txtedad.setEnabled(false);
                txtnombres.setEnabled(false);
                txttelefono.setEnabled(false);
                cmbgenero.setEnabled(false);
                btnguardar.setEnabled(false);
                btnlimpiar.setEnabled(false);
                txteliminardoc.setEnabled(false);
                btneliminar.setEnabled(false);
                btndescargarreportes.setEnabled(false);
                jTable1.setEnabled(false);
                break;
            case "rpt":
                txtapellidos.setEnabled(false);
                txtdocumento.setEnabled(false);
                txtedad.setEnabled(false);
                txtnombres.setEnabled(false);
                txttelefono.setEnabled(false);
                cmbgenero.setEnabled(false);
                btnguardar.setEnabled(false);
                btnlimpiar.setEnabled(false);
                txteliminardoc.setEnabled(false);
                btneliminar.setEnabled(false);
                jTable1.setEnabled(false);
                break;
            case "buscarDesdeOtroForm":
                //a diferencia del otro buscar es que este habilita la tabla                
                txteliminardoc.setEnabled(false);
                btneliminar.setEnabled(false);
                btndescargarreportes.setEnabled(false);
                break;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnlimpiar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtnombres = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btneliminar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtbuscardoc = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtdocumento = new javax.swing.JTextField();
        txteliminardoc = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        txtapellidos = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnguardar = new javax.swing.JButton();
        jButtonsalir = new javax.swing.JButton();
        btndescargarreportes = new javax.swing.JButton();
        btnbuscar = new javax.swing.JButton();
        btnmostrartodos = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        cmbgenero = new javax.swing.JComboBox<>();
        txtedad = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Propietarios");
        setResizable(false);

        btnlimpiar.setText("Limpiar");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel7.setText("Eliminar Propietario");

        jLabel8.setText("Documento:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Propietarios");

        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setText("Registrar Propietario");

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel9.setText("Buscar Propietario");

        jLabel3.setText("Documento:");

        jLabel4.setText("Nombres:");

        jLabel10.setText("Documento:");

        jLabel5.setText("Teléfono:");

        jLabel6.setText("Apellidos:");

        txtapellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtapellidosActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Documento", "Nombres", "Apellidos", "Edad", "Género", "Teléfono"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        jButtonsalir.setText("Salir");
        jButtonsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonsalirActionPerformed(evt);
            }
        });

        btndescargarreportes.setText("Descargar Reporte");
        btndescargarreportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndescargarreportesActionPerformed(evt);
            }
        });

        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        btnmostrartodos.setText("Mostrar Todos");
        btnmostrartodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmostrartodosActionPerformed(evt);
            }
        });

        jLabel11.setText("Género:");

        cmbgenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));

        jLabel12.setText("Edad:");

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Copyright © 2018 LuisVanegas, FanklinGarcés, AlejandroPérez. Reservados todos los derechos.");
        jLabel13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnbuscar)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btneliminar)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txteliminardoc))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel1)
                                                .addComponent(jLabel2)
                                                .addComponent(jLabel7)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jLabel4))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(txtdocumento)
                                                        .addComponent(txtnombres, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel6)
                                                        .addComponent(jLabel11)
                                                        .addComponent(jLabel12)
                                                        .addComponent(jLabel5))
                                                    .addGap(22, 22, 22)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(cmbgenero, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(btnlimpiar)
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                .addComponent(txtedad, javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(txttelefono, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addComponent(txtapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(btnguardar)
                                                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addComponent(jLabel9)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtbuscardoc, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnmostrartodos)
                                .addGap(117, 117, 117)
                                .addComponent(btndescargarreportes))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonsalir)))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 877, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(153, 153, 153))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButtonsalir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtdocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtnombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(cmbgenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnlimpiar)
                            .addComponent(btnguardar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txteliminardoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btneliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtbuscardoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnbuscar)
                            .addComponent(btnmostrartodos)
                            .addComponent(btndescargarreportes)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonsalirActionPerformed
        //direcciona al menu y oculta la ventana propietarios
        this.setVisible(false);
    }//GEN-LAST:event_jButtonsalirActionPerformed

    private void txtapellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtapellidosActionPerformed

    private void btndescargarreportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndescargarreportesActionPerformed
        String nombreReporte = "Reporte de Propietarios";
        //el siguiente es el header del reporte
        List<String> header = new ArrayList<String>();
        header.add("Documento");
        header.add("Nombres");
        header.add("Apellidos");
        header.add("Edad");
        header.add("Género");
        header.add("Teléfono");

        //generamos el informe de estudiantes partiendo del archivo
        HSSFWorkbook workbook = new GeneradorStyleExcel().generateExcel(jTable1, nombreReporte, header);
        //exprtamos el excel al pc
        try {
            obj = new ExportarExcel();
            obj.exportarExcel(workbook, nombreReporte);
        } catch (IOException ex) {
            Logger.getLogger(FrmPropietarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btndescargarreportesActionPerformed

    //cuanda haga doble clic en una fila de la tabla, mande los datos a otro form
    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
        if (evt.getClickCount() == 2) {
            int fila = jTable1.getSelectedRow();
            Propietario propietario = new Propietario();
            propietario.setIdentificacion(jTable1.getValueAt(fila, 0).toString());
            propietario.setNombre(jTable1.getValueAt(fila, 1).toString());
            propietario.setApellidos(jTable1.getValueAt(fila, 2).toString());
            propietario.setEdad(jTable1.getValueAt(fila, 3).toString());
            propietario.setGenero(jTable1.getValueAt(fila, 4).toString());
            propietario.setTelefono(jTable1.getValueAt(fila, 5).toString());

            FrmTaxis.propietario = propietario;
            FrmTaxis.txtpropietario.setText(propietario.getIdentificacion());
            this.setVisible(false);
        }
    }//GEN-LAST:event_jTable1MousePressed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        // TODO add your handling code here:
        if ((txtdocumento.getText().length() > 0) && txtnombres.getText().length() > 0 && (txtapellidos.getText().length() > 0) && (txtedad.getText().length() > 0) && (txttelefono.getText().length() > 0)) {
            Propietario propietario = new Propietario(txtdocumento.getText(), txtnombres.getText(), txtapellidos.getText(), txtedad.getText(), cmbgenero.getSelectedItem().toString(), txttelefono.getText());
            try {
                propietarioBsn.almacenarPropietario(propietario);
            } catch (YaExisteException ex) {
                JOptionPane.showMessageDialog(null, "Ya se encuentra almacenado", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
            }
            mostrarTodos();
            limpiarCampos();
        } else {
            JOptionPane.showMessageDialog(null, "Faltan Campos Por llenar", "Error", HEIGHT);
        }

    }//GEN-LAST:event_btnguardarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        // TODO add your handling code here:
        if (txteliminardoc.getText().length() > 0) {
            System.out.println(propietarioBsn.eliminarPropietario(txteliminardoc.getText()));
            mostrarTodos();
        } else {
            JOptionPane.showMessageDialog(null, "Faltan Campos Por llenar", "Error", HEIGHT);
        }
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        // TODO add your handling code here:
        if (txtbuscardoc.getText().length() > 0) {
            try {
                limpiartabla();
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                model.addRow(propietarioBsn.consultarPropietario(txtbuscardoc.getText()));
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Faltan Campos Por llenar", "Error", HEIGHT);
        }
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btnmostrartodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmostrartodosActionPerformed
        // TODO add your handling code here:
        mostrarTodos();
    }//GEN-LAST:event_btnmostrartodosActionPerformed

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnlimpiarActionPerformed
//METODOS ADICIONALES

    private void mostrarTodos() {
        limpiartabla();
        List<String[]> conductores = propietarioBsn.listarPropietario();
        for (int i = 0; i < conductores.size(); i++) {
            //Agregamos los datos que hemos almacenado anteriormente, a la tabla
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            String filaNueva[] = conductores.get(i);
            model.addRow(filaNueva);
        }
    }

    private void limpiarCampos() {
        txtapellidos.setText("");
        txtdocumento.setText("");
        txtedad.setText("");
        txtnombres.setText("");
        txttelefono.setText("");
    }

    //el sgt bloque de codigo es para limpiar los datos de la tabla
    public void limpiartabla() {
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setRowCount(0);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmPropietarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPropietarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPropietarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPropietarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPropietarios("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btndescargarreportes;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JButton btnmostrartodos;
    private javax.swing.JComboBox<String> cmbgenero;
    private javax.swing.JButton jButtonsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtapellidos;
    private javax.swing.JTextField txtbuscardoc;
    private javax.swing.JTextField txtdocumento;
    private javax.swing.JTextField txtedad;
    private javax.swing.JTextField txteliminardoc;
    private javax.swing.JTextField txtnombres;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
