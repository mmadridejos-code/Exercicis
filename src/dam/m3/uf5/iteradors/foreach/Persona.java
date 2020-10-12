package dam.m3.uf5.iteradors.foreach;

public class Persona {
    private String nom;
    private int edat;
    private String ciutat;

    public Persona(String nom, int edat, String ciutat) {
        this.nom = nom;
        this.edat = edat;
        this.ciutat = ciutat;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nom='" + nom + '\'' +
                ", edat=" + edat +
                ", ciutat='" + ciutat + '\'' +
                '}';
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public String getCiutat() {
        return ciutat;
    }

    public void setCiutat(String ciutat) {
        this.ciutat = ciutat;
    }


}
