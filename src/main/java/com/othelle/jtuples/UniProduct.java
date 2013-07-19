package com.othelle.jtuples;

import org.codehaus.jackson.annotate.JsonProperty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * The class is designed to simplify conversion from lists and arrays and vise-versa
 * author: v.vlasov
 */
public class UniProduct<T> extends Product implements Tuple16<T, T, T, T, T, T, T, T, T, T, T, T, T, T, T, T> {
    private static final long serialVersionUID = -1187955276020306879L;

    private List<T> data;

    protected UniProduct(int arity) {
        if (arity < 1) throw new IllegalArgumentException("Unable to create a tuple with arity lower than 1");

        this.arity = arity;
        data = new ArrayList<T>(arity);
    }

    public UniProduct(T... elements) {
        this(Math.min(elements.length, 16));
        data.addAll(Arrays.asList(elements).subList(0, arity));
    }

    public UniProduct(List<T> elements) {
        this(Math.min(elements.size(), 16));
        data.addAll(elements.subList(0, arity));
    }


    @Override
    public Object getElement(int index) {
        return arity > index && index >= 0 ? data.get(index) : null;
    }

    @Override
    @SuppressWarnings("unchecked")
    @JsonProperty("_1")
    public T _1() {
        return (T) getElement(0);
    }


    @Override
    @SuppressWarnings("unchecked")
    @JsonProperty("_2")
    public T _2() {
        return (T) getElement(1);
    }


    @Override
    @SuppressWarnings("unchecked")
    @JsonProperty("_3")
    public T _3() {
        return (T) getElement(2);
    }


    @Override
    @SuppressWarnings("unchecked")
    @JsonProperty("_4")
    public T _4() {
        return (T) getElement(3);
    }


    @Override
    @SuppressWarnings("unchecked")
    @JsonProperty("_5")
    public T _5() {
        return (T) getElement(4);
    }


    @Override
    @SuppressWarnings("unchecked")
    @JsonProperty("_6")
    public T _6() {
        return (T) getElement(5);
    }


    @Override
    @SuppressWarnings("unchecked")
    @JsonProperty("_7")
    public T _7() {
        return (T) getElement(6);
    }


    @Override
    @SuppressWarnings("unchecked")
    @JsonProperty("_8")
    public T _8() {
        return (T) getElement(7);
    }


    @Override
    @SuppressWarnings("unchecked")
    @JsonProperty("_9")
    public T _9() {
        return (T) getElement(8);
    }


    @Override
    @SuppressWarnings("unchecked")
    @JsonProperty("_10")
    public T _10() {
        return (T) getElement(9);
    }


    @Override
    @SuppressWarnings("unchecked")
    @JsonProperty("_11")
    public T _11() {
        return (T) getElement(10);
    }


    @Override
    @SuppressWarnings("unchecked")
    @JsonProperty("_12")
    public T _12() {
        return (T) getElement(11);
    }


    @Override
    @SuppressWarnings("unchecked")
    @JsonProperty("_13")
    public T _13() {
        return (T) getElement(12);
    }


    @Override
    @SuppressWarnings("unchecked")
    @JsonProperty("_14")
    public T _14() {
        return (T) getElement(13);
    }


    @Override
    @SuppressWarnings("unchecked")
    @JsonProperty("_15")
    public T _15() {
        return (T) getElement(14);
    }


    @Override
    @SuppressWarnings("unchecked")
    @JsonProperty("_16")
    public T _16() {
        return (T) getElement(15);
    }
}
