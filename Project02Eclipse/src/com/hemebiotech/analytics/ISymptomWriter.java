package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface ISymptomWriter {
    /*
    Ecris dans le fichier result.out la liste des symptoms trié et le nombres de fois ou ils apparaissent
     */
    void writeSymptoms(Map<String, Integer> occurrences, List<String> clesTriees) throws IOException;
}
