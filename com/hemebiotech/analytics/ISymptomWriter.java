package com.hemebiotech.analytics;

import java.util.Map;
/*
 * Anything that will write symptom data to a source
 * The important part is, the symptoms are listed in a map, which is a map of Strings key and Integers value,
 * value that will be equal to the number of occurrences of the associated key in the source.
 *
 * The implementation does not need to order the Map.
 */
public interface ISymptomWriter {
    /*
     * If no data is available,close the writer and exit.
     *
     * @param a map of Strings key and Integers value,
     * value that will be equal to the number of occurrences of the associated key in the source.
     */
    public void writeSymptoms(Map<String, Integer> symptoms);
}