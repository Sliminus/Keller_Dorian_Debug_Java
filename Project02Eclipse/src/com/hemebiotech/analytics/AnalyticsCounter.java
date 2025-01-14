package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class AnalyticsCounter {
	
	public static void main(String args[]) throws Exception {
		//C:\Users\Dorian\Desktop\AY oh\Keller_Dorian_Debug_Java\Project02Eclipse\
		ReadSymptomDataFromFile read = new ReadSymptomDataFromFile("C:\\Users\\Dorian\\Desktop\\AY oh\\Keller_Dorian_Debug_Java\\Project02Eclipse\\symptoms.txt");
		System.out.println(read.GetSymptoms());

	}
}
