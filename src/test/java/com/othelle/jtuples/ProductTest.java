/*
 * =============================================================================
 *
 *   Copyright (c) 2013, JTuples
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 * =============================================================================
 */
package com.othelle.jtuples;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.not;

/**
 * author: v.vlasov
 */
public class ProductTest {

    @Before
    public void setup() {
//        System.out.println(Product.primes.length);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testIterator() {
        SampleProduct3<Integer, String, String> product3 = new SampleProduct3<Integer, String, String>(12, "test", "test3");

        int index = 0;
        for (Object o : product3) {
            assertThat(o, equalTo(product3.getElement(index)));
            index++;
        }

        product3.iterator().remove();
    }


    @Test
    public void testEquals() {
        assertThat(new SampleProduct2<Integer, String>(12, "test"), equalTo(new SampleProduct2<Integer, String>(12, "test")));
        assertThat(new SampleProduct2<Integer, String>(12, "test"), not(equalTo((Product) (new SampleProduct3<Integer, String, String>(12, "test", "test3")))));
        assertThat(new SampleProduct2<Integer, String>(null, null), equalTo(new SampleProduct2<Integer, String>(null, null)));
        assertThat(new SampleProduct2<Integer, String>(null, "test"), equalTo(new SampleProduct2<Integer, String>(null, "test")));
        assertThat(new SampleProduct2<String, String>("test", null), equalTo(new SampleProduct2<String, String>("test", null)));


        //Different product class with the same arity should pass the test
        assertThat(new SampleProduct2<Integer, String>(12, "test"), equalTo((Product) new SampleProduct2_1<Integer, String>(12, "test")));
        assertThat(new SampleProduct2<Integer, String>(12, "test"), not(equalTo((Product) new SampleProduct2_1<Integer, String>(12, null))));
    }

    @Test
    public void testToString() {
        assertThat(new SampleProduct2<Integer, String>(12, "test").toString(), equalTo("(12,test)"));
        assertThat(new SampleProduct2<Integer, String>(null, "test").toString(), equalTo("(null,test)"));
    }

    @Test
    public void testHashCode() {
        assertThat(new SampleProduct3<Integer, String, Integer>(12, "test", 1).hashCode(),
                not(equalTo(new SampleProduct3<Integer, String, Integer>(1, "test", 12).hashCode())));

        assertThat(new SampleProduct3<Integer, String, Integer>(1, "test", 12).hashCode(),
                equalTo(new SampleProduct3<Integer, String, Integer>(1, "test", 12).hashCode()));
    }


    @Test
    public void testAsArray() {
        Tuple4 tuple = Tuples.tuple("1", "2", "3", "4");
        Object[] objects = tuple.toArray();

        assertThat(objects.length, Matchers.equalTo(tuple.getArity()));
        assertThat(Tuples.convert(objects), Matchers.equalTo((Tuple) tuple));

        String[] strings = tuple.toArray(String.class);

        assertThat(strings.length, Matchers.equalTo(tuple.getArity()));
        assertThat(Tuples.convert(strings), Matchers.equalTo((Tuple) tuple));
    }

    @Test
    public void asArray() {
        Tuple4 tuple = Tuples.tuple("1", "2", "3", "4");
        List objects = tuple.toList();

        assertThat(objects.size(), Matchers.equalTo(tuple.getArity()));
        assertThat(Tuples.convert(objects), Matchers.equalTo((Tuple) tuple));

        List<String> strings = tuple.toList(String.class);

        assertThat(strings.size(), Matchers.equalTo(tuple.getArity()));
        assertThat(Tuples.convert(strings), Matchers.equalTo((Tuple) tuple));
    }
}
