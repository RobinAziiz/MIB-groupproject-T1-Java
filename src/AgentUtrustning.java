
import oru.inf.InfDB;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author robinaziz
 */
public class AgentUtrustning extends javax.swing.JFrame {
    private InfDB idb;

    /**
     * Creates new form agentUtrustning
     */
    public AgentUtrustning(InfDB idb) {
        initComponents();
        this.idb = idb;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegistreraUtrustning = new javax.swing.JButton();
        btnMinUtrustning = new javax.swing.JButton();
        btnLanaUtrustning = new javax.swing.JButton();
        btnTillbaka = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnRegistreraUtrustning.setBackground(new java.awt.Color(51, 51, 51));
        btnRegistreraUtrustning.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistreraUtrustning.setText("Registrera utrustning");
        btnRegistreraUtrustning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistreraUtrustningActionPerformed(evt);
            }
        });

        btnMinUtrustning.setBackground(new java.awt.Color(51, 51, 51));
        btnMinUtrustning.setForeground(new java.awt.Color(255, 255, 255));
        btnMinUtrustning.setText("Min utrustning");
        btnMinUtrustning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinUtrustningActionPerformed(evt);
            }
        });

        btnLanaUtrustning.setBackground(new java.awt.Color(51, 51, 51));
        btnLanaUtrustning.setForeground(new java.awt.Color(255, 255, 255));
        btnLanaUtrustning.setText("Låna utrustning");
        btnLanaUtrustning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLanaUtrustningActionPerformed(evt);
            }
        });

        btnTillbaka.setBackground(new java.awt.Color(51, 51, 51));
        btnTillbaka.setForeground(new java.awt.Color(255, 255, 255));
        btnTillbaka.setText("Tillbaka");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnTillbaka)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(186, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnMinUtrustning, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnLanaUtrustning, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegistreraUtrustning, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)))
                .addGap(179, 179, 179))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnTillbaka)
                .addGap(58, 58, 58)
                .addComponent(btnMinUtrustning, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRegistreraUtrustning, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLanaUtrustning, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistreraUtrustningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistreraUtrustningActionPerformed
        dispose();
        new RegistreraUtrustning(idb, true).setVisible(true);

    }//GEN-LAST:event_btnRegistreraUtrustningActionPerformed

    private void btnMinUtrustningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinUtrustningActionPerformed
        dispose();
        new MinUtrustning(idb).setVisible(true);
    }//GEN-LAST:event_btnMinUtrustningActionPerformed

    private void btnLanaUtrustningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLanaUtrustningActionPerformed
        dispose();
        new LanaUtrustning(idb, true).setVisible(true);
    }//GEN-LAST:event_btnLanaUtrustningActionPerformed

    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        dispose();
        new InloggadAgent(idb).setVisible(true);
    }//GEN-LAST:event_btnTillbakaActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLanaUtrustning;
    private javax.swing.JButton btnMinUtrustning;
    private javax.swing.JButton btnRegistreraUtrustning;
    private javax.swing.JButton btnTillbaka;
    // End of variables declaration//GEN-END:variables
}