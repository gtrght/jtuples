package com.othelle.jtuples;

import org.hamcrest.Matchers;
import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static com.othelle.jtuples.Tuples.tuple;
import static com.othelle.jtuples.ZipUtils.zip;

/**
 * author: v.vlasov
 */
public class ZipUtilsTest {

    @Test
    public void testCollectionsSameSize() {
        List<Tuple3<Integer, Integer, Integer>> zip = zip(asList(1, 2, 3), asList(2, 3, 1), asList(3, 1, 2));
        assertThat(zip.get(2), equalTo(tuple(3, 1, 2)));

        List<Tuple3<Object, Object, Object>> empty = zip(asList(), asList(), asList());
        assertThat(empty, Matchers.hasSize(0));
    }


    @Test
    public void testCollectionsWithNull() {
        List<Tuple2<Integer, Integer>> zip = zip(asList(1, 2, 3), asList(3, null, 2));
        assertThat(zip.get(1), equalTo(tuple(2, (Integer) null)));
    }

    @Test
    public void testCollectionDifferentSize() {
        List<Tuple3<Integer, Integer, Integer>> zip = zip(asList(1), asList(2, 2), asList(3, 3, 3));
        assertThat(zip.get(1), equalTo(tuple((Integer) null, 2, 3)));
        assertThat(zip.get(2), equalTo(tuple((Integer) null, (Integer) null, 3)));
    }


    @Test
    public void testArraysSameSize() {
        Tuple3<Integer, Integer, Integer>[] zip = zip(new Integer[]{1, 2 , 3}, new Integer[]{2, 3, 1}, new Integer[]{3, 1, 2});
        assertThat(zip[2], equalTo(tuple(3, 1, 2)));
    }
}
