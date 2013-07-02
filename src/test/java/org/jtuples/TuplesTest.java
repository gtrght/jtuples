package org.jtuples;

import org.hamcrest.Matchers;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.jtuples.Tuples.tuple;

/**
 * author: v.vlasov
 */
public class TuplesTest {

    @Test
    public void testTuple() {
        Tuple1<Integer> tuple1 = tuple(1);
        Tuple2<Integer, Integer> tuple2 = tuple(1, 2);
        Tuple3<Integer, Integer, Integer> tuple3 = tuple(1, 2, 3);

        assertThat(tuple1._1(), Matchers.equalTo(1));

        assertThat(tuple2._1(), Matchers.equalTo(1));
        assertThat(tuple2._2(), Matchers.equalTo(2));

        assertThat(tuple3._1(), Matchers.equalTo(1));
        assertThat(tuple3._2(), Matchers.equalTo(2));
        assertThat(tuple3._3(), Matchers.equalTo(3));
    }

    @Test
    public void testTupleForNulls(){
        Tuple1<Object> tuple1 = tuple(null);
        Tuple2<Integer, Object> tuple2 = tuple(1, null);

        assertThat(tuple1._1(), Matchers.nullValue());

        assertThat(tuple2._1(), Matchers.equalTo(1));
        assertThat(tuple2._2(), Matchers.nullValue());
    }

}
