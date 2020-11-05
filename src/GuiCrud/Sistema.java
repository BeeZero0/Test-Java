/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GuiCrud;

import Conexión.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import MetodosCRUD.MetodosGenerales;
import MetodosCRUD.Mensajes;

/**
 *
 * @author Vanessa
 */
public class Sistema extends javax.swing.JFrame {

    /*
    Conexion co = new Conexion();
    Connection conect = co.conexion();
     */
    public Sistema() {
        initComponents();
        this.setLocationRelativeTo(null);
        MetodosGenerales x = new MetodosGenerales() {
        };
        x.MostrarDatos();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo = new javax.swing.JLabel();
        Nombre = new javax.swing.JLabel();
        Apellidos = new javax.swing.JLabel();
        Carrera = new javax.swing.JLabel();
        Semestre = new javax.swing.JLabel();
        Status = new javax.swing.JLabel();
        NombreText = new javax.swing.JTextField();
        ApellidosText = new javax.swing.JTextField();
        CarreraText = new javax.swing.JComboBox<>();
        StatusText = new javax.swing.JComboBox<>();
        SemestreText = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaAlumnos = new javax.swing.JTable();
        Busqueda = new javax.swing.JLabel();
        BusquedaText = new javax.swing.JTextField();
        Nuevo = new javax.swing.JButton();
        Guardar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        Actualizar = new javax.swing.JButton();
        Cerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Titulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Titulo.setText("Alumnos");

        Nombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Nombre.setText("Nombre");

        Apellidos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Apellidos.setText("Apellidos");

        Carrera.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Carrera.setText("Carrera");

        Semestre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Semestre.setText("Semestre");

        Status.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Status.setText("Estatus");

        NombreText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NombreTextKeyTyped(evt);
            }
        });

        ApellidosText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ApellidosTextKeyTyped(evt);
            }
        });

        CarreraText.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CarreraText.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ciencias Computacionales", "Ingenieria Ambiental", "Ingenieria Civil", "Biología", "Química" }));

        StatusText.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Regular", "Irregular" }));

        SemestreText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SemestreTextActionPerformed(evt);
            }
        });
        SemestreText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SemestreTextKeyTyped(evt);
            }
        });

        TablaAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TablaAlumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaAlumnosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaAlumnos);

        Busqueda.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Busqueda.setText("Búsqueda:");

        BusquedaText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BusquedaTextKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BusquedaTextKeyTyped(evt);
            }
        });

        Nuevo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Nuevo.setText("Nuevo");
        Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoActionPerformed(evt);
            }
        });

        Guardar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        Eliminar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        Actualizar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Actualizar.setText("Actualizar");
        Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarActionPerformed(evt);
            }
        });

        Cerrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Cerrar.setText("Cerrar");
        Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Apellidos)
                                .addComponent(Nombre))
                            .addComponent(Carrera))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(NombreText)
                            .addComponent(ApellidosText)
                            .addComponent(CarreraText, 0, 287, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Semestre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(SemestreText))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Status)
                                .addGap(18, 18, 18)
                                .addComponent(StatusText, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(91, 91, 91))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(Busqueda)
                                .addGap(58, 58, 58)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Nuevo)
                                        .addGap(27, 27, 27)
                                        .addComponent(Guardar)
                                        .addGap(28, 28, 28)
                                        .addComponent(Eliminar)
                                        .addGap(33, 33, 33)
                                        .addComponent(Actualizar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Cerrar))
                                    .addComponent(BusquedaText, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(78, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(372, 372, 372)
                .addComponent(Titulo)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Titulo)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nombre)
                    .addComponent(Status)
                    .addComponent(NombreText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StatusText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Apellidos)
                    .addComponent(Semestre)
                    .addComponent(ApellidosText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SemestreText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Carrera)
                    .addComponent(CarreraText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nuevo)
                    .addComponent(Guardar)
                    .addComponent(Eliminar)
                    .addComponent(Actualizar)
                    .addComponent(Cerrar))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BusquedaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Busqueda))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SemestreTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SemestreTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SemestreTextActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed

        if (NombreText.getText().equals("") || ApellidosText.getText().equals("") || SemestreText.getText().equals("")) {//se verifica que los campos de texto esten llenos y si no manda mensaje
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, Mensajes.Warming, Mensajes.ExitWarming2, JOptionPane.WARNING_MESSAGE);
        } else {
            MetodosGenerales x = new MetodosGenerales() {
            };
            x.InsertarDatos();
            x.Limpiar();
            x.MostrarDatos();
        }

    }//GEN-LAST:event_GuardarActionPerformed

    private void NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoActionPerformed
        MetodosGenerales x = new MetodosGenerales() {
        };
        x.Limpiar();
    }//GEN-LAST:event_NuevoActionPerformed

    private void TablaAlumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaAlumnosMouseClicked
        int FilaSeleccionada = TablaAlumnos.rowAtPoint(evt.getPoint());
        NombreText.setText(TablaAlumnos.getValueAt(FilaSeleccionada, 1).toString());
        ApellidosText.setText(TablaAlumnos.getValueAt(FilaSeleccionada, 2).toString());
        CarreraText.setSelectedItem(TablaAlumnos.getValueAt(FilaSeleccionada, 3));
        StatusText.setSelectedItem(TablaAlumnos.getValueAt(FilaSeleccionada, 4));
        SemestreText.setText(TablaAlumnos.getValueAt(FilaSeleccionada, 5).toString());
    }//GEN-LAST:event_TablaAlumnosMouseClicked

    private void ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarActionPerformed
        MetodosGenerales x = new MetodosGenerales() {
        };
        x.ActualizarDatos();
        x.Limpiar();
        x.MostrarDatos();
    }//GEN-LAST:event_ActualizarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        MetodosGenerales x = new MetodosGenerales() {
        };
        x.EliminarRegistro();
        x.MostrarDatos();
        x.Limpiar();
    }//GEN-LAST:event_EliminarActionPerformed

    private void BusquedaTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BusquedaTextKeyReleased
        MetodosGenerales x = new MetodosGenerales() {
        };
        x.FiltrarDatos(BusquedaText.getText());
    }//GEN-LAST:event_BusquedaTextKeyReleased

    private void CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarActionPerformed
        MenuPrincipal k = new MenuPrincipal();
        k.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CerrarActionPerformed

    private void NombreTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NombreTextKeyTyped
        char validar = evt.getKeyChar();//rutinas para avisar al usuario que hay error en los datos
        if (Character.isDigit(validar) || (int) evt.getKeyChar() > 32 && (int) evt.getKeyChar() <= 47
                || (int) evt.getKeyChar() >= 55 && (int) evt.getKeyChar() <= 64
                || (int) evt.getKeyChar() >= 91 && (int) evt.getKeyChar() <= 96
                || (int) evt.getKeyChar() > 123 && (int) evt.getKeyChar() <= 126) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, Mensajes.TextWarming, Mensajes.Atencion, JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_NombreTextKeyTyped

    private void ApellidosTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ApellidosTextKeyTyped
        char validar = evt.getKeyChar();//rutinas para avisar al usuario que hay error en los datos
        if (Character.isDigit(validar) || (int) evt.getKeyChar() > 32 && (int) evt.getKeyChar() <= 47
                || (int) evt.getKeyChar() >= 55 && (int) evt.getKeyChar() <= 64
                || (int) evt.getKeyChar() >= 91 && (int) evt.getKeyChar() <= 96
                || (int) evt.getKeyChar() > 123 && (int) evt.getKeyChar() <= 126) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, Mensajes.TextWarming, Mensajes.Atencion, JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_ApellidosTextKeyTyped

    private void SemestreTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SemestreTextKeyTyped
        char validar = evt.getKeyChar();//rutinas para avisar al usuario que hay error en los datos
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, Mensajes.AdvertenciaL, Mensajes.Atencion, JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_SemestreTextKeyTyped

    private void BusquedaTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BusquedaTextKeyTyped
        char validar = evt.getKeyChar();//rutinas para avisar al usuario que hay error en los datos
        if (Character.isDigit(validar) || (int) evt.getKeyChar() > 32 && (int) evt.getKeyChar() <= 47
                || (int) evt.getKeyChar() >= 55 && (int) evt.getKeyChar() <= 64
                || (int) evt.getKeyChar() >= 91 && (int) evt.getKeyChar() <= 96
                || (int) evt.getKeyChar() > 123 && (int) evt.getKeyChar() <= 126) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, Mensajes.TextWarming, Mensajes.Atencion, JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_BusquedaTextKeyTyped

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualizar;
    private javax.swing.JLabel Apellidos;
    public static javax.swing.JTextField ApellidosText;
    private javax.swing.JLabel Busqueda;
    public static javax.swing.JTextField BusquedaText;
    private javax.swing.JLabel Carrera;
    public static javax.swing.JComboBox<String> CarreraText;
    private javax.swing.JButton Cerrar;
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton Guardar;
    private javax.swing.JLabel Nombre;
    public static javax.swing.JTextField NombreText;
    private javax.swing.JButton Nuevo;
    private javax.swing.JLabel Semestre;
    public static javax.swing.JTextField SemestreText;
    private javax.swing.JLabel Status;
    public static javax.swing.JComboBox<String> StatusText;
    public static javax.swing.JTable TablaAlumnos;
    private javax.swing.JLabel Titulo;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
