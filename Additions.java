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
public class Additions {

    private boolean habitation;
    private int agePermis;
    private int contravention;

    public Additions() {

        this.habitation = false;
        this.agePermis = 0;
        this.contravention = 0;
    }

    public boolean isHabitation() {
        return habitation;
    }

    public void setHabitation(boolean habitation) {
        this.habitation = habitation;
    }

    public int getAgePermis() {
        return agePermis;
    }

    public void setAgePermis(int agePermis) {
        this.agePermis = agePermis;
    }

    public int getContravention() {
        return contravention;
    }

    public void setContravention(int contravention) {
        this.contravention = contravention;
    }
    
    
}
