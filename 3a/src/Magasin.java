import java.util.HashMap;
import java.util.Map;


public abstract class Magasin {
    private Map<String, Produit> bac = new HashMap<String, Produit>();

    public void ajouterProduit(String name, int anneeDeParution) {
        Produit produit = createProduct(name, anneeDeParution);
        bac.put(name, produit);
    }

    public Produit retourneProduit(String name) {
        return bac.get(name);
    }

    abstract Produit createProduct(String name, int anneeDeParution);
}
