package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class WriteSymptomDataToFile implements ISymptomWriter {
    public WriteSymptomDataToFile(){}

    @Override
    public void writeSymptoms( Map<String, Integer> occurrences, List<String> clesTriees) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Dorian\\IdeaProjects\\Keller_Dorian_Debug_Java\\Project02Eclipse\\src\\com\\hemebiotech\\analytics\\Symptoms_tri"))) {
            for (String cle : clesTriees) {
                writer.write(cle + ", " + occurrences.get(cle));
                writer.newLine(); // Ajouter un saut de ligne après chaque entrée
            }
            writer.close();
            System.out.println("Les résultats triés ont été écrits dans le fichier " + "Symptoms_tri");
        } catch (IOException e) {
            System.err.println("Erreur lors de l'écriture dans le fichier : " + e.getMessage());
        }
    }

}
