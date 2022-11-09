
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Erik
 */
public class LoginFönsterAgent extends javax.swing.JFrame {

    private InfDB idb;
    private static String agentID;

    /**
     * Creates new form LoginFönster
     */
    public LoginFönsterAgent(InfDB idb) {
        initComponents();
        this.idb = idb;
    }

    public static String getID() {
        return agentID;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRubrik = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtAID = new javax.swing.JTextField();
        lblLosen = new javax.swing.JLabel();
        txtLosen = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        btnTillbaka = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblRubrik.setBackground(new java.awt.Color(0, 0, 0));
        lblRubrik.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblRubrik.setForeground(new java.awt.Color(51, 51, 51));
        lblRubrik.setText("Agent LOGIN");

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("AnvändarNamn");

        txtAID.setColumns(9);
        txtAID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAIDActionPerformed(evt);
            }
        });

        lblLosen.setBackground(new java.awt.Color(51, 51, 51));
        lblLosen.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblLosen.setText("Lösenord");

        txtLosen.setColumns(9);

        btnLogin.setBackground(new java.awt.Color(51, 51, 51));
        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Log in");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
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

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/MiBlogga3.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnTillbaka)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 255, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblLosen, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1)
                                        .addComponent(txtAID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtLosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(379, 379, 379))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnTillbaka)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)))
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtAID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblLosen)
                .addGap(18, 18, 18)
                .addComponent(txtLosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAIDActionPerformed

    // kollar så att användarnman och lösen stämmer. Har agenten admin behörighet, loggas dom in som admin. 
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        
        if(Validering.textFaltHarVarde(txtAID) && Validering.textFaltHarVarde(txtLosen)){
        try {
            String anvanderNamn = txtAID.getText();
            String losenord = String.valueOf(txtLosen.getPassword());

            String fraga = "SELECT Agent_ID FROM agent WHERE losenord = '" + losenord + "' AND namn = '" + anvanderNamn + "';";
            agentID = idb.fetchSingle(fraga);
            String fraga2 = "SELECT Administrator FROM agent WHERE agent_ID = '" + agentID + "';";
            String fraga3 = "SELECT Agent_ID FROM Agent WHERE Namn = '" + anvanderNamn + "';";
            if (agentID.equals(idb.fetchSingle(fraga3)) && idb.fetchSingle(fraga2).equals("N") ) {
                dispose();
                
                new InloggadAgent(idb).setVisible(true);
            }
            else if(agentID.equals(idb.fetchSingle(fraga3)) && idb.fetchSingle(fraga2).equals("J")){
               dispose();
               new InloggadAdmin(idb).setVisible(true);
            }
    }//GEN-LAST:event_btnLoginActionPerformed
            catch (Exception ettUndantag) {
            JOptionPane.showMessageDialog(null, "Användarnamn eller lösenord felaktigt");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }
        }
    }
    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        dispose();
        new FörstaFönster(idb).setVisible(true);
    }//GEN-LAST:event_btnTillbakaActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblLosen;
    private javax.swing.JLabel lblRubrik;
    private javax.swing.JTextField txtAID;
    private javax.swing.JPasswordField txtLosen;
    // End of variables declaration//GEN-END:variables
}
