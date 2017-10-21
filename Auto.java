/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

/**
 *
 * @author Antoine Mascolo
 */
public class Auto {
    private String marque;
    private String modele;
    private int annee;
    private int km;
    private String antivol;

    public Auto() {
        this.marque = ("");
        this.modele = ("");
        this.annee = 0;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }
    
    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public String getAntivol() {
        return antivol;
    }

    public void setAntivol(String antivol) {
        this.antivol = antivol;
    }    
    
}
