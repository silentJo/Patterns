public class LivreFactory implements AbstractFactory{
	public Produit createProduct(String name, int anneeDeParution) {
		return new Livre(name, anneeDeParution);
	}
}
