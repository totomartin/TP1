/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

import java.awt.GridBagLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Antoine Mascolo
 */
public class TP1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        
        
        JLabel marque = new JLabel("Marque");
        JLabel modele = new JLabel("Modele");
        JLabel annee = new JLabel("Annee");
        JLabel kilo = new JLabel("Kilometrage annuel");
        JLabel antiVol = new JLabel("Avez-vous un antivol");
        
        
        JButton next = new JButton("Suivant");
        JButton back = new JButton("Précédant");
        
        GridBagLayout layout = new GridBagLayout();
        ImageIcon img = new ImageIcon("Barney-Poster-2.png");
        
        frame.setTitle("Soumission");
        frame.setBounds(400,200,1100,700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setIconImage(img.getImage());
        frame.setContentPane(panel);
        
        
        
        
        frame.setVisible(true);
    }
    
}
