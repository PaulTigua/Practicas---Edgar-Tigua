/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventana;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Paul TIGUA
 */
public class RegistroAlumnos extends javax.swing.JFrame {
    ConexionMySql con=new ConexionMySql();
    Connection cn = con.conectar();
    
    public RegistroAlumnos() {
        initComponents();
        JLabel lblMensaje = new JLabel(" ");
        add(lblMensaje);
    }
    class ConexionMySql{
        Connection cn;
    
    public Connection conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/bd_inst","root","");
            System.out.println("CONECTADO"); 
        } catch (Exception e) {
             System.out.println("ERROR DE CONEXION BD"+e);
        }
        return cn;
     }
    }
   //Realizado con Palette 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        txtfecha = new com.toedter.calendar.JDateChooser();
        txtgrupo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        lblMensaje = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("NOMBRE:");

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(153, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("CÓDIGO ALUMNO:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("GRUPO:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("NOMBRE:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("FECHA:");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ventana/logo.png"))); // NOI18N

        txtcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodigoActionPerformed(evt);
            }
        });

        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });

        jButton1.setText("Nuevo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText(" Registrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Modificar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Eliminar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Buscar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Salir");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel7))
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtgrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(64, 64, 64))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(57, 57, 57)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4)
                            .addComponent(jButton3))
                        .addGap(56, 56, 56)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton5)
                            .addComponent(jButton6))
                        .addGap(73, 73, 73)))
                .addComponent(jLabel6)
                .addGap(56, 56, 56))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMensaje)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtgrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton3)
                            .addComponent(jButton5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton4)
                            .addComponent(jButton6))
                        .addGap(130, 130, 130))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodigoActionPerformed
        
    }//GEN-LAST:event_txtcodigoActionPerformed

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
    
    }//GEN-LAST:event_txtnombreActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 
    txtcodigo.setText("");
    txtnombre.setText("");
    txtgrupo.setText("");
    txtfecha.setDate(null);
    lblMensaje.setFont(new Font("Arial",Font.BOLD, 12));
    lblMensaje.setText("COMPLETADO: DATOS LIMPIADOS");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    String nombre=txtnombre.getText();
    String grupo=txtgrupo.getText();
    Date fecha=txtfecha.getDate();
    
    if(nombre.isEmpty()||grupo.isEmpty()||fecha==null){
        JOptionPane.showMessageDialog(null, "DEBES COMPLETAR TODOS LOS DATOS.");
    }else{
            try {
                SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
                String fechaformato=sdf.format(fecha);
                String consulta= "INSERT INTO alumnos (nombre, grupo, fecha)VALUES('"+nombre+"','"+grupo+"','"+fechaformato+"')";
                PreparedStatement ps= (PreparedStatement) cn.prepareStatement(consulta);
                ps.executeUpdate();
                limpiar();
                JOptionPane.showMessageDialog(this, "DATOS GUARDADOS CORRECTAMENTE: "+nombre);
            } catch(Exception e){
                JOptionPane.showMessageDialog(null, "NO SE PUDO GUARDAR USUARIO"+e);
            }
        }
    lblMensaje.setFont(new Font("Arial",Font.BOLD, 12));
    lblMensaje.setText("");
    lblMensaje.setText("SE HAN GUARDADO LOS DATOS");
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    String codigo = txtcodigo.getText();
    String nombre = txtnombre.getText();
    String grupo = txtgrupo.getText();
    Date fecha = txtfecha.getDate();

    if (codigo.isEmpty() || nombre.isEmpty() || grupo.isEmpty() || fecha == null) {
        JOptionPane.showMessageDialog(this, "DEBES COMPLETAR TODOS LOS DATOS.");
        return;
    }

    try {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        String fechaformato=sdf.format(fecha);
        String consulta = "UPDATE alumnos SET nombre=('"+nombre+"'), grupo=('"+grupo+"'), fecha=('"+fechaformato+"') WHERE codigo=('"+codigo+"')";
        PreparedStatement ps = (PreparedStatement) cn.prepareStatement(consulta);
        
        int filas = ps.executeUpdate();
        if (filas > 0) {
            JOptionPane.showMessageDialog(this, "DATOS MODIFICADOS CORRECTAMENTE.");
            limpiar();
        } else {
            JOptionPane.showMessageDialog(this, "NO SE ENCONTRÓ EL ALUMNO.");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "ERROR AL MODIFICAR: " + e);
    }
    lblMensaje.setFont(new Font("Arial",Font.BOLD, 12));
    lblMensaje.setText("");
    lblMensaje.setText("SE HAN MODIFICADO LOS DATOS");
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    String codigo = txtcodigo.getText();

    if (codigo.isEmpty()) {
        JOptionPane.showMessageDialog(this, "DEBES INGRESAR EL CÓDIGO.");
        return;
    }

        try {
            String consulta = "DELETE FROM alumnos WHERE codigo=('"+codigo+"')";
            PreparedStatement ps = (PreparedStatement) cn.prepareStatement(consulta);

            int filas = ps.executeUpdate();
            if (filas > 0) {
                JOptionPane.showMessageDialog(this, "REGISTRO ELIMINADO.");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(this, "NO SE ENCONTRÓ EL ALUMNO.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "ERROR AL ELIMINAR: " + e);
        }
    lblMensaje.setFont(new Font("Arial",Font.BOLD, 12));
    lblMensaje.setText("");
    lblMensaje.setText("SE HAN ELIMINADO LOS DATOS");
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    String codigo = txtcodigo.getText();

    if (codigo.isEmpty()) {
        JOptionPane.showMessageDialog(this, "DEBES INGRESAR EL CÓDIGO.");
        return;
    }

    try {
        String consulta = "SELECT nombre, grupo, fecha FROM alumnos WHERE codigo=('"+codigo+"')";
        PreparedStatement ps = (PreparedStatement) cn.prepareStatement(consulta);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            txtnombre.setText(rs.getString("nombre"));
            txtgrupo.setText(rs.getString("grupo"));
            txtfecha.setDate(rs.getDate("fecha"));
            JOptionPane.showMessageDialog(this, "DATOS ENCONTRADOS.");
        } else {
            JOptionPane.showMessageDialog(this, "NO SE ENCONTRÓ EL ALUMNO.");
            limpiar();
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "ERROR AL BUSCAR: " + e);
    }
    lblMensaje.setFont(new Font("Arial",Font.BOLD, 12));
    lblMensaje.setText("");
    lblMensaje.setText("SE HAN ENCONTRADO LOS DATOS");// TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
    System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroAlumnos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JTextField txtcodigo;
    private com.toedter.calendar.JDateChooser txtfecha;
    private javax.swing.JTextField txtgrupo;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
private void limpiar(){
        txtnombre.setText("");
        txtcodigo.setText("");
        txtgrupo.setText("");
        txtfecha.setDate(null);
    }
}

