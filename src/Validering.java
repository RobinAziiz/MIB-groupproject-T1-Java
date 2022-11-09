
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Erik
 */
public class Validering {
    
    public static boolean textFaltHarVarde(JTextField textAttKolla)
    {
        boolean resultat = true;
        if (textAttKolla.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Rutan är tom");
            resultat = false;
            textAttKolla.requestFocus();
        }
        
        
        return resultat;
    }
    
    public static boolean isHeltal(JTextField textAttKolla)
    {
        boolean resultat = true;
        try {
            String inStrang = textAttKolla.getText();
            Integer.parseInt(inStrang);
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Var god ange ett heltal!");
            resultat = false;
            textAttKolla.requestFocus();
        }
        return resultat;
        }
    public static boolean isPasswordValid(JPasswordField losenAttKolla)
    {
        boolean resultat = true;
        try {
            String losenord = String.valueOf(losenAttKolla.getPassword());
            int Storlek = losenord.length();
            if(Storlek > 6){
                JOptionPane.showMessageDialog(null, "Lösenordet är för långt!");
                resultat = false;
                losenAttKolla.requestFocus();
            }
            if(Storlek <= 3){
                JOptionPane.showMessageDialog(null, "Lösenordet är för kort!");
                resultat = false;
                losenAttKolla.requestFocus();
            }
            return resultat;
                  
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Var god ange ett heltal!");
            resultat = false;
            losenAttKolla.requestFocus();
        }
        return resultat;
        }
}
