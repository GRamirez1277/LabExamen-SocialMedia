
package labexamen1;
public class Main extends javax.swing.JFrame {
  
    public Main() {
        initComponents();
        setLocationRelativeTo(null);
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AgregarCuenta = new javax.swing.JButton();
        AgregarPost = new javax.swing.JButton();
        AgregarAmigo = new javax.swing.JButton();
        AgregarComment = new javax.swing.JButton();
        ViewProfile = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AgregarCuenta.setText("Agregar Cuenta");
        AgregarCuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AgregarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarCuentaActionPerformed(evt);
            }
        });

        AgregarPost.setText("Agregar Post");
        AgregarPost.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AgregarPost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarPostActionPerformed(evt);
            }
        });

        AgregarAmigo.setText("Agregar Amigo");
        AgregarAmigo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AgregarAmigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarAmigoActionPerformed(evt);
            }
        });

        AgregarComment.setText("Agregar Comment");
        AgregarComment.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AgregarComment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarCommentActionPerformed(evt);
            }
        });

        ViewProfile.setText("View Profile");
        ViewProfile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ViewProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewProfileActionPerformed(evt);
            }
        });

        Salir.setText("Salir");
        Salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Menu");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Salir)
                .addGap(50, 50, 50))
            .addGroup(layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(ViewProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AgregarComment, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                        .addComponent(AgregarAmigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AgregarPost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AgregarCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(168, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(AgregarCuenta)
                .addGap(18, 18, 18)
                .addComponent(AgregarPost)
                .addGap(18, 18, 18)
                .addComponent(AgregarAmigo)
                .addGap(18, 18, 18)
                .addComponent(AgregarComment)
                .addGap(18, 18, 18)
                .addComponent(ViewProfile)
                .addGap(18, 18, 18)
                .addComponent(Salir)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AgregarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarCuentaActionPerformed
       
         AgregarCuenta agregarCuenta= new AgregarCuenta();
        agregarCuenta.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AgregarCuentaActionPerformed

    private void AgregarPostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarPostActionPerformed

        AgregarPost agregarPost= new AgregarPost();
        agregarPost.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AgregarPostActionPerformed

    private void AgregarAmigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarAmigoActionPerformed
        
         AgregarAmigo agregarAmigo= new AgregarAmigo();
        agregarAmigo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AgregarAmigoActionPerformed

    private void AgregarCommentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarCommentActionPerformed
       
        AgregarComment agregarComment= new AgregarComment();
        agregarComment.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AgregarCommentActionPerformed

    private void ViewProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewProfileActionPerformed
      
         ViewProfile viewProfile= new ViewProfile();
        viewProfile.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ViewProfileActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
       
         System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarAmigo;
    private javax.swing.JButton AgregarComment;
    private javax.swing.JButton AgregarCuenta;
    private javax.swing.JButton AgregarPost;
    private javax.swing.JButton Salir;
    private javax.swing.JButton ViewProfile;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
