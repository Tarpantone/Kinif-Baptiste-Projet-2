package com.hemebiotech.analytics;

import java.util.Map;
public class AnalyticsCounter {
    ISymptomReader readFile;
    ISymptomWriter writtenFile;

    /*AnalyticsCounter:
     *Constructor:
     *@param r an implemented ISymptomReader and w an implemented ISymptomWriter
     */
    public AnalyticsCounter(ISymptomReader r, ISymptomWriter w) {
        this.readFile = r;
        this.writtenFile = w;
    }

    /*run:
    *@see ReadSymptomDataFromFile and WriteSymptomDataToFile
    */
    public static void run(String read, String write) {
        ISymptomReader readFile = new ReadSymptomDataFromFile(read);
        ISymptomWriter writtenFile = new WriteSymptomDataToFile(write);
        AnalyticsCounter analyticsCounter = new AnalyticsCounter(readFile, writtenFile);
        Map<String, Integer> symptoms = analyticsCounter.readFile.getSymptoms();
        analyticsCounter.writtenFile.writeSymptoms(symptoms);
    }
    public static void main(String io[]) throws Exception {

        run("symptoms.txt", "result.out");
    }
}