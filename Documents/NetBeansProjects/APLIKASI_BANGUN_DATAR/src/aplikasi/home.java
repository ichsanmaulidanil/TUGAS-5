/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aplikasi;

/**
 *
 * @author WINDOWS 10
 */
public class home extends javax.swing.JFrame {

    /**
     * Creates new form home
     */
    public home() {
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

        jLabel1 = new javax.swing.JLabel();
        bPERSEGIPANJANG = new javax.swing.JButton();
        bPERSEGI = new javax.swing.JButton();
        bSEGITIGA = new javax.swing.JButton();
        bLINGKARAN = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("APLIKASI BANGUN DATAR");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jLabel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jLabel1ComponentHidden(evt);
            }
        });

        bPERSEGIPANJANG.setBackground(new java.awt.Color(0, 51, 255));
        bPERSEGIPANJANG.setForeground(new java.awt.Color(255, 255, 255));
        bPERSEGIPANJANG.setText("PERSEGI PANJANG");
        bPERSEGIPANJANG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPERSEGIPANJANGActionPerformed(evt);
            }
        });

        bPERSEGI.setBackground(new java.awt.Color(0, 51, 255));
        bPERSEGI.setForeground(new java.awt.Color(255, 255, 255));
        bPERSEGI.setText("PERSEGI");
        bPERSEGI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPERSEGIActionPerformed(evt);
            }
        });

        bSEGITIGA.setBackground(new java.awt.Color(0, 51, 255));
        bSEGITIGA.setForeground(new java.awt.Color(255, 255, 255));
        bSEGITIGA.setText("SEGITIGA");
        bSEGITIGA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSEGITIGAActionPerformed(evt);
            }
        });

        bLINGKARAN.setBackground(new java.awt.Color(0, 51, 255));
        bLINGKARAN.setForeground(new java.awt.Color(255, 255, 255));
        bLINGKARAN.setText("LINGKARAN");
        bLINGKARAN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLINGKARANActionPerformed(evt);
            }
        });

        jLabel2.setText(" Created By_San-Daniel");
        jLabel2.setAlignmentX(0.5F);
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 96, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(121, 121, 121))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bPERSEGIPANJANG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(bPERSEGI))
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(bSEGITIGA))
                            .addComponent(bLINGKARAN))))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addComponent(bPERSEGI)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bPERSEGIPANJANG)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bLINGKARAN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bSEGITIGA)
                .addGap(35, 35, 35)
                .addComponent(jLabel2)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bPERSEGIPANJANGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPERSEGIPANJANGActionPerformed
        // TODO add your handling code here:
        new PERSEGIPANJANG().setVisible(true);
    }//GEN-LAST:event_bPERSEGIPANJANGActionPerformed

    private void bPERSEGIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPERSEGIActionPerformed
        // TODO add your handling code here:
        new PERSEGI().setVisible(true);
    }//GEN-LAST:event_bPERSEGIActionPerformed

    private void bLINGKARANActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLINGKARANActionPerformed
        // TODO add your handling code here:
        new LINGKARAN().setVisible(true);
    }//GEN-LAST:event_bLINGKARANActionPerformed

    private void bSEGITIGAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSEGITIGAActionPerformed
        // TODO add your handling code here:
        new SEGITIGA().setVisible(true);
    }//GEN-LAST:event_bSEGITIGAActionPerformed

    private void jLabel1ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLabel1ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1ComponentHidden

    private void jLabel1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1AncestorAdded

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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bLINGKARAN;
    private javax.swing.JButton bPERSEGI;
    private javax.swing.JButton bPERSEGIPANJANG;
    private javax.swing.JButton bSEGITIGA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}