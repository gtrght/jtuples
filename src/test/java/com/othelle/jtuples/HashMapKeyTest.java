package com.othelle.jtuples;

import org.hamcrest.Matchers;
import org.junit.Test;

import java.util.HashMap;

import static com.othelle.jtuples.Tuples.tuple;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * author: v.vlasov
 */
public class HashMapKeyTest {
    @Test
    public void testAsHashMapKey() {
        HashMap<Tuple2, String> map = new HashMap<Tuple2, String>();

        map.put(tuple(1, 2), "res1");
        map.put(tuple(1, 2), "res2");
        assertThat(map.get(tuple(1, 2)), Matchers.equalTo("res2"));
    }

    @Test
    public void testAsHashMapKeyNullValues() {
        HashMap<Tuple2, String> map = new HashMap<Tuple2, String>();

        map.put(tuple(1, null), "res1");
        map.put(tuple(null, 2), "res2");
        map.put(tuple(null, null), "res3");

        assertThat(map.get(tuple(1, null)), Matchers.equalTo("res1"));
        assertThat(map.get(tuple(null, 2)), Matchers.equalTo("res2"));
        assertThat(map.get(tuple(null, null)), Matchers.equalTo("res3"));
    }

    @Test
    public void testRemoveByTuple() {
        HashMap<Tuple2, String> map = new HashMap<Tuple2, String>();
        map.put(tuple(null, 2), "res2");

        map.remove(tuple(null, 2));
        assertThat(map.keySet(), Matchers.hasSize(0));
    }

}
