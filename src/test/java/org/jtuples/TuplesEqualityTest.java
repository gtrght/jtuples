package org.jtuples;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.not;
import static org.jtuples.Tuples.tuple;

/**
 * author: v.vlasov
 */
public class TuplesEqualityTest {
    @Test
    public void testEquality() {
        assertThat(tuple(1), equalTo(tuple(1)));
        assertThat(tuple(1, null), equalTo(tuple(1, null)));
    }

    @Test
    public void testNonEquality() {
        assertThat(tuple(1, 1), not(equalTo(tuple(1, (Integer) null))));
        assertThat(tuple((Integer) null, (Integer) null), not(equalTo((IValue2) tuple((Integer) null, (Integer) null, (Integer) null))));
    }
}
