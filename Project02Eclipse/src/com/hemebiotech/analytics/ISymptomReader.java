package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

/*
 lis les symptoms a partir du fichier pour ensuite les traiter
 */
public interface ISymptomReader<string> {
	/*
	Permet la lecture du fichier txt
	retourne un hash map avec les noms des maladie et leur nombres
	 */
	Map<String, Integer> GetSymptoms ();

	/*
	Créer une liste pour permettre de la trier ensuite
	retourne la liste trié
	 */
	List<String> sortSymptom();
}
