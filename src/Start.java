
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class Start {

    private static InfDB idb;

    public static void main(String[] args) {
         try {
            idb = new InfDB("mibdb", "3306", "mibdba", "mibkey");
        } catch (InfException ex) {
            Logger.getLogger(InloggadAgent.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        new FörstaFönster(idb).setVisible(true);


        /* Create and display the form */
    }
}
