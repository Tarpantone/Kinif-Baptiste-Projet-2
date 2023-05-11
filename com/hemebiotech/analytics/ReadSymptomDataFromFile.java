package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeMap;
import java.util.Map;

public class ReadSymptomDataFromFile implements ISymptomReader {

    private String filepath;

    /*ReadSymptomDataFromFile:
    * Constructor
    * @param filepath a full or partial path to file with symptom strings in it, one per line
    */
    public ReadSymptomDataFromFile (String filepath) {
        this.filepath = filepath;
    }

    /*getSymptoms:
    * @return result:Map<String,Integer> such that to each key String being a symptom,
    * is associated an Integer value being the number of occurrences, of the associated symptom,
    * in the filepath file of the ReadSymptomDataFromFile on which the method is called.
    */
    public Map <String,Integer> getSymptoms() {
        Map<String,Integer> result = new TreeMap<String,Integer>();

        if (this.filepath != null) {
            try {
                BufferedReader reader = new BufferedReader (new FileReader(this.filepath));
                String line = reader.readLine();

                while (line != null) {
                    result.putIfAbsent(line,0);
                    int count = result.get(line)+1;
                    result.replace(line,count);
                    line = reader.readLine();
                }
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return result;
    }

}