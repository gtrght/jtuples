package com.othelle.jtuples;

/**
 * Just a synonym of Tuple2
 * author: v.vlasov
 */
public class KeyValue<T1, T2> extends Product2<T1, T2> {
    public KeyValue(T1 v1, T2 v2) {
        super(v1, v2);
    }
}
