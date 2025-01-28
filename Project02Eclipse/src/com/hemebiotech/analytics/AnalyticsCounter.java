package com.hemebiotech.analytics;


public class AnalyticsCounter {
	
	public static void main(String args[]) throws Exception {
		ReadSymptomDataFromFile read = new ReadSymptomDataFromFile("C:\\Users\\Dorian\\Desktop\\AY oh\\Keller_Dorian_Debug_Java\\Project02Eclipse\\symptoms.txt");
		WriteSymptomDataToFile file = new WriteSymptomDataToFile();
		file.writeSymptoms(read.GetSymptoms(),read.sortSymptom());
	}
}
