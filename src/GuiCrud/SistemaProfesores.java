/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GuiCrud;

import MetodosCRUD.MetodosProfesores;
import MetodosCRUD.Mensajes;
import javax.swing.JOptionPane;

/**
 *
 * @author Vanessa
 */
public class SistemaProfesores extends javax.swing.JFrame {

    /**
     * Creates new form SistemaProfesores
     */
    public SistemaProfesores() {
        initComponents();
        this.setLocationRelativeTo(null);
        MetodosProfesores y = new MetodosProfesores();
        y.MostrarDatos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo = new javax.swing.JLabel();
        Nombre = new javax.swing.JLabel();
        Apellidos = new javax.swing.JLabel();
        Area = new javax.swing.JLabel();
        NombreText = new javax.swing.JTextField();
        ApellidosText = new javax.swing.JTextField();
        AreaText = new javax.swing.JComboBox<>();
        Nuevo = new javax.swing.JButton();
        Guardar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        Actualizar = new javax.swing.JButton();
        Cerrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaProfesores = new javax.swing.JTable();
        Buscar = new javax.swing.JLabel();
        BuscarText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 204, 255));
        setUndecorated(true);

        Titulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Titulo.setText("Profesores");

        Nombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Nombre.setText("Nombre");

        Apellidos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Apellidos.setText("Apellidos");

        Area.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Area.setText("Área");

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

        AreaText.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        AreaText.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Matemáticas", "Ciencias Naturales", "Química", "Programación", "Diseño", "Inglés" }));

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

        TablaProfesores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TablaProfesores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaProfesoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaProfesores);

        Buscar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Buscar.setText("Buscar:");

        BuscarText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BuscarTextKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BuscarTextKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Nombre)
                    .addComponent(Apellidos)
                    .addComponent(Area))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(NombreText, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ApellidosText, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AreaText, 0, 575, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Nuevo)
                            .addComponent(Guardar))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Eliminar)
                            .addComponent(Actualizar))
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Cerrar)
                        .addGap(113, 113, 113))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 807, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(Buscar)
                        .addGap(18, 18, 18)
                        .addComponent(BuscarText, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(133, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(476, 476, 476)
                .addComponent(Titulo)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(Titulo)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Nombre)
                            .addComponent(NombreText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Nuevo)
                            .addComponent(Eliminar))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Apellidos)
                            .addComponent(ApellidosText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Guardar)
                            .addComponent(Actualizar))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Area)
                            .addComponent(AreaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(Cerrar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Buscar)
                    .addComponent(BuscarText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        if (NombreText.getText().equals("") || ApellidosText.getText().equals("")) {//se verifica que los campos de texto esten llenos y si no manda mensaje
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, Mensajes.Warming, Mensajes.ExitWarming2, JOptionPane.WARNING_MESSAGE);
        } else {
            MetodosProfesores y = new MetodosProfesores();
            y.InsertarDatos();
            y.Limpiar();
            y.MostrarDatos();
        }
    }//GEN-LAST:event_GuardarActionPerformed

    private void NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoActionPerformed
        MetodosProfesores y = new MetodosProfesores();
        y.Limpiar();
    }//GEN-LAST:event_NuevoActionPerformed

    private void TablaProfesoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaProfesoresMouseClicked
        int FilaSeleccionada = TablaProfesores.rowAtPoint(evt.getPoint());
        NombreText.setText(TablaProfesores.getValueAt(FilaSeleccionada, 1).toString());
        ApellidosText.setText(TablaProfesores.getValueAt(FilaSeleccionada, 2).toString());
        AreaText.setSelectedItem(TablaProfesores.getValueAt(FilaSeleccionada, 3));

    }//GEN-LAST:event_TablaProfesoresMouseClicked

    private void ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarActionPerformed
        MetodosProfesores y = new MetodosProfesores();
        y.ActualizarDatos();
        y.Limpiar();
        y.MostrarDatos();
    }//GEN-LAST:event_ActualizarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        MetodosProfesores y = new MetodosProfesores();
        y.EliminarRegistro();
        y.Limpiar();
        y.MostrarDatos();
    }//GEN-LAST:event_EliminarActionPerformed

    private void BuscarTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BuscarTextKeyReleased
        MetodosProfesores y = new MetodosProfesores();
        y.FiltrarDatos(BuscarText.getText());
    }//GEN-LAST:event_BuscarTextKeyReleased

    private void CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarActionPerformed
        MenuPrincipal o = new MenuPrincipal();
        o.setVisible(true);
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

    private void BuscarTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BuscarTextKeyTyped
        char validar = evt.getKeyChar();//rutinas para avisar al usuario que hay error en los datos
        if (Character.isDigit(validar) || (int) evt.getKeyChar() > 32 && (int) evt.getKeyChar() <= 47
                || (int) evt.getKeyChar() >= 55 && (int) evt.getKeyChar() <= 64
                || (int) evt.getKeyChar() >= 91 && (int) evt.getKeyChar() <= 96
                || (int) evt.getKeyChar() > 123 && (int) evt.getKeyChar() <= 126) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, Mensajes.TextWarming, Mensajes.Atencion, JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_BuscarTextKeyTyped

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(SistemaProfesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SistemaProfesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SistemaProfesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SistemaProfesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SistemaProfesores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualizar;
    private javax.swing.JLabel Apellidos;
    public static javax.swing.JTextField ApellidosText;
    private javax.swing.JLabel Area;
    public static javax.swing.JComboBox<String> AreaText;
    private javax.swing.JLabel Buscar;
    public static javax.swing.JTextField BuscarText;
    private javax.swing.JButton Cerrar;
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton Guardar;
    private javax.swing.JLabel Nombre;
    public static javax.swing.JTextField NombreText;
    private javax.swing.JButton Nuevo;
    public static javax.swing.JTable TablaProfesores;
    private javax.swing.JLabel Titulo;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
