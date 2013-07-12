package com.othelle.jtuples;

/**
 * Base interface of all tuples. Contains general methods
 * author: v.vlasov
 */
public interface Tuple extends Iterable {
    int getArity();

    Object getElement(int index);
}
