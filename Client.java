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
public class Client {
    private String Nom;
    private String Prenom;
    private int DateA;
    private int DateM;
    private int DateJ;
    private char sexe;
    private int tel1;
    private int tel2;
    private int tel3;
    private int noCivil;
    private String rue;
    private String ville;
    private String Couriel;
    private Auto auto;
    private Additions add;



    public Client() {
        this.Nom = ("");
        this.Prenom = ("");
        this.DateA = 0;
        this.DateM = 0;
        this.DateJ = 0;
        this.sexe = ('0');
        this.tel1 = 0;
        this.tel2 = 0;
        this.tel3 = 0;
        this.noCivil = 0;
        this.rue = ("");
        this.ville = ("");
        this.Couriel = ("");
        this.auto = new Auto();
        this.add = new Additions();
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String Prenom) {
        this.Prenom = Prenom;
    }

    public int getDateA() {
        return DateA;
    }

    public void setDateA(int DateA) {
        this.DateA = DateA;
    }

    public int getDateM() {
        return DateM;
    }

    public void setDateM(int DateM
    ) {
        this.DateM = DateM;
    }

    public int getDateJ() {
        return DateJ;
    }

    public void setDateJ(int DateJ) {
        this.DateJ = DateJ;
    }

    public char getSexe() {
        return sexe;
    }

    public void setSexe(char sexe) {
        this.sexe = sexe;
    }

    public int getTel1() {
        return tel1;
    }

    public void setTel1(int tel1) {
        this.tel1 = tel1;
    }

    public int getTel2() {
        return tel2;
    }

    public void setTel2(int tel2) {
        this.tel2 = tel2;
    }

    public int getTel3() {
        return tel3;
    }

    public void setTel3(int tel3) {
        this.tel3 = tel3;
    }

    public int getNoCivil() {
        return noCivil;
    }

    public void setNoCivil(int noCivil) {
        this.noCivil = noCivil;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getCouriel() {
        return Couriel;
    }

    public void setCouriel(String Couriel) {
        this.Couriel = Couriel;
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    public Additions getAdd() {
        return add;
    }

    public void setAdd(Additions add) {
        this.add = add;
    }
    
    
    
}
