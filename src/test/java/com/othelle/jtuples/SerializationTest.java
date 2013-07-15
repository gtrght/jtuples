package com.othelle.jtuples;

import org.hamcrest.Matchers;
import org.junit.Test;

import java.io.*;

import static com.othelle.jtuples.Tuples.tuple;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * author: v.vlasov
 */
public class SerializationTest {
    @Test
    public void testSerializeDeSerialize() throws IOException, ClassNotFoundException {
        readWriteCompare(tuple(1, 2, 3));
        readWriteCompare(tuple(1, (String) null, 3));
        readWriteCompare(tuple(null, null, 3));
        readWriteCompare(tuple(null, null, null));
        readWriteCompare(tuple("1", "2", 3));
    }

    private void readWriteCompare(Tuple3 tuple) throws IOException, ClassNotFoundException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        new ObjectOutputStream(out).writeObject(tuple);

        Object tuple1 = new ObjectInputStream(new ByteArrayInputStream(out.toByteArray())).readObject();

        assertThat(tuple, Matchers.equalTo(tuple1));
    }
}
