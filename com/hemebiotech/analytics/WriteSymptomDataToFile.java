package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class WriteSymptomDataToFile implements ISymptomWriter {

    private String filepath;

    /*WriteSymptomDataToFile:
    * Constructor
    * @param filepath a full or partial path to a result file
    */
    public WriteSymptomDataToFile (String filepath){this.filepath = filepath;}

    /*writeSymptoms:
    * @param symptoms:Map <String,Integer> such that to each key String being a symptom,
    * is associated an Integer value being the number of occurrences, of the associated symptom.
    * Write all the symptoms following by their occurrence in the result file, one per line.
    */
    public void writeSymptoms(Map<String, Integer> symptoms){
        if(this.filepath != null){
            try{
                BufferedWriter writer = new BufferedWriter (new FileWriter(this.filepath));
                for(String key : symptoms.keySet()){
                    writer.write(key +" "+ symptoms.get(key)+"\n");
                }writer.close();
            }catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}