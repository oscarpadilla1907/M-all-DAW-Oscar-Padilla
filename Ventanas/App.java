/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

/**
 *
 * @author Oscar Padilla
 */
public class App extends javax.swing.JFrame {

    /**
     * Creates new form App
     */
    public App() {
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

        RegistrarCancion = new javax.swing.JLabel();
        EscucharMusica = new javax.swing.JLabel();
        btnGo = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        MainMenu = new javax.swing.JLabel();
        lbl_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RegistrarCancion.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        RegistrarCancion.setForeground(new java.awt.Color(255, 255, 255));
        RegistrarCancion.setText("Registrar Cancion");
        getContentPane().add(RegistrarCancion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        EscucharMusica.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        EscucharMusica.setForeground(new java.awt.Color(255, 255, 255));
        EscucharMusica.setText("Escuchar Musica");
        getContentPane().add(EscucharMusica, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 230, -1, -1));

        btnGo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnGo.setText("Go!");
        getContentPane().add(btnGo, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 280, -1, -1));

        btnCerrarSesion.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btnCerrarSesion.setText("Cerrar Sesion");
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(btnCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 470, -1, -1));

        btnExit.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btnExit.setText("Salir");
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 470, -1, -1));

        btnRegistrar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, -1));

        MainMenu.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        MainMenu.setForeground(new java.awt.Color(255, 255, 255));
        MainMenu.setText("Main Menu");
        getContentPane().add(MainMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, -1, -1));

        lbl_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/9e73482beeb9272405b1392fc9c521b6.png"))); // NOI18N
        getContentPane().add(lbl_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        RegistrarCancion ventanaRegistro = new RegistrarCancion();
        ventanaRegistro.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        Menu volver = new Menu();
        volver.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

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
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EscucharMusica;
    private javax.swing.JLabel MainMenu;
    private javax.swing.JLabel RegistrarCancion;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnGo;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel lbl_fondo;
    // End of variables declaration//GEN-END:variables
}
