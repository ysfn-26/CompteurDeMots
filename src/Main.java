import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Nom du fichier à lire
        File file = new File("test.txt");

        int totalMots = 0;

        try {

            Scanner reader = new Scanner(file);

            // Lecture ligne par ligne
            while (reader.hasNextLine()) {

                String ligne = reader.nextLine();

                // Supprimer espaces inutiles
                ligne = ligne.trim();

                // Vérifier si la ligne n'est pas vide
                if (!ligne.isEmpty()) {

                    // Séparer la ligne en mots
                    String[] mots = ligne.split("\\s+");

                    // Ajouter le nombre de mots de la ligne
                    totalMots += mots.length;
                }
            }

            reader.close();

            // Affichage du résultat
            System.out.println("Nombre total de mots : " + totalMots);

        } catch (FileNotFoundException e) {

            System.out.println("Fichier introuvable !");
        }
    }
}