package com.othelle.jtuples;

import org.hamcrest.Matchers;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import static com.othelle.jtuples.Tuples.tuple;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * author: v.vlasov
 */
public class MapUtilsTest {

    @Test
    public void testMapPutRetrieve() {
        Map<Integer, Tuple2<String, String>> map = MapUtils.map3(createListOfTuples(10));

        assertThat(map.get(1), Matchers.equalTo(tuple("1", "value2")));

    }

    private Collection<Tuple3<Integer, String, String>> createListOfTuples(int number) {
        List<Tuple3<Integer, String, String>> result = new ArrayList<Tuple3<Integer, String, String>>(number);

        for (int i = 0; i < number; i++) {
            result.add(tuple(i, String.valueOf(i), "value" + (i + 1)));

        }
        return result;
    }

}
