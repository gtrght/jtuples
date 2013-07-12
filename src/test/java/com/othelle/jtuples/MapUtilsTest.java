package com.othelle.jtuples;

import org.hamcrest.Matchers;
import org.junit.Test;

import java.util.*;

import static com.othelle.jtuples.Tuples.tuple;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * author: v.vlasov
 */
public class MapUtilsTest {

    @Test
    public void mapTuple2Ordered() {
        Map<Integer, String> map = MapUtils.map(Arrays.asList(tuple(25, "1"), tuple(1, "value2"), tuple(3, "value2")), true);

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            assertThat(Tuples.convert(entry), Matchers.equalTo(tuple(25, "1")));
            break;
        }

        assertThat(map.entrySet(), Matchers.hasSize(3));
        assertThat(map.get(1), Matchers.equalTo("value2"));
    }


    @Test
    public void testMapPutRetrieve() {
        Map<Integer, Tuple2<String, String>> map = MapUtils.map3(Arrays.asList(tuple(1, "1", "value1"), tuple(1, "2", "value2")));
        assertThat(map.entrySet(), Matchers.hasSize(2));
        assertThat(map.get(1), Matchers.equalTo(tuple("1", "value1")));
    }

    private Collection<Tuple3<Integer, String, String>> createListOfTuples(int number) {
        List<Tuple3<Integer, String, String>> result = new ArrayList<Tuple3<Integer, String, String>>(number);

        for (int i = 0; i < number; i++) {
            result.add(tuple(i, String.valueOf(i), "value" + (i + 1)));

        }
        return result;
    }


    @Test
    public void flattenTest() {
        Map<String, Integer> map = new LinkedHashMap<String, Integer>();
        map.put("key1", 1);
        map.put("key2", 2);

        List<Tuple2<String, Integer>> list = MapUtils.flatten(map);

        assertThat(list, Matchers.hasSize(2));
        assertThat(list.get(0), Matchers.equalTo(tuple("key1", 1)));
        assertThat(list.get(1), Matchers.equalTo(tuple("key2", 2)));


    }

}
