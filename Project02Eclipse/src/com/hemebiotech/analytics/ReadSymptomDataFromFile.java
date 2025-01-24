package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Simple brute force implementation
 *
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

	private String filepath;
	// Utilisation d'une HashMap pour compter les occurrences
	private Map<String, Integer> occurrences = new HashMap<>();
	/**
	 * 
	 * @param filepath a full or partial path to file with symptom strings in it, one per line
	 */
	public ReadSymptomDataFromFile (String filepath) {
		this.filepath = filepath;
	}
	
	@Override
	public Map<String, Integer> GetSymptoms() {
		try (BufferedReader reader = new BufferedReader(new FileReader(filepath))) {
			String ligne;
			while ((ligne = reader.readLine()) != null) {
				ligne = ligne.trim(); // Supprimer les espaces inutiles
				if (!ligne.isEmpty()) {
					occurrences.put(ligne, occurrences.getOrDefault(ligne, 0) + 1);
				}
			}
		} catch (IOException e) {
			System.err.println("Erreur lors de la lecture du fichier : " + e.getMessage());
		}
		return occurrences;
	}

	@Override
	public List<String> sortSymptom() {
		List<String> clesTriees = new ArrayList<>(occurrences.keySet());
		Collections.sort(clesTriees);
		return clesTriees;
	}


}
