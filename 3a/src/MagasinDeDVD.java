public class MagasinDeDVD extends Magasin {

    @Override
    Produit createProduct(String name, int anneeDeParution) {
        return new DVD(name, anneeDeParution);
    }
}
