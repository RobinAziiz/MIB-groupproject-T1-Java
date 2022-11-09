
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
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
public class AgentTopplistor extends javax.swing.JFrame {

    private InfDB idb;

    /**
     * Creates new form AgentTopplistor
     */
    public AgentTopplistor(InfDB idb) {
        initComponents();
        this.idb = idb;
        fylltxtAreaOrebro();
        fylltxtAreaVästerås();
        fylltxtAreaBorås();
        fylltxtAreaVilhelmina();
        admin = false;
    }
    
    public AgentTopplistor(InfDB idb,boolean b) {
        initComponents();
        this.idb = idb;
        fylltxtAreaOrebro();
        fylltxtAreaVästerås();
        fylltxtAreaBorås();
        fylltxtAreaVilhelmina();
        admin = true;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollVasteros = new javax.swing.JScrollPane();
        txtAreaVasteras = new javax.swing.JTextArea();
        scrollVilhelmia = new javax.swing.JScrollPane();
        txtAreaVilhelmina = new javax.swing.JTextArea();
        scrollOrebro = new javax.swing.JScrollPane();
        txtAreaOrebro = new javax.swing.JTextArea();
        lblTopp = new javax.swing.JLabel();
        lblTop3 = new javax.swing.JLabel();
        scrollBoras = new javax.swing.JScrollPane();
        txtAreaBoras = new javax.swing.JTextArea();
        lblFaltOrebro = new javax.swing.JLabel();
        btnTillbaka = new javax.swing.JButton();
        lblAgentVasteras = new javax.swing.JLabel();
        lblAliensVasteros = new javax.swing.JLabel();
        lblAgentVilhelmia = new javax.swing.JLabel();
        lblAliensVilhelmia = new javax.swing.JLabel();
        lblAgentBoras = new javax.swing.JLabel();
        lblAliensBoras = new javax.swing.JLabel();
        lblAgentOrebro = new javax.swing.JLabel();
        lblAliensOrebro = new javax.swing.JLabel();
        lblFaltBoras = new javax.swing.JLabel();
        lblFaltVasteras = new javax.swing.JLabel();
        lblFaltVilhelmina = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtAreaVasteras.setBackground(new java.awt.Color(51, 51, 51));
        txtAreaVasteras.setColumns(2);
        txtAreaVasteras.setForeground(new java.awt.Color(255, 255, 255));
        txtAreaVasteras.setRows(5);
        scrollVasteros.setViewportView(txtAreaVasteras);

        txtAreaVilhelmina.setBackground(new java.awt.Color(51, 51, 51));
        txtAreaVilhelmina.setColumns(2);
        txtAreaVilhelmina.setForeground(new java.awt.Color(255, 255, 255));
        txtAreaVilhelmina.setRows(5);
        scrollVilhelmia.setViewportView(txtAreaVilhelmina);

        txtAreaOrebro.setBackground(new java.awt.Color(51, 51, 51));
        txtAreaOrebro.setColumns(2);
        txtAreaOrebro.setForeground(new java.awt.Color(255, 255, 255));
        txtAreaOrebro.setRows(5);
        scrollOrebro.setViewportView(txtAreaOrebro);

        lblTopp.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblTopp.setForeground(new java.awt.Color(51, 51, 51));
        lblTopp.setText("Topplistor");

        lblTop3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTop3.setForeground(new java.awt.Color(51, 51, 51));
        lblTop3.setText("Topp 3 Agenter som ansvarar för flest aliens i respektiver område");

        txtAreaBoras.setBackground(new java.awt.Color(51, 51, 51));
        txtAreaBoras.setColumns(2);
        txtAreaBoras.setForeground(new java.awt.Color(255, 255, 255));
        txtAreaBoras.setRows(5);
        scrollBoras.setViewportView(txtAreaBoras);

        lblFaltOrebro.setText("Örebro");

        btnTillbaka.setBackground(new java.awt.Color(51, 51, 51));
        btnTillbaka.setForeground(new java.awt.Color(255, 255, 255));
        btnTillbaka.setText("Tillbaka");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        lblAgentVasteras.setText("Agent");

        lblAliensVasteros.setText("#Aliens");

        lblAgentVilhelmia.setText("Agent");

        lblAliensVilhelmia.setText("#Aliens");

        lblAgentBoras.setText("Agent");

        lblAliensBoras.setText("#Aliens");

        lblAgentOrebro.setText("Agent");

        lblAliensOrebro.setText("#Aliens");

        lblFaltBoras.setText("Borås");

        lblFaltVasteras.setText("Västerås");

        lblFaltVilhelmina.setText("Vilhelmina");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblFaltVasteras)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblAgentVasteras)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblAliensVasteros))
                                    .addComponent(scrollVasteros, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(lblFaltBoras)
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblAgentBoras)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblAliensBoras))
                                    .addComponent(scrollBoras, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(lblFaltVilhelmina)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(scrollVilhelmia, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblAgentVilhelmia)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                                        .addComponent(lblAliensVilhelmia))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblAgentOrebro)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblAliensOrebro))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addComponent(lblFaltOrebro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(scrollOrebro, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnTillbaka)
                        .addGap(120, 120, 120)
                        .addComponent(lblTopp, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(71, 71, 71))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(lblTop3)
                .addGap(63, 63, 63))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnTillbaka))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(lblTopp, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(lblTop3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAgentVasteras)
                    .addComponent(lblAliensVasteros)
                    .addComponent(lblAgentVilhelmia)
                    .addComponent(lblAliensVilhelmia))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scrollVasteros, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(scrollVilhelmia, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblFaltVasteras))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(lblFaltVilhelmina)))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAgentBoras)
                    .addComponent(lblAliensBoras)
                    .addComponent(lblAgentOrebro)
                    .addComponent(lblAliensOrebro))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scrollBoras, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(scrollOrebro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFaltBoras)
                        .addGap(94, 94, 94))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(lblFaltOrebro))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //avslutar en pågående sida och öppnar en föregående.
    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        dispose();
        if(admin){
           new InloggadAdmin(idb).setVisible(true);
        }else{
        new InloggadAgent(idb).setVisible(true);
        }
    }//GEN-LAST:event_btnTillbakaActionPerformed

    // fyller i textarea med dom agenter som ansvarar över flest aliens i ett område.
    private void fylltxtAreaOrebro() {
        try {
            String fragaOrebro = "SELECT agent.namn, COUNT(ansvarig_agent) FROM alien INNER JOIN agent  on alien.Ansvarig_Agent = Agent_ID WHERE Plats = (SELECT plats_ID from plats where benamning = 'Örebro') GROUP BY ansvarig_agent ORDER BY COUNT(ansvarig_agent) DESC LIMIT 3;";
            ArrayList<HashMap<String, String>> listaOrebro = idb.fetchRows(fragaOrebro);
            for (HashMap<String, String> agent : listaOrebro) {
                txtAreaOrebro.append(agent.get("namn") + "\t");
                txtAreaOrebro.append(agent.get("COUNT(ansvarig_agent)") + "\n");
            }
        } catch (Exception ettUndantag) { //lägger även till nullpointer exception
            JOptionPane.showMessageDialog(null, "Ett fel uppstod!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());

        }
    }

    // fyller i textarea med dom agenter som ansvarar över flest aliens i ett område.
    private void fylltxtAreaBorås() {
        try {
            String fragaBorås = "SELECT agent.namn, COUNT(ansvarig_agent) FROM alien INNER JOIN agent  on alien.Ansvarig_Agent = Agent_ID WHERE Plats = (SELECT plats_ID from plats where benamning = 'Borås') GROUP BY ansvarig_agent ORDER BY COUNT(ansvarig_agent) DESC LIMIT 3;";
            ArrayList<HashMap<String, String>> listaBorås = idb.fetchRows(fragaBorås);
            for (HashMap<String, String> agent : listaBorås) {
                txtAreaBoras.append(agent.get("namn") + "\t");
                txtAreaBoras.append(agent.get("COUNT(ansvarig_agent)") + "\n");
            }
        } catch (Exception ettUndantag) { //lägger även till nullpointer exception
            JOptionPane.showMessageDialog(null, "Ett fel uppstod!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());

        }
    }

    // fyller i textarea med dom agenter som ansvarar över flest aliens i ett område.
    private void fylltxtAreaVilhelmina() {
        try {
            String fragaVilhelmina = "SELECT agent.namn, COUNT(ansvarig_agent) FROM alien INNER JOIN agent  on alien.Ansvarig_Agent = Agent_ID WHERE Plats = (SELECT plats_ID from plats where benamning = 'Vilhelmina') GROUP BY ansvarig_agent ORDER BY COUNT(ansvarig_agent) DESC LIMIT 3;";
            ArrayList<HashMap<String, String>> listaVilhelmina = idb.fetchRows(fragaVilhelmina);
            for (HashMap<String, String> agent : listaVilhelmina) {
                txtAreaVilhelmina.append(agent.get("namn") + "\t");
                txtAreaVilhelmina.append(agent.get("COUNT(ansvarig_agent)") + "\n");
            }

        } catch (Exception ettUndantag) { //lägger även till nullpointer exception
            JOptionPane.showMessageDialog(null, "Ett fel uppstod!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());

        }
    }

    // fyller i textarea med dom agenter som ansvarar över flest aliens i ett område.
    private void fylltxtAreaVästerås() {
        try {
            String fragaVästerås = "SELECT agent.namn, COUNT(ansvarig_agent) FROM alien INNER JOIN agent  on alien.Ansvarig_Agent = Agent_ID WHERE Plats = (SELECT plats_ID from plats where benamning = 'Västerås') GROUP BY ansvarig_agent ORDER BY COUNT(ansvarig_agent) DESC LIMIT 3;";
            ArrayList<HashMap<String, String>> listaVästerås = idb.fetchRows(fragaVästerås);
            for (HashMap<String, String> agent : listaVästerås) {
                txtAreaVasteras.append(agent.get("namn") + "\t");
                txtAreaVasteras.append(agent.get("COUNT(ansvarig_agent)") + "\n");
            }

        } catch (Exception ettUndantag) { //lägger även till nullpointer exception
            JOptionPane.showMessageDialog(null, "Ett fel uppstod!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());

        }
    }
    
    private boolean admin;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JLabel lblAgentBoras;
    private javax.swing.JLabel lblAgentOrebro;
    private javax.swing.JLabel lblAgentVasteras;
    private javax.swing.JLabel lblAgentVilhelmia;
    private javax.swing.JLabel lblAliensBoras;
    private javax.swing.JLabel lblAliensOrebro;
    private javax.swing.JLabel lblAliensVasteros;
    private javax.swing.JLabel lblAliensVilhelmia;
    private javax.swing.JLabel lblFaltBoras;
    private javax.swing.JLabel lblFaltOrebro;
    private javax.swing.JLabel lblFaltVasteras;
    private javax.swing.JLabel lblFaltVilhelmina;
    private javax.swing.JLabel lblTop3;
    private javax.swing.JLabel lblTopp;
    private javax.swing.JScrollPane scrollBoras;
    private javax.swing.JScrollPane scrollOrebro;
    private javax.swing.JScrollPane scrollVasteros;
    private javax.swing.JScrollPane scrollVilhelmia;
    private javax.swing.JTextArea txtAreaBoras;
    private javax.swing.JTextArea txtAreaOrebro;
    private javax.swing.JTextArea txtAreaVasteras;
    private javax.swing.JTextArea txtAreaVilhelmina;
    // End of variables declaration//GEN-END:variables
}