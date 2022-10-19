public class main {
    public static void main() {
        DVDFactory dvdFactory = new DVDFactory();
        Magasin magasinDeDVD = new Magasin(dvdFactory);

        magasinDeDVD.ajouter("Titre", 1919);
    }
}
