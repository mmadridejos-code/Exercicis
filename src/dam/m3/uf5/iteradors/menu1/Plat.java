package dam.m3.uf5.iteradors.menu1;

public class Plat {
    private String nom;
    private double preu;
    private boolean vegetaria;
    private boolean apteCeliacs;
    private boolean baixCalories;

    public Plat(String nom, double preu, boolean vegetaria, boolean apteCeliacs, boolean baixCalories) {
        this.nom = nom;
        this.preu = preu;
        this.vegetaria = vegetaria;
        this.apteCeliacs = apteCeliacs;
        this.baixCalories = baixCalories;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPreu() {
        return preu;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }

    public boolean isVegetaria() {
        return vegetaria;
    }

    public void setVegetaria(boolean vegetaria) {
        this.vegetaria = vegetaria;
    }

    public boolean isApteCeliacs() {
        return apteCeliacs;
    }

    public void setApteCeliacs(boolean apteCeliacs) {
        this.apteCeliacs = apteCeliacs;
    }

    public boolean isBaixCalories() {
        return baixCalories;
    }

    public void setBaixCalories(boolean baixCalories) {
        this.baixCalories = baixCalories;
    }

    @Override
    public String toString() {
        return "Plat{" +
                "nom='" + nom + '\'' +
                ", preu=" + preu +
                ", vegetaria=" + vegetaria +
                ", apteCeliacs=" + apteCeliacs +
                ", baixCalories=" + baixCalories +
                '}';
    }
}
