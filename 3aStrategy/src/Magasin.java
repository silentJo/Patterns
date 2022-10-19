import java.util.HashMap;
import java.util.Map;

public class Magasin {
    private Map<String, Produit> bac = new HashMap<String, Produit>();
    private AbstractFactory factory;

    public Magasin(AbstractFactory factory) {
        this.factory = factory;
    }

    public void ajouter(String name, int anneeDeParution) { //ajouter la factory ici si on veut faire un magasin pouvant avoir des livres ET des dvds
        Produit produit = factory.createProduct(name, anneeDeParution);
        bac.put(name, produit);
    }

    public Produit retourneProduit(String name) {
        return bac.get(name);
    }

}
