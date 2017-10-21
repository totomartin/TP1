/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

import java.awt.GridBagLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Antoine Mascolo
 */
public class FenetreClient {

    public FenetreClient() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        JLabel titre = new JLabel("A propos de vous");

        JLabel nom = new JLabel("Nom");
        JLabel prenom = new JLabel("Prenom");
        JLabel sexe = new JLabel("Sexe");
        JLabel noTel = new JLabel("Numero de telephone");
        JLabel adresse = new JLabel("Adresse");
        JLabel date = new JLabel("Date de naissance");
        JLabel couriel = new JLabel("Adresse Couriel");    
        
        JButton next = new JButton("Suivant");
        JButton back = new JButton("Précédant");
        
        GridBagLayout layout = new GridBagLayout();
        ImageIcon img = new ImageIcon("Barney-Poster-2.png");
        
        frame.setTitle("Soumission");
        frame.setBounds(400,200,1100,700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setIconImage(img.getImage());
        frame.setContentPane(panel);
    }
    
        
}
