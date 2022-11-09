
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class RegistreraUtrustning extends javax.swing.JFrame {
    private InfDB idb;
    /**
     * Creates new form AdminRegistreraUtrustning
     */
    public RegistreraUtrustning(InfDB idb) {
        initComponents();
        this.idb = idb;
        admin = true;
        fylliUtrustningsID();
    }
     public RegistreraUtrustning(InfDB idb, boolean b) {
         initComponents();
        this.idb = idb;
        admin = false;
        fylliUtrustningsID();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnTillbaka = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblRubrik = new javax.swing.JLabel();
        lblUtrustningsID = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        lblBenamning = new javax.swing.JLabel();
        txtFaltBenamning = new javax.swing.JTextField();
        btnRegistrera = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnTillbaka.setBackground(new java.awt.Color(51, 51, 51));
        btnTillbaka.setForeground(new java.awt.Color(255, 255, 255));
        btnTillbaka.setText("Tillbaka");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/MiBlogga3.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        lblRubrik.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblRubrik.setForeground(new java.awt.Color(51, 51, 51));
        lblRubrik.setText("Registrera utrustning");

        lblUtrustningsID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblUtrustningsID.setForeground(new java.awt.Color(51, 51, 51));
        lblUtrustningsID.setText("Utrusnings-ID");

        lblBenamning.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblBenamning.setForeground(new java.awt.Color(51, 51, 51));
        lblBenamning.setText("Benämning");

        txtFaltBenamning.setColumns(12);
        txtFaltBenamning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFaltBenamningActionPerformed(evt);
            }
        });

        btnRegistrera.setBackground(new java.awt.Color(51, 51, 51));
        btnRegistrera.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrera.setText("Registrera");
        btnRegistrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistreraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnTillbaka))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(206, 206, 206)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblUtrustningsID, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblBenamning, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFaltBenamning, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnRegistrera, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 178, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblRubrik)
                        .addGap(64, 64, 64)))
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnTillbaka)
                .addGap(30, 30, 30)
                .addComponent(lblRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblUtrustningsID, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBenamning, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFaltBenamning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(btnRegistrera, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 156, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //avslutar en pågående sida och öppnar en föregående
    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        dispose();
        if(admin){
            new AdminUtrustning(idb).setVisible(true);
        }
        else if (!admin){
            new AgentUtrustning(idb).setVisible(true);
        }
    }//GEN-LAST:event_btnTillbakaActionPerformed

    private void txtFaltBenamningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFaltBenamningActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFaltBenamningActionPerformed

    // denna registrerar utrustningen och lägger in det i databasen.
    private void btnRegistreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistreraActionPerformed
        try{
            String valdBenamning = txtFaltBenamning.getText();
            String fraga = ("INSERT INTO utrustning VALUES (" + fylliUtrustningsID() + ", '" + valdBenamning + "');");
            System.out.print(fraga);
            if(Validering.textFaltHarVarde(txtFaltBenamning)){
                idb.insert(fraga);
                JOptionPane.showMessageDialog(null, valdBenamning + "  har registrerats");
            }
        }
        catch (Exception ettUndantag) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }
    }//GEN-LAST:event_btnRegistreraActionPerformed

    // Denna settar vilket utrustningsid utrustningen kommer få, hämtar högsta värdet i databasen och plussar på 1.
    public String fylliUtrustningsID() {
        String stringUtrustningsID = "";
        try {
            String fraga = idb.fetchSingle("SELECT max(Utrustnings_ID) FROM utrustning;");
            String fraga2 = "SELECT Utrustnings_ID FROM utrustning;";
            int utrustningsID = Integer.parseInt(fraga) + 1;
            stringUtrustningsID = Integer.toString(utrustningsID);
            lblID.setText(stringUtrustningsID);
            return stringUtrustningsID;
        } catch (Exception ettUndantag) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }
        
        return stringUtrustningsID;
    }  
    private boolean admin;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrera;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblBenamning;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblRubrik;
    private javax.swing.JLabel lblUtrustningsID;
    private javax.swing.JTextField txtFaltBenamning;
    // End of variables declaration//GEN-END:variables
}