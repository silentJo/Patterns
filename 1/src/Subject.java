import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Subject {

    public static BufferedReader lireFichier() {
        BufferedReader lecteurAvecBuffer = null;
        try {
            lecteurAvecBuffer = new BufferedReader(new FileReader("test.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("Erreur d'ouverture");
        }
        return lecteurAvecBuffer;
    }
}
