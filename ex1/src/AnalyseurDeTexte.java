import java.io.BufferedReader;
import java.io.IOException;

public class AnalyseurDeTexte {
	public static void main(String[] args) throws IOException {

		BufferedReader lecteurAvecBuffer = Subject.lireFichier();

		String ligne;
		/*
			int nbrMots = Observer.ConcreteObserverA.compterMots();
			int nbrLignes = Observer.ConcreteObserverB.compterLignes();
			int nbrPalindromes = Observer.ConcreteObserverC.compterPalindromes();
			int nbrBelgique = Observer.ConcreteObserverD.compterBelgique();
		 */

		int nbrMots = 0, nbrLignes = 0, nbrPalindromes = 0, nbrBelgique = 0;

		while ((ligne = lecteurAvecBuffer.readLine()) != null) {
			nbrLignes++;
			if (ligne.contains("Belgique")) {
				nbrBelgique++;
			}
			for (String mot : ligne.trim().split(" ")) {
				nbrMots++;
				StringBuffer temp = new StringBuffer(mot);
				if (mot.equals(temp.reverse().toString())) {
					nbrPalindromes++;
				}
			}

		}
		lecteurAvecBuffer.close();
		System.out.println("Il y avait " + nbrLignes + " lignes.");
		System.out.println("Il y avait " + nbrMots + " mots.");
		System.out.println("Il y avait " + nbrPalindromes + " palindromes.");
		System.out.println("Il y avait " + nbrBelgique + " lignes contenant Belgique.");
	}
}
