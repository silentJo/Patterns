public interface Observer {
    
    int nbrMots = 0;
    int nbrLignes = 0;
    int nbrBelgique = 0;
    int nbrPalindromes = 0;

    default void analyserLigne(String ligne) {
        String[] ligneSplitee = ligne.split(" ");
        int nbrMots = ligneSplitee.length;
        int nbrLignes;
        int nbrBelgique = 0;
        int nbrPalindromes = 0;
        for(String mot : ligneSplitee) {
            nbrBelgique = (mot.equals("Belgique")) ? nbrBelgique+1 : nbrBelgique;
            StringBuilder sb = new StringBuilder(mot);
            nbrPalindromes = (mot.equals(sb.reverse().toString())) ? nbrPalindromes+1: nbrPalindromes;
        }
    }
    
}
