/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pruebajs.prueba;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author santi
 */
public class usuariocontra extends javax.swing.JFrame {
        String usuariocorrect= "vendedor";
        String contrascorrect= "1234";
        String usuario2correct="random";
        String contras2correct= "0000";
    /**
     * Creates new form usuariocontra
     */
     ArrayList<Producto> Productos1 = new ArrayList<Producto>();  
     
     
    public usuariocontra(ArrayList<Producto> Productos) {
        Productos1=Productos;
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        txtusuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtcontraseña = new javax.swing.JTextField();
        Ingresar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ingrese su Usuario");

        jLabel2.setText("Ingrese su Contraseña");

        Ingresar.setText("Ingresar");
        Ingresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IngresarMouseClicked(evt);
            }
        });
        Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 2, 24)); // NOI18N
        jLabel3.setText("¡BIENVENIDO!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Ingresar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtusuario, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(txtcontraseña))))
                .addGap(48, 48, 48))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 134, 134))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcontraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(33, 33, 33)
                .addComponent(Ingresar)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngresarMouseClicked
         String usuario1= this.txtusuario.getText();
         String contraseña=this.txtcontraseña.getText();
         Usuario admin = new Usuario(usuariocorrect, contrascorrect);
         Usuario random = new Usuario(usuario2correct, contras2correct);
         
        if ((usuariocorrect.equals(usuario1)) && (contrascorrect.equals(contraseña))) { 
            int contador = 0;
            Prueba1 sec = new Prueba1(contador , Productos1 ) ;
            sec.setVisible(true);
           this.dispose();
        } else{
             
            if ((usuario2correct.equals(usuario1)) && (contras2correct.equals(contraseña))){ 
            int contador = 1;
            Prueba1 sec = new Prueba1(contador , Productos1);
            sec.setVisible(true);
            this.dispose();
        } 
            
            else{
                txtcontraseña.setText("Contraseña Incorrecta");
              }
        }
    }//GEN-LAST:event_IngresarMouseClicked

    private void IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarActionPerformed

    }//GEN-LAST:event_IngresarActionPerformed

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
            java.util.logging.Logger.getLogger(usuariocontra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(usuariocontra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(usuariocontra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(usuariocontra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ingresar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtcontraseña;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
