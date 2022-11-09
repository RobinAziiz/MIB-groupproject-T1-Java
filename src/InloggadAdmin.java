
import oru.inf.InfDB;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Erik
 */
public class InloggadAdmin extends javax.swing.JFrame {
    private InfDB idb;
    /**
     * Creates new form InloggadAdmin
     */
    public InloggadAdmin(InfDB idb) {
        initComponents();
        this.idb = idb;
        agentID = LoginFönsterAgent.getID();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegistreraAlien = new javax.swing.JButton();
        lblRubrik = new javax.swing.JLabel();
        btnAndraLosen = new javax.swing.JButton();
        btnTillbaka = new javax.swing.JButton();
        btnAndraAlien = new javax.swing.JButton();
        btnRegistreraUtrustning = new javax.swing.JButton();
        btnOmradesChef = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnSokAlien = new javax.swing.JButton();
        btnRegistreraAgent = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnUppdateraAgent = new javax.swing.JButton();
        btnTopp3 = new javax.swing.JButton();
        btnStatistik = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnRegistreraAlien.setBackground(new java.awt.Color(51, 51, 51));
        btnRegistreraAlien.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistreraAlien.setText("Registrera alien");
        btnRegistreraAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistreraAlienActionPerformed(evt);
            }
        });

        lblRubrik.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblRubrik.setText("Välkommen");

        btnAndraLosen.setBackground(new java.awt.Color(51, 51, 51));
        btnAndraLosen.setForeground(new java.awt.Color(255, 255, 255));
        btnAndraLosen.setText("Ändra lösenord");
        btnAndraLosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraLosenActionPerformed(evt);
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

        btnAndraAlien.setBackground(new java.awt.Color(51, 51, 51));
        btnAndraAlien.setForeground(new java.awt.Color(255, 255, 255));
        btnAndraAlien.setText("Uppdatera alien");
        btnAndraAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraAlienActionPerformed(evt);
            }
        });

        btnRegistreraUtrustning.setBackground(new java.awt.Color(51, 51, 51));
        btnRegistreraUtrustning.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistreraUtrustning.setText("Utrustning");
        btnRegistreraUtrustning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistreraUtrustningActionPerformed(evt);
            }
        });

        btnOmradesChef.setBackground(new java.awt.Color(51, 51, 51));
        btnOmradesChef.setForeground(new java.awt.Color(255, 255, 255));
        btnOmradesChef.setText("Områdeschefer");
        btnOmradesChef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOmradesChefActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/MiBlogga3.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        btnSokAlien.setBackground(new java.awt.Color(51, 51, 51));
        btnSokAlien.setForeground(new java.awt.Color(255, 255, 255));
        btnSokAlien.setText("Sök alien");
        btnSokAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSokAlienActionPerformed(evt);
            }
        });

        btnRegistreraAgent.setBackground(new java.awt.Color(51, 51, 51));
        btnRegistreraAgent.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistreraAgent.setText("Registrera agent");
        btnRegistreraAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistreraAgentActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Adminbehörighet");

        btnUppdateraAgent.setBackground(new java.awt.Color(51, 51, 51));
        btnUppdateraAgent.setForeground(new java.awt.Color(255, 255, 255));
        btnUppdateraAgent.setText("Uppdatera agent");
        btnUppdateraAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUppdateraAgentActionPerformed(evt);
            }
        });

        btnTopp3.setBackground(new java.awt.Color(51, 51, 51));
        btnTopp3.setForeground(new java.awt.Color(255, 255, 255));
        btnTopp3.setText("Topplistor");
        btnTopp3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTopp3ActionPerformed(evt);
            }
        });

        btnStatistik.setBackground(new java.awt.Color(51, 51, 51));
        btnStatistik.setForeground(new java.awt.Color(255, 255, 255));
        btnStatistik.setText("Statistik");
        btnStatistik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStatistikActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(386, 386, 386)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnRegistreraUtrustning, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnOmradesChef, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnSokAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAndraLosen, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnTopp3, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRegistreraAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRegistreraAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btnStatistik, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAndraAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUppdateraAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(245, 245, 245))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnTillbaka)
                            .addGap(794, 794, 794))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(329, 329, 329)
                            .addComponent(lblRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap()))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jLabel2)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistreraAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistreraAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTopp3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUppdateraAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAndraAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnStatistik, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSokAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAndraLosen, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOmradesChef, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistreraUtrustning, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnTillbaka)
                            .addGap(37, 37, 37)
                            .addComponent(lblRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel1))
                    .addContainerGap(277, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistreraAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistreraAlienActionPerformed
        dispose();
        new RegistreraAlien(idb, true).setVisible(true);
    }//GEN-LAST:event_btnRegistreraAlienActionPerformed

    private void btnAndraLosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraLosenActionPerformed
        dispose();
        new ÄndraLösenordAgent(idb, true).setVisible(true);
    }//GEN-LAST:event_btnAndraLosenActionPerformed

    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        dispose();
        new LoginFönsterAgent(idb).setVisible(true);
    }//GEN-LAST:event_btnTillbakaActionPerformed

    private void btnAndraAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraAlienActionPerformed
        dispose();
        new ÄndraAlienInformation(idb, true).setVisible(true);
    }//GEN-LAST:event_btnAndraAlienActionPerformed

    private void btnRegistreraUtrustningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistreraUtrustningActionPerformed
        dispose();
        new AdminUtrustning(idb).setVisible(true);
    }//GEN-LAST:event_btnRegistreraUtrustningActionPerformed

    private void btnOmradesChefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOmradesChefActionPerformed
        dispose();
        new AdminOmradenOchKontor(idb).setVisible(true);
    }//GEN-LAST:event_btnOmradesChefActionPerformed

    private void btnSokAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSokAlienActionPerformed
        dispose();
        new SokAlien(idb, true).setVisible(true);
    }//GEN-LAST:event_btnSokAlienActionPerformed

    private void btnRegistreraAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistreraAgentActionPerformed
        dispose();
        new AdminRegistreraAgent(idb).setVisible(true);
                
    }//GEN-LAST:event_btnRegistreraAgentActionPerformed

    private void btnUppdateraAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUppdateraAgentActionPerformed
        dispose();
        new AdminÄndraAgent(idb).setVisible(true);
    }//GEN-LAST:event_btnUppdateraAgentActionPerformed

    private void btnTopp3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTopp3ActionPerformed
        dispose();
        new AgentTopplistor(idb,true).setVisible(true);
    }//GEN-LAST:event_btnTopp3ActionPerformed

    private void btnStatistikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStatistikActionPerformed
        dispose();
        new AdminStatistik(idb).setVisible(true);
    }//GEN-LAST:event_btnStatistikActionPerformed

    public static String getID(){
        return agentID;
    }
    private static String agentID;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAndraAlien;
    private javax.swing.JButton btnAndraLosen;
    private javax.swing.JButton btnOmradesChef;
    private javax.swing.JButton btnRegistreraAgent;
    private javax.swing.JButton btnRegistreraAlien;
    private javax.swing.JButton btnRegistreraUtrustning;
    private javax.swing.JButton btnSokAlien;
    private javax.swing.JButton btnStatistik;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JButton btnTopp3;
    private javax.swing.JButton btnUppdateraAgent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblRubrik;
    // End of variables declaration//GEN-END:variables
}