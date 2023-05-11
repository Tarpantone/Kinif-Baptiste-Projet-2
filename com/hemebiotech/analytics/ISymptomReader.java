package com.hemebiotech.analytics;

import java.util.Map;
/*
 * Anything that will read symptom data from a source
 * The important part is, the return value from the operation, which is a map of Strings key and Integers value,
 * value that will be equal to the number of occurrences of the associated key in the source.
 *
 * The implementation does not need to order the Map.
 *
 */
public interface ISymptomReader {
    /*
     * If no data is available, return an empty Map.
     *
     * @return a map of Strings key and Integers value,
     * value that will be equal to the number of occurrences of the associated key in the source.
     */
    Map<String,Integer> getSymptoms ();
}
