/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aplikasi;

/**
 *
 * @author WINDOWS 10
 */
public class PERSEGIPANJANG extends javax.swing.JFrame {
double PANJANG,LEBAR,LUAS,KELILING;

    /**
     * Creates new form PERSEGIPANJANG
     */
    public PERSEGIPANJANG() {
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
        jPANJANG = new javax.swing.JLabel();
        jLEBAR = new javax.swing.JLabel();
        tPANJANG = new javax.swing.JTextField();
        tLEBAR = new javax.swing.JTextField();
        jHITUNG = new javax.swing.JButton();
        jRESET = new javax.swing.JButton();
        jKEMBALI = new javax.swing.JButton();
        jLUAS = new javax.swing.JLabel();
        jKELILING = new javax.swing.JLabel();
        tLUAS = new javax.swing.JTextField();
        tKELILING = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel1.setText("PERSEGIPANJANG");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPANJANG.setText("PANJANG");

        jLEBAR.setText("LEBAR");

        tPANJANG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tPANJANGActionPerformed(evt);
            }
        });

        tLEBAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tLEBARActionPerformed(evt);
            }
        });

        jHITUNG.setIcon(new javax.swing.ImageIcon("C:\\Users\\WINDOWS 10\\Downloads\\calculator.png")); // NOI18N
        jHITUNG.setText("HITUNG");
        jHITUNG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jHITUNGActionPerformed(evt);
            }
        });

        jRESET.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasi/circular.png"))); // NOI18N
        jRESET.setText("RESET");
        jRESET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRESETActionPerformed(evt);
            }
        });

        jKEMBALI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasi/return.png"))); // NOI18N
        jKEMBALI.setText("KEMBALI");
        jKEMBALI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jKEMBALIActionPerformed(evt);
            }
        });

        jLUAS.setText("LUAS");

        jKELILING.setText("KELILING");
        jKELILING.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jKELILINGAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        tLUAS.setEditable(false);
        tLUAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tLUASActionPerformed(evt);
            }
        });

        tKELILING.setEditable(false);
        tKELILING.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tKELILINGActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jHITUNG)
                                .addGap(18, 18, 18)
                                .addComponent(jRESET)
                                .addGap(18, 18, 18)
                                .addComponent(jKEMBALI))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPANJANG)
                                    .addComponent(jLEBAR))
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(tLEBAR)
                                    .addComponent(tPANJANG)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jKELILING)
                            .addComponent(jLUAS))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tLUAS, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                            .addComponent(tKELILING))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPANJANG)
                    .addComponent(tPANJANG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLEBAR)
                    .addComponent(tLEBAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jHITUNG)
                    .addComponent(jRESET)
                    .addComponent(jKEMBALI))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLUAS)
                    .addComponent(tLUAS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jKELILING)
                    .addComponent(tKELILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jHITUNGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jHITUNGActionPerformed
        PANJANG = Double.parseDouble(tPANJANG.getText());
        LEBAR = Double.parseDouble(tLEBAR.getText());
        LUAS=PANJANG*LEBAR;
        KELILING=2*(PANJANG+LEBAR);
        tLUAS.setText(String.valueOf(LUAS));
        tKELILING.setText(String.valueOf(KELILING));
    }//GEN-LAST:event_jHITUNGActionPerformed

    private void jRESETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRESETActionPerformed

        tPANJANG.setText("");
        tLEBAR.setText("");
        tLUAS.setText("");
        tKELILING.setText("");
    }//GEN-LAST:event_jRESETActionPerformed

    private void jKEMBALIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jKEMBALIActionPerformed
 
        new home().setVisible(true);
    }//GEN-LAST:event_jKEMBALIActionPerformed

    private void tLEBARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tLEBARActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tLEBARActionPerformed

    private void tPANJANGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tPANJANGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tPANJANGActionPerformed

    private void tLUASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tLUASActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tLUASActionPerformed

    private void tKELILINGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tKELILINGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tKELILINGActionPerformed

    private void jKELILINGAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jKELILINGAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jKELILINGAncestorAdded

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
            java.util.logging.Logger.getLogger(PERSEGIPANJANG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PERSEGIPANJANG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PERSEGIPANJANG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PERSEGIPANJANG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PERSEGIPANJANG().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jHITUNG;
    private javax.swing.JLabel jKELILING;
    private javax.swing.JButton jKEMBALI;
    private javax.swing.JLabel jLEBAR;
    private javax.swing.JLabel jLUAS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jPANJANG;
    private javax.swing.JButton jRESET;
    private javax.swing.JTextField tKELILING;
    private javax.swing.JTextField tLEBAR;
    private javax.swing.JTextField tLUAS;
    private javax.swing.JTextField tPANJANG;
    // End of variables declaration//GEN-END:variables
}
