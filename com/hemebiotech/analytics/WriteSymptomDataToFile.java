package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeMap;
import java.util.Map;

public class WriteSymptomDataToFile implements ISymptomWriter {

    private String filepath;

    public WriteSymptomDataToFile (String Filepath){this.filepath = filepath;}

    @Override
    public void writeSymptoms(Map<String, Integer> symptoms){
        BufferedWriter writer = new BufferedWriter (filepath);

        if(filepath != null){
            try{
                for(String key : symptoms.keySet()){

                }
            }catch{

            }
        }
    }


}