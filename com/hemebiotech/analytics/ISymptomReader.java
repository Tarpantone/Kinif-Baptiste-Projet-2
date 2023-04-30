package com.hemebiotech.analytics;

import java.util.TreeMap;
import java.util.Map;

/**
 * Anything that will read symptom data from a source
 * The important part is, the return value from the operation, which is a list of strings,
 * that may contain many duplications
 */
public interface ISymptomReader {
    /**
     * If no data is available, return an empty Map
     *
     * @return a raw listing of all Symptoms obtained from a data source, duplicates are possible/probable
     */
    Map<String,Integer> GetSymptoms ();
}
