
import java.util.ArrayList;
import java.util.HashMap;
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
 * @author scott
 */
public class AdminÄndraAgent extends javax.swing.JFrame {

    /**
     * Creates new form AdminÄndraAgent
     */
    public AdminÄndraAgent(InfDB idb) {
        initComponents();
        this.idb = idb;
        fyllicbAgentID();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        cbAgentID = new javax.swing.JComboBox<>();
        lblAgentID = new javax.swing.JLabel();
        lblNamn = new javax.swing.JLabel();
        txtFaltNamn = new javax.swing.JTextField();
        lvlLosenord = new javax.swing.JLabel();
        txtFaltLosen = new javax.swing.JPasswordField();
        lblTelefon = new javax.swing.JLabel();
        txtFaltTelefon = new javax.swing.JTextField();
        lblArAdmin = new javax.swing.JLabel();
        cbAdmin = new javax.swing.JComboBox<>();
        lblOmrade = new javax.swing.JLabel();
        cbOmrade = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        btnAndra = new javax.swing.JButton();
        lblRubrik = new javax.swing.JLabel();
        btnTillbaka = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/MiBlogga3.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cbAgentID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAgentIDActionPerformed(evt);
            }
        });

        lblAgentID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblAgentID.setText("Agent ID");

        lblNamn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNamn.setText("Namn:");

        txtFaltNamn.setColumns(7);

        lvlLosenord.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lvlLosenord.setText("Lösenord:");

        txtFaltLosen.setColumns(7);

        lblTelefon.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTelefon.setText("Telefon:");

        txtFaltTelefon.setColumns(7);
        txtFaltTelefon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFaltTelefonActionPerformed(evt);
            }
        });

        lblArAdmin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblArAdmin.setText("Är Admin");

        cbAdmin.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                cbAdminCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        cbAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAdminActionPerformed(evt);
            }
        });

        lblOmrade.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblOmrade.setText("Välj område:");

        cbOmrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbOmradeActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Ta bort");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnAndra.setBackground(new java.awt.Color(51, 51, 51));
        btnAndra.setForeground(new java.awt.Color(255, 255, 255));
        btnAndra.setText("Ändra");
        btnAndra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraActionPerformed(evt);
            }
        });

        lblRubrik.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblRubrik.setText("Ändra Agent information");

        btnTillbaka.setBackground(new java.awt.Color(51, 51, 51));
        btnTillbaka.setForeground(new java.awt.Color(255, 255, 255));
        btnTillbaka.setText("Tillbaka");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/MiBlogga3.png"))); // NOI18N
        jLabel3.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnTillbaka))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(241, 241, 241)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnAndra, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblTelefon)
                                            .addComponent(lblArAdmin))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(67, 67, 67)
                                                .addComponent(cbAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(64, 64, 64)
                                                .addComponent(txtFaltTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(lvlLosenord)
                                    .addComponent(lblNamn)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblAgentID)
                                        .addGap(76, 76, 76)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtFaltLosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtFaltNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbAgentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblOmrade)
                                        .addGap(45, 45, 45)
                                        .addComponent(cbOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 178, Short.MAX_VALUE)
                        .addComponent(lblRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)))
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnTillbaka)
                        .addGap(9, 9, 9)
                        .addComponent(lblRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAgentID)
                            .addComponent(cbAgentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNamn)
                            .addComponent(txtFaltNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lvlLosenord)
                    .addComponent(txtFaltLosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefon)
                    .addComponent(txtFaltTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblArAdmin)
                    .addComponent(cbAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOmrade))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAndra, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(85, 85, 85))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Denna autofyller alla boxar och textfält, vid ett val av agent-id.
    private void cbAgentIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAgentIDActionPerformed
        try {
            if (cbAdmin.getItemCount() == 0 && cbOmrade.getItemCount() == 0) {

                fyllicbOmrade();
                fyllicbArAdmin();
            }
            String agent = cbAgentID.getItemAt(cbAgentID.getSelectedIndex());
            String fraga = "SELECT * FROM agent WHERE Agent_ID= " + agent + ";";
            String fraga2 = "SELECT agent_ID FROM agent;";
            String fraga3 = "SELECT Administrator FROM Agent WHERE Agent_ID = " + agent + ";";
            String fraga4 = "SELECT benamning FROM Omrade WHERE Omrades_ID= (SELECT Omrade FROM Agent WHERE Agent_ID = " + agent + ");";

            ArrayList<String> allaAgenter = idb.fetchColumn(fraga2);

            boolean rasFound = false;
            boolean isAdmin = false;
            boolean platsFound = false;
            int rasPosition = 0;
            int adminPosition = 0;
            int omradePosition = 0;
            for (int i = 0; !isAdmin && i < cbAdmin.getItemCount(); i++) {
                String agenter = cbAdmin.getItemAt(i);
                if (agenter.equals(idb.fetchSingle(fraga3))) {
                    isAdmin = true;
                } else {
                    adminPosition++;
                }
            }
            for (int i = 0; !platsFound && i < cbOmrade.getItemCount(); i++) {
                String benamning = cbOmrade.getItemAt(i);
                if (benamning.equals(idb.fetchSingle(fraga4))) {
                    platsFound = true;
                } else {
                    omradePosition++;
                }
            }

            ArrayList<HashMap<String, String>> alienInfo = idb.fetchRows(fraga);
            for (HashMap<String, String> rad : alienInfo) {
                txtFaltNamn.setText(rad.get("Namn"));
                txtFaltLosen.setText(rad.get("Losenord"));
                cbAdmin.setSelectedIndex(adminPosition);
                txtFaltTelefon.setText(rad.get("Telefon"));
                cbOmrade.setSelectedIndex(omradePosition);

            }
        } catch (Exception ettUndantag) { //lägger även till nullpointer exception
            JOptionPane.showMessageDialog(null, "Ett fel uppstod!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage() + "      " + cbAgentID.getItemAt(cbAgentID.getSelectedIndex()) + "  " + cbOmrade.getItemAt(4));

        }
    }//GEN-LAST:event_cbAgentIDActionPerformed

    private void txtFaltTelefonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFaltTelefonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFaltTelefonActionPerformed

    private void cbAdminCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_cbAdminCaretPositionChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cbAdminCaretPositionChanged

    private void cbAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAdminActionPerformed

    }//GEN-LAST:event_cbAdminActionPerformed

    private void cbOmradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbOmradeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbOmradeActionPerformed

    // Denna knapp tar bort agenten ur registret och databasen
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        try {
            String fragaUtrustning = "DELETE FROM innehar_utrustning WHERE Agent_ID = " + cbAgentID.getItemAt(cbAgentID.getSelectedIndex()) + ";";
            String fragaOmradesChef = "DELETE FROM omradeschef WHERE Agent_ID = " + cbAgentID.getItemAt(cbAgentID.getSelectedIndex()) + ";";
            String fragaAgent = "DELETE FROM Agent WHERE Agent_ID= '" + cbAgentID.getItemAt(cbAgentID.getSelectedIndex()) + "';";
            
            idb.delete(fragaUtrustning);
            idb.delete(fragaOmradesChef);
            idb.delete(fragaAgent);
            JOptionPane.showMessageDialog(rootPane, "Agenten har tagits bort ur registret!");
            dispose();
            new AdminÄndraAgent(idb).setVisible(true);

        } catch (Exception ettUndantag) { //lägger även till nullpointer exception
            JOptionPane.showMessageDialog(null, "Ett fel uppstod!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());

        }
        
    }//GEN-LAST:event_jButton1ActionPerformed
    

    
    
    // Hämtar text som är inskriven i comboboxar och textfält och uppdaterar en agent i databasen.
    private void btnAndraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraActionPerformed
        if (Validering.isPasswordValid(txtFaltLosen) && Validering.textFaltHarVarde(txtFaltNamn) && Validering.isHeltal(txtFaltTelefon)) {
            try {
                String valtLosen = String.valueOf(txtFaltLosen.getPassword());
                String valtNamn = txtFaltNamn.getText();
                String valdTelefon = txtFaltTelefon.getText();
                String valdAdmin = cbAdmin.getItemAt(cbAdmin.getSelectedIndex());
                String valdOmrade = cbOmrade.getItemAt(cbOmrade.getSelectedIndex());
                String fragaplats = "SELECT Omrades_ID FROM omrade WHERE Benamning = '" + valdOmrade + "';";
                String valdPlatsID = idb.fetchSingle(fragaplats);
                String query = "UPDATE Agent SET Losenord = '" + valtLosen + "', Namn = '" + valtNamn + "', Telefon = '" + valdTelefon + "', Administrator = '" + valdAdmin + "', Omrade =" + valdPlatsID + " WHERE Agent_ID =" + cbAgentID.getItemAt(cbAgentID.getSelectedIndex()) + ";";
                idb.update(query);
                JOptionPane.showMessageDialog(rootPane, "Agenten har uppdaterats i registret!");
            } catch (Exception ettUndantag) {
                JOptionPane.showMessageDialog(null, "Något gick fel!");
                System.out.println("Internt felmeddelande" + ettUndantag.getMessage());

            }
        }
    }//GEN-LAST:event_btnAndraActionPerformed

    //avslutar en pågående sida och öppnar en föregående
    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        dispose();
        new InloggadAdmin(idb).setVisible(true);
    }//GEN-LAST:event_btnTillbakaActionPerformed

    // fyller i comboboxen för äradmin.
    public void fyllicbArAdmin() {
        cbAdmin.addItem("J");
        cbAdmin.addItem("N");
    }

    // fyller i comboboxen för område.
    public void fyllicbOmrade() {
        String fraga = "SELECT benamning from omrade";

        ArrayList<String> allaOmraden;

        try {

            allaOmraden = idb.fetchColumn(fraga);

            for (String namn : allaOmraden) {
                cbOmrade.addItem(namn);
            }

        } catch (InfException ettUndantag) {
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        } catch (Exception ettUndantag) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }
    }

    // fyller i comboboxen för Agent-id
    private void fyllicbAgentID() {
        try {
            String fraga = "SELECT Agent_ID from agent ORDER BY agent_ID ASC;";

            ArrayList<String> allaAgenter;

            allaAgenter = idb.fetchColumn(fraga);

            for (String namn : allaAgenter) {
                cbAgentID.addItem(namn);
            }

        } catch (Exception ettUndantag) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }
    }
    
    /**
     * @param args the command line arguments
     */

    
    private boolean confirm;
    private InfDB idb;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAndra;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JComboBox<String> cbAdmin;
    private javax.swing.JComboBox<String> cbAgentID;
    private javax.swing.JComboBox<String> cbOmrade;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblAgentID;
    private javax.swing.JLabel lblArAdmin;
    private javax.swing.JLabel lblNamn;
    private javax.swing.JLabel lblOmrade;
    private javax.swing.JLabel lblRubrik;
    private javax.swing.JLabel lblTelefon;
    private javax.swing.JLabel lvlLosenord;
    private javax.swing.JPasswordField txtFaltLosen;
    private javax.swing.JTextField txtFaltNamn;
    private javax.swing.JTextField txtFaltTelefon;
    // End of variables declaration//GEN-END:variables
}
