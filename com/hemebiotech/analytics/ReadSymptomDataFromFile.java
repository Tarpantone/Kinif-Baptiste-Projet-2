package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeMap;
import java.util.Map;

/**
 * Simple brute force implementation
 *
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

    private String filepath;

    /**
     *
     * @param filepath a full or partial path to file with symptom strings in it, one per line
     */
    public ReadSymptomDataFromFile (String filepath) {
        this.filepath = filepath;
    }

    @Override
    public Map (String,Integer) GetSymptoms() {
        Map<String,Integer> result = new TreeMap<String,Integer>();

        if (filepath != null) {
            try {
                BufferedReader reader = new BufferedReader (new FileReader(filepath));
                String line = reader.readLine();

                while (line != null) {
                    if(result.containsKey(Line)){
                        int count = result.get(Line);
                        result.put(Line,count+1);
                    }else{
                        result.put(Line,1);
                    }
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