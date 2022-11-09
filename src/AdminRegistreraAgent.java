
import java.util.ArrayList;
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
public class AdminRegistreraAgent extends javax.swing.JFrame {
    private InfDB idb;
    /**
     * Creates new form AdminRegistreraAgent
     */
    public AdminRegistreraAgent(InfDB idb) {
        initComponents();
        this.idb = idb;
        fylliAgentID();
        fylliDatum();
        fyllicbAdmin();
        fylliCbOmrade();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTelefon = new javax.swing.JLabel();
        txtFaltTelefon = new javax.swing.JTextField();
        txtFaltLosen = new javax.swing.JPasswordField();
        cbOmrade = new javax.swing.JComboBox<>();
        lblDatum = new javax.swing.JLabel();
        lblAgent = new javax.swing.JLabel();
        btnTillbaka = new javax.swing.JButton();
        lblPlats = new javax.swing.JLabel();
        lblShowDatum = new javax.swing.JLabel();
        cbAdmin = new javax.swing.JComboBox<>();
        lblRubrik = new javax.swing.JLabel();
        lblAlien_ID = new javax.swing.JLabel();
        lvlLosenord = new javax.swing.JLabel();
        btnRegistrera = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblShowID = new javax.swing.JLabel();
        lblNamn = new javax.swing.JLabel();
        txtFaltNamn = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTelefon.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTelefon.setText("Telefon:");

        txtFaltTelefon.setColumns(7);
        txtFaltTelefon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFaltTelefonActionPerformed(evt);
            }
        });

        txtFaltLosen.setColumns(6);

        cbOmrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbOmradeActionPerformed(evt);
            }
        });

        lblDatum.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDatum.setText("Datum:");

        lblAgent.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblAgent.setText("Admin-status");

        btnTillbaka.setBackground(new java.awt.Color(51, 51, 51));
        btnTillbaka.setForeground(new java.awt.Color(255, 255, 255));
        btnTillbaka.setText("Tillbaka");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        lblPlats.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPlats.setText("Område:");

        cbAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAdminActionPerformed(evt);
            }
        });

        lblRubrik.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblRubrik.setForeground(new java.awt.Color(51, 51, 51));
        lblRubrik.setText("Registrera Agent");

        lblAlien_ID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblAlien_ID.setText("Agent ID");

        lvlLosenord.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lvlLosenord.setText("Lösenord:");

        btnRegistrera.setBackground(new java.awt.Color(51, 51, 51));
        btnRegistrera.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrera.setText("Registrera");
        btnRegistrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistreraActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/MiBlogga3.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        lblNamn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNamn.setText("Namn:");

        txtFaltNamn.setColumns(6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnTillbaka)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 488, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addComponent(btnRegistrera, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lvlLosenord)
                                            .addComponent(lblNamn)
                                            .addComponent(lblDatum)
                                            .addComponent(lblAlien_ID))
                                        .addGap(57, 57, 57)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtFaltNamn)
                                            .addComponent(lblShowDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtFaltLosen)
                                            .addComponent(lblShowID, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblTelefon)
                                            .addComponent(lblAgent)
                                            .addComponent(lblPlats))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(16, 16, 16)
                                                .addComponent(txtFaltTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(cbOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(cbAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addGap(114, 114, 114)))))
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnTillbaka)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblAlien_ID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDatum)
                                    .addComponent(lblShowDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblShowID, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFaltNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNamn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lvlLosenord)
                            .addComponent(txtFaltLosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTelefon)
                            .addComponent(txtFaltTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAgent)
                            .addComponent(cbAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPlats)
                            .addComponent(cbOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnRegistrera, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFaltTelefonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFaltTelefonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFaltTelefonActionPerformed

    private void cbOmradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbOmradeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbOmradeActionPerformed

    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        dispose();
        new InloggadAdmin(idb).setVisible(true);
    }//GEN-LAST:event_btnTillbakaActionPerformed

    private void cbAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbAdminActionPerformed

   // här fyller man i alla värden som behövs vid en registrering av en ny agent, när man trycker på knappen registeras agenten om valideringen är godkänd.
    private void btnRegistreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistreraActionPerformed

        try {
            String valtLosen = String.valueOf(txtFaltLosen.getPassword());
            String valtNamn = txtFaltNamn.getText();
            String valtTelefon = txtFaltTelefon.getText();
            String valdStatus = cbAdmin.getItemAt(cbAdmin.getSelectedIndex());
            String valtOmrade = idb.fetchSingle("SELECT Omrades_ID FROM omrade WHERE benamning= '" + cbOmrade.getItemAt(cbOmrade.getSelectedIndex()) + "'");
            String fraga = ("INSERT INTO Agent VALUES (" + fylliAgentID() + ", '" + valtNamn + "', " + valtTelefon + ", " + "curdate()" + ", '" + valdStatus + "', '" + valtLosen + "', " + valtOmrade + ");");
            if(Validering.isPasswordValid(txtFaltLosen) && Validering.textFaltHarVarde(txtFaltNamn) && Validering.isHeltal(txtFaltTelefon)){
            idb.insert(fraga);
            JOptionPane.showMessageDialog(null, valtNamn + "  har registrerats");
            dispose();
            new AdminRegistreraAgent(idb).setVisible(true);
            }
        } catch (InfException ettUndantag) {
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
            //System.out.println("INSERT INTO Alien VALUES (" + fylliAgentID() + ", '" + valtNamn + "', " + valtTelefon + ", '" + "curdate()" + "', '" + valtLosen + "', '" + valdStatus + "', " + valtOmrade + ");");
        } catch (Exception ettUndantag) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }
    }//GEN-LAST:event_btnRegistreraActionPerformed
    
    // fyller i comboboxen för område
    public void fylliCbOmrade() {
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
    
//    // här fyller man i alla värden som behövs vid en registrering av en ny agent.
//    public void inputValues() {
//        try {
//            String valtLosen = String.valueOf(txtFaltLosen.getPassword());
//            String valtNamn = txtFaltNamn.getText();
//            String valtTelefon = txtFaltTelefon.getText();
//            String valdStatus = cbAdmin.getItemAt(cbAdmin.getSelectedIndex());
//            String valtOmrade = idb.fetchSingle("SELECT Omrades_ID FROM omrade WHERE benamning= '" + cbOmrade.getItemAt(cbOmrade.getSelectedIndex()) + "'");
//            String fraga = ("INSERT INTO Agent VALUES (" + fylliAgentID() + ", '" + valtNamn + "', " + valtTelefon + ", " + "curdate()" + ", '" + valdStatus + "', '" + valtLosen + "', " + valtOmrade + ");");
//            if(Validering.isPasswordValid(txtFaltLosen) && Validering.textFaltHarVarde(txtFaltNamn) && Validering.isHeltal(txtFaltTelefon)){
//            idb.insert(fraga);
//            JOptionPane.showMessageDialog(null, valtNamn + "  har registrerats");
//            }
//        } catch (InfException ettUndantag) {
//            JOptionPane.showMessageDialog(null, "Databasfel!");
//            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
//            //System.out.println("INSERT INTO Alien VALUES (" + fylliAgentID() + ", '" + valtNamn + "', " + valtTelefon + ", '" + "curdate()" + "', '" + valtLosen + "', '" + valdStatus + "', " + valtOmrade + ");");
//        } catch (Exception ettUndantag) {
//            JOptionPane.showMessageDialog(null, "Något gick fel!");
//            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
//        }
//    }
    
    //fyller combobox för admin
    public void fyllicbAdmin(){
        cbAdmin.addItem("N");
        cbAdmin.addItem("J");
    }
    
    //denna settar vilket agentid agenten kommer få, hämtar högsta värdet i databasen och plussar på 1.
    public String fylliAgentID() {
        String stringAgentID = "";
        try {
            String fraga = idb.fetchSingle("SELECT max(Agent_ID) FROM agent;");
            String fraga2 = "SELECT Agent_id FROM agent;";
            int agentID = Integer.parseInt(fraga) + 1;
            stringAgentID = Integer.toString(agentID);
            lblShowID.setText(stringAgentID);
            return stringAgentID;
        } catch (InfException ettUndantag) {
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        } catch (Exception ettUndantag) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }
        
        return stringAgentID;
    }
    
    // denna settar datum på dagens datum.
    public String fylliDatum() {
        String datum = "";
        try {
            String fraga = "SELECT CURDATE();";
            datum = idb.fetchSingle(fraga);
            lblShowDatum.setText(datum);
            System.out.println(datum);
        } catch (InfException ettUndantag) {
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        } catch (Exception ettUndantag) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }
        return datum;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrera;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JComboBox<String> cbAdmin;
    private javax.swing.JComboBox<String> cbOmrade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAgent;
    private javax.swing.JLabel lblAlien_ID;
    private javax.swing.JLabel lblDatum;
    private javax.swing.JLabel lblNamn;
    private javax.swing.JLabel lblPlats;
    private javax.swing.JLabel lblRubrik;
    private javax.swing.JLabel lblShowDatum;
    private javax.swing.JLabel lblShowID;
    private javax.swing.JLabel lblTelefon;
    private javax.swing.JLabel lvlLosenord;
    private javax.swing.JPasswordField txtFaltLosen;
    private javax.swing.JTextField txtFaltNamn;
    private javax.swing.JTextField txtFaltTelefon;
    // End of variables declaration//GEN-END:variables
}