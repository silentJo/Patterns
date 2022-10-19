public class MagasinDeLivre extends Magasin{
	Produit createProduct(String name, int anneeDeParution) {
		return new Livre(name, anneeDeParution);
	}
}
