package com.othelle.jtuples.serialize;

/**
 * author: v.vlasov
 */
public interface Converter {
    /**
     * Converts an object to a String
     *
     * @param object
     * @return
     */
    String writeValueAsString(Object object);

    /**
     * Converts an object to a byte array
     *
     * @param object
     * @return
     */
    byte[] writeValueAsBytes(Object object);


    /**
     * Reads the object from a given array of bytes
     *
     * @param data  serialized data
     * @param clazz Class to be instantiated
     * @return
     */
    <T> T readValue(byte[] data, Class<T> clazz);
}
