package com.othelle.jtuples;

import java.util.List;

/**
 * Base interface of all tuples. Contains general methods
 * author: v.vlasov
 */
//@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY, property = "class")
public interface Tuple extends Iterable {
    /**
     * Returns a number of elements in a tuple
     *
     * @return
     */
    int getArity();

    /**
     * A method to access values without casting to a specific tuple
     *
     * @param index
     * @return
     */
    Object getElement(int index);

    /**
     * Creates an array of given type with values derived from tuple
     *
     * @return
     */
    Object[] toArray();

    /**
     * Creates an array of given type with values derived from tuple
     *
     * @param clazz
     * @param <T>
     * @return
     */
    <T> T[] toArray(Class<T> clazz);

    /**
     * Creates a list with tuple values
     *
     * @return
     */
    List toList();

    <T> List<T> toList(Class<T> clazz);
}
