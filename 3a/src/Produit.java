public class Produit {
    String name;
    int anneeDeParution;
    double prix;
    public Produit(String name, int anneeDeParution, double prix) {
        this.name = name;
        this.anneeDeParution = anneeDeParution;
        this.prix = prix;
    }

    public String getName() {
        return name;
    }

    public int getAnneeDeParution() {
        return anneeDeParution;
    }

    public double getPrix() {
        return prix;
    }


}
