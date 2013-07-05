package com.othelle.jtuples;
/*
 * =============================================================================
 *
 *   Copyright 2013, JTuples team
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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import static java.lang.Math.max;
import static com.othelle.jtuples.Tuples.tuple;

/**
 * author: v.vlasov
 */
public class ZipUtils {
    /**
     * Zips a number of collections into one list of tuples
     *
     * @return zipped list
     */
    public static <T1, T2> List<Tuple2<T1, T2>> zip(Collection<T1> col1, Collection<T2> col2) {
        int resultSize = _max(col1.size(), col2.size());
        List<Tuple2<T1, T2>> result = new ArrayList<Tuple2<T1, T2>>(resultSize);

        Iterator<T1> it1 = col1.iterator();
        Iterator<T2> it2 = col2.iterator();

        while (resultSize-- > 0) {
            result.add(tuple(next(it1), next(it2)));
        }

        return result;
    }

    /**
     * Zips a number of collections into one list of tuples
     *
     * @return zipped list
     */
    public static <T1, T2, T3> List<Tuple3<T1, T2, T3>> zip(Collection<T1> col1, Collection<T2> col2, Collection<T3> col3) {
        int resultSize = _max(col1.size(), col2.size(), col3.size());
        List<Tuple3<T1, T2, T3>> result = new ArrayList<Tuple3<T1, T2, T3>>(resultSize);

        Iterator<T1> it1 = col1.iterator();
        Iterator<T2> it2 = col2.iterator();
        Iterator<T3> it3 = col3.iterator();

        while (resultSize-- > 0) {
            result.add(tuple(next(it1), next(it2), next(it3)));
        }

        return result;
    }

    /**
     * Zips a number of collections into one list of tuples
     *
     * @return zipped list
     */
    public static <T1, T2, T3, T4> List<Tuple4<T1, T2, T3, T4>> zip(Collection<T1> col1, Collection<T2> col2, Collection<T3> col3, Collection<T4> col4) {
        int resultSize = _max(col1.size(), col2.size(), col3.size(), col4.size());
        List<Tuple4<T1, T2, T3, T4>> result = new ArrayList<Tuple4<T1, T2, T3, T4>>(resultSize);

        Iterator<T1> it1 = col1.iterator();
        Iterator<T2> it2 = col2.iterator();
        Iterator<T3> it3 = col3.iterator();
        Iterator<T4> it4 = col4.iterator();

        while (resultSize-- > 0) {
            result.add(tuple(next(it1), next(it2), next(it3), next(it4)));
        }

        return result;
    }

    /**
     * Zips a number of collections into one list of tuples
     *
     * @return zipped list
     */
    public static <T1, T2, T3, T4, T5> List<Tuple5<T1, T2, T3, T4, T5>> zip(Collection<T1> col1, Collection<T2> col2, Collection<T3> col3, Collection<T4> col4, Collection<T5> col5) {
        int resultSize = _max(col1.size(), col2.size(), col3.size(), col4.size(), col5.size());
        List<Tuple5<T1, T2, T3, T4, T5>> result = new ArrayList<Tuple5<T1, T2, T3, T4, T5>>(resultSize);

        Iterator<T1> it1 = col1.iterator();
        Iterator<T2> it2 = col2.iterator();
        Iterator<T3> it3 = col3.iterator();
        Iterator<T4> it4 = col4.iterator();
        Iterator<T5> it5 = col5.iterator();

        while (resultSize-- > 0) {
            result.add(tuple(next(it1), next(it2), next(it3), next(it4), next(it5)));
        }

        return result;
    }

    /**
     * Zips a number of collections into one list of tuples
     *
     * @return zipped list
     */
    public static <T1, T2, T3, T4, T5, T6> List<Tuple6<T1, T2, T3, T4, T5, T6>> zip(Collection<T1> col1, Collection<T2> col2, Collection<T3> col3, Collection<T4> col4, Collection<T5> col5, Collection<T6> col6) {
        int resultSize = _max(col1.size(), col2.size(), col3.size(), col4.size(), col5.size(), col6.size());
        List<Tuple6<T1, T2, T3, T4, T5, T6>> result = new ArrayList<Tuple6<T1, T2, T3, T4, T5, T6>>(resultSize);

        Iterator<T1> it1 = col1.iterator();
        Iterator<T2> it2 = col2.iterator();
        Iterator<T3> it3 = col3.iterator();
        Iterator<T4> it4 = col4.iterator();
        Iterator<T5> it5 = col5.iterator();
        Iterator<T6> it6 = col6.iterator();

        while (resultSize-- > 0) {
            result.add(tuple(next(it1), next(it2), next(it3), next(it4), next(it5), next(it6)));
        }

        return result;
    }

    /**
     * Zips a number of collections into one list of tuples
     *
     * @return zipped list
     */
    public static <T1, T2, T3, T4, T5, T6, T7> List<Tuple7<T1, T2, T3, T4, T5, T6, T7>> zip(Collection<T1> col1, Collection<T2> col2, Collection<T3> col3, Collection<T4> col4, Collection<T5> col5, Collection<T6> col6, Collection<T7> col7) {
        int resultSize = _max(col1.size(), col2.size(), col3.size(), col4.size(), col5.size(), col6.size(), col7.size());
        List<Tuple7<T1, T2, T3, T4, T5, T6, T7>> result = new ArrayList<Tuple7<T1, T2, T3, T4, T5, T6, T7>>(resultSize);

        Iterator<T1> it1 = col1.iterator();
        Iterator<T2> it2 = col2.iterator();
        Iterator<T3> it3 = col3.iterator();
        Iterator<T4> it4 = col4.iterator();
        Iterator<T5> it5 = col5.iterator();
        Iterator<T6> it6 = col6.iterator();
        Iterator<T7> it7 = col7.iterator();

        while (resultSize-- > 0) {
            result.add(tuple(next(it1), next(it2), next(it3), next(it4), next(it5), next(it6), next(it7)));
        }

        return result;
    }

    /**
     * Zips a number of collections into one list of tuples
     *
     * @return zipped list
     */
    public static <T1, T2, T3, T4, T5, T6, T7, T8> List<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> zip(Collection<T1> col1, Collection<T2> col2, Collection<T3> col3, Collection<T4> col4, Collection<T5> col5, Collection<T6> col6, Collection<T7> col7, Collection<T8> col8) {
        int resultSize = _max(col1.size(), col2.size(), col3.size(), col4.size(), col5.size(), col6.size(), col7.size(), col8.size());
        List<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>> result = new ArrayList<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>>(resultSize);

        Iterator<T1> it1 = col1.iterator();
        Iterator<T2> it2 = col2.iterator();
        Iterator<T3> it3 = col3.iterator();
        Iterator<T4> it4 = col4.iterator();
        Iterator<T5> it5 = col5.iterator();
        Iterator<T6> it6 = col6.iterator();
        Iterator<T7> it7 = col7.iterator();
        Iterator<T8> it8 = col8.iterator();

        while (resultSize-- > 0) {
            result.add(tuple(next(it1), next(it2), next(it3), next(it4), next(it5), next(it6), next(it7), next(it8)));
        }

        return result;
    }

    /**
     * Zips a number of collections into one list of tuples
     *
     * @return zipped list
     */
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9> List<Tuple9<T1, T2, T3, T4, T5, T6, T7, T8, T9>> zip(Collection<T1> col1, Collection<T2> col2, Collection<T3> col3, Collection<T4> col4, Collection<T5> col5, Collection<T6> col6, Collection<T7> col7, Collection<T8> col8, Collection<T9> col9) {
        int resultSize = _max(col1.size(), col2.size(), col3.size(), col4.size(), col5.size(), col6.size(), col7.size(), col8.size(), col9.size());
        List<Tuple9<T1, T2, T3, T4, T5, T6, T7, T8, T9>> result = new ArrayList<Tuple9<T1, T2, T3, T4, T5, T6, T7, T8, T9>>(resultSize);

        Iterator<T1> it1 = col1.iterator();
        Iterator<T2> it2 = col2.iterator();
        Iterator<T3> it3 = col3.iterator();
        Iterator<T4> it4 = col4.iterator();
        Iterator<T5> it5 = col5.iterator();
        Iterator<T6> it6 = col6.iterator();
        Iterator<T7> it7 = col7.iterator();
        Iterator<T8> it8 = col8.iterator();
        Iterator<T9> it9 = col9.iterator();

        while (resultSize-- > 0) {
            result.add(tuple(next(it1), next(it2), next(it3), next(it4), next(it5), next(it6), next(it7), next(it8), next(it9)));
        }

        return result;
    }

    /**
     * Zips a number of collections into one list of tuples
     *
     * @return zipped list
     */
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> List<Tuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>> zip(Collection<T1> col1, Collection<T2> col2, Collection<T3> col3, Collection<T4> col4, Collection<T5> col5, Collection<T6> col6, Collection<T7> col7, Collection<T8> col8, Collection<T9> col9, Collection<T10> col10) {
        int resultSize = _max(col1.size(), col2.size(), col3.size(), col4.size(), col5.size(), col6.size(), col7.size(), col8.size(), col9.size(), col10.size());
        List<Tuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>> result = new ArrayList<Tuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>>(resultSize);

        Iterator<T1> it1 = col1.iterator();
        Iterator<T2> it2 = col2.iterator();
        Iterator<T3> it3 = col3.iterator();
        Iterator<T4> it4 = col4.iterator();
        Iterator<T5> it5 = col5.iterator();
        Iterator<T6> it6 = col6.iterator();
        Iterator<T7> it7 = col7.iterator();
        Iterator<T8> it8 = col8.iterator();
        Iterator<T9> it9 = col9.iterator();
        Iterator<T10> it10 = col10.iterator();

        while (resultSize-- > 0) {
            result.add(tuple(next(it1), next(it2), next(it3), next(it4), next(it5), next(it6), next(it7), next(it8), next(it9), next(it10)));
        }

        return result;
    }

    /**
     * Zips a number of collections into one list of tuples
     *
     * @return zipped list
     */
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> List<Tuple11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11>> zip(Collection<T1> col1, Collection<T2> col2, Collection<T3> col3, Collection<T4> col4, Collection<T5> col5, Collection<T6> col6, Collection<T7> col7, Collection<T8> col8, Collection<T9> col9, Collection<T10> col10, Collection<T11> col11) {
        int resultSize = _max(col1.size(), col2.size(), col3.size(), col4.size(), col5.size(), col6.size(), col7.size(), col8.size(), col9.size(), col10.size(), col11.size());
        List<Tuple11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11>> result = new ArrayList<Tuple11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11>>(resultSize);

        Iterator<T1> it1 = col1.iterator();
        Iterator<T2> it2 = col2.iterator();
        Iterator<T3> it3 = col3.iterator();
        Iterator<T4> it4 = col4.iterator();
        Iterator<T5> it5 = col5.iterator();
        Iterator<T6> it6 = col6.iterator();
        Iterator<T7> it7 = col7.iterator();
        Iterator<T8> it8 = col8.iterator();
        Iterator<T9> it9 = col9.iterator();
        Iterator<T10> it10 = col10.iterator();
        Iterator<T11> it11 = col11.iterator();

        while (resultSize-- > 0) {
            result.add(tuple(next(it1), next(it2), next(it3), next(it4), next(it5), next(it6), next(it7), next(it8), next(it9), next(it10), next(it11)));
        }

        return result;
    }

    /**
     * Zips a number of collections into one list of tuples
     *
     * @return zipped list
     */
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> List<Tuple12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12>> zip(Collection<T1> col1, Collection<T2> col2, Collection<T3> col3, Collection<T4> col4, Collection<T5> col5, Collection<T6> col6, Collection<T7> col7, Collection<T8> col8, Collection<T9> col9, Collection<T10> col10, Collection<T11> col11, Collection<T12> col12) {
        int resultSize = _max(col1.size(), col2.size(), col3.size(), col4.size(), col5.size(), col6.size(), col7.size(), col8.size(), col9.size(), col10.size(), col11.size(), col12.size());
        List<Tuple12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12>> result = new ArrayList<Tuple12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12>>(resultSize);

        Iterator<T1> it1 = col1.iterator();
        Iterator<T2> it2 = col2.iterator();
        Iterator<T3> it3 = col3.iterator();
        Iterator<T4> it4 = col4.iterator();
        Iterator<T5> it5 = col5.iterator();
        Iterator<T6> it6 = col6.iterator();
        Iterator<T7> it7 = col7.iterator();
        Iterator<T8> it8 = col8.iterator();
        Iterator<T9> it9 = col9.iterator();
        Iterator<T10> it10 = col10.iterator();
        Iterator<T11> it11 = col11.iterator();
        Iterator<T12> it12 = col12.iterator();

        while (resultSize-- > 0) {
            result.add(tuple(next(it1), next(it2), next(it3), next(it4), next(it5), next(it6), next(it7), next(it8), next(it9), next(it10), next(it11), next(it12)));
        }

        return result;
    }

    /**
     * Zips a number of collections into one list of tuples
     *
     * @return zipped list
     */
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> List<Tuple13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>> zip(Collection<T1> col1, Collection<T2> col2, Collection<T3> col3, Collection<T4> col4, Collection<T5> col5, Collection<T6> col6, Collection<T7> col7, Collection<T8> col8, Collection<T9> col9, Collection<T10> col10, Collection<T11> col11, Collection<T12> col12, Collection<T13> col13) {
        int resultSize = _max(col1.size(), col2.size(), col3.size(), col4.size(), col5.size(), col6.size(), col7.size(), col8.size(), col9.size(), col10.size(), col11.size(), col12.size(), col13.size());
        List<Tuple13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>> result = new ArrayList<Tuple13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>>(resultSize);

        Iterator<T1> it1 = col1.iterator();
        Iterator<T2> it2 = col2.iterator();
        Iterator<T3> it3 = col3.iterator();
        Iterator<T4> it4 = col4.iterator();
        Iterator<T5> it5 = col5.iterator();
        Iterator<T6> it6 = col6.iterator();
        Iterator<T7> it7 = col7.iterator();
        Iterator<T8> it8 = col8.iterator();
        Iterator<T9> it9 = col9.iterator();
        Iterator<T10> it10 = col10.iterator();
        Iterator<T11> it11 = col11.iterator();
        Iterator<T12> it12 = col12.iterator();
        Iterator<T13> it13 = col13.iterator();

        while (resultSize-- > 0) {
            result.add(tuple(next(it1), next(it2), next(it3), next(it4), next(it5), next(it6), next(it7), next(it8), next(it9), next(it10), next(it11), next(it12), next(it13)));
        }

        return result;
    }

    /**
     * Zips a number of collections into one list of tuples
     *
     * @return zipped list
     */
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> List<Tuple14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14>> zip(Collection<T1> col1, Collection<T2> col2, Collection<T3> col3, Collection<T4> col4, Collection<T5> col5, Collection<T6> col6, Collection<T7> col7, Collection<T8> col8, Collection<T9> col9, Collection<T10> col10, Collection<T11> col11, Collection<T12> col12, Collection<T13> col13, Collection<T14> col14) {
        int resultSize = _max(col1.size(), col2.size(), col3.size(), col4.size(), col5.size(), col6.size(), col7.size(), col8.size(), col9.size(), col10.size(), col11.size(), col12.size(), col13.size(), col14.size());
        List<Tuple14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14>> result = new ArrayList<Tuple14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14>>(resultSize);

        Iterator<T1> it1 = col1.iterator();
        Iterator<T2> it2 = col2.iterator();
        Iterator<T3> it3 = col3.iterator();
        Iterator<T4> it4 = col4.iterator();
        Iterator<T5> it5 = col5.iterator();
        Iterator<T6> it6 = col6.iterator();
        Iterator<T7> it7 = col7.iterator();
        Iterator<T8> it8 = col8.iterator();
        Iterator<T9> it9 = col9.iterator();
        Iterator<T10> it10 = col10.iterator();
        Iterator<T11> it11 = col11.iterator();
        Iterator<T12> it12 = col12.iterator();
        Iterator<T13> it13 = col13.iterator();
        Iterator<T14> it14 = col14.iterator();

        while (resultSize-- > 0) {
            result.add(tuple(next(it1), next(it2), next(it3), next(it4), next(it5), next(it6), next(it7), next(it8), next(it9), next(it10), next(it11), next(it12), next(it13), next(it14)));
        }

        return result;
    }

    /**
     * Zips a number of collections into one list of tuples
     *
     * @return zipped list
     */
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> List<Tuple15<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15>> zip(Collection<T1> col1, Collection<T2> col2, Collection<T3> col3, Collection<T4> col4, Collection<T5> col5, Collection<T6> col6, Collection<T7> col7, Collection<T8> col8, Collection<T9> col9, Collection<T10> col10, Collection<T11> col11, Collection<T12> col12, Collection<T13> col13, Collection<T14> col14, Collection<T15> col15) {
        int resultSize = _max(col1.size(), col2.size(), col3.size(), col4.size(), col5.size(), col6.size(), col7.size(), col8.size(), col9.size(), col10.size(), col11.size(), col12.size(), col13.size(), col14.size(), col15.size());
        List<Tuple15<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15>> result = new ArrayList<Tuple15<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15>>(resultSize);

        Iterator<T1> it1 = col1.iterator();
        Iterator<T2> it2 = col2.iterator();
        Iterator<T3> it3 = col3.iterator();
        Iterator<T4> it4 = col4.iterator();
        Iterator<T5> it5 = col5.iterator();
        Iterator<T6> it6 = col6.iterator();
        Iterator<T7> it7 = col7.iterator();
        Iterator<T8> it8 = col8.iterator();
        Iterator<T9> it9 = col9.iterator();
        Iterator<T10> it10 = col10.iterator();
        Iterator<T11> it11 = col11.iterator();
        Iterator<T12> it12 = col12.iterator();
        Iterator<T13> it13 = col13.iterator();
        Iterator<T14> it14 = col14.iterator();
        Iterator<T15> it15 = col15.iterator();

        while (resultSize-- > 0) {
            result.add(tuple(next(it1), next(it2), next(it3), next(it4), next(it5), next(it6), next(it7), next(it8), next(it9), next(it10), next(it11), next(it12), next(it13), next(it14), next(it15)));
        }

        return result;
    }

    /**
     * Zips arrays into single array of tuples
     *
     * @return
     */
    @SuppressWarnings("unchecked")
    public static <T1, T2> Tuple2<T1, T2>[] zip(T1[] arr1, T2[] arr2) {
        int resultSize = _max(arr1.length, arr2.length);
        Tuple2[] result = new Tuple2[resultSize];

        for (int i = 0; i < resultSize; i++)
            result[i] = tuple(next(arr1, i), next(arr2, i));

        return result;
    }

    /**
     * Zips arrays into single array of tuples
     *
     * @return
     */
    @SuppressWarnings("unchecked")
    public static <T1, T2, T3> Tuple3<T1, T2, T3>[] zip(T1[] arr1, T2[] arr2, T3[] arr3) {
        int resultSize = _max(arr1.length, arr2.length, arr3.length);
        Tuple3[] result = new Tuple3[resultSize];

        for (int i = 0; i < resultSize; i++)
            result[i] = tuple(next(arr1, i), next(arr2, i), next(arr3, i));

        return result;
    }

    /**
     * Zips arrays into single array of tuples
     *
     * @return
     */
    @SuppressWarnings("unchecked")
    public static <T1, T2, T3, T4> Tuple4<T1, T2, T3, T4>[] zip(T1[] arr1, T2[] arr2, T3[] arr3, T4[] arr4) {
        int resultSize = _max(arr1.length, arr2.length, arr3.length, arr4.length);
        Tuple4[] result = new Tuple4[resultSize];

        for (int i = 0; i < resultSize; i++)
            result[i] = tuple(next(arr1, i), next(arr2, i), next(arr3, i), next(arr4, i));

        return result;
    }

    /**
     * Zips arrays into single array of tuples
     *
     * @return
     */
    @SuppressWarnings("unchecked")
    public static <T1, T2, T3, T4, T5> Tuple5<T1, T2, T3, T4, T5>[] zip(T1[] arr1, T2[] arr2, T3[] arr3, T4[] arr4, T5[] arr5) {
        int resultSize = _max(arr1.length, arr2.length, arr3.length, arr4.length, arr5.length);
        Tuple5[] result = new Tuple5[resultSize];

        for (int i = 0; i < resultSize; i++)
            result[i] = tuple(next(arr1, i), next(arr2, i), next(arr3, i), next(arr4, i), next(arr5, i));

        return result;
    }

    /**
     * Zips arrays into single array of tuples
     *
     * @return
     */
    @SuppressWarnings("unchecked")
    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6>[] zip(T1[] arr1, T2[] arr2, T3[] arr3, T4[] arr4, T5[] arr5, T6[] arr6) {
        int resultSize = _max(arr1.length, arr2.length, arr3.length, arr4.length, arr5.length, arr6.length);
        Tuple6[] result = new Tuple6[resultSize];

        for (int i = 0; i < resultSize; i++)
            result[i] = tuple(next(arr1, i), next(arr2, i), next(arr3, i), next(arr4, i), next(arr5, i), next(arr6, i));

        return result;
    }

    /**
     * Zips arrays into single array of tuples
     *
     * @return
     */
    @SuppressWarnings("unchecked")
    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7>[] zip(T1[] arr1, T2[] arr2, T3[] arr3, T4[] arr4, T5[] arr5, T6[] arr6, T7[] arr7) {
        int resultSize = _max(arr1.length, arr2.length, arr3.length, arr4.length, arr5.length, arr6.length, arr7.length);
        Tuple7[] result = new Tuple7[resultSize];

        for (int i = 0; i < resultSize; i++)
            result[i] = tuple(next(arr1, i), next(arr2, i), next(arr3, i), next(arr4, i), next(arr5, i), next(arr6, i), next(arr7, i));

        return result;
    }

    /**
     * Zips arrays into single array of tuples
     *
     * @return
     */
    @SuppressWarnings("unchecked")
    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>[] zip(T1[] arr1, T2[] arr2, T3[] arr3, T4[] arr4, T5[] arr5, T6[] arr6, T7[] arr7, T8[] arr8) {
        int resultSize = _max(arr1.length, arr2.length, arr3.length, arr4.length, arr5.length, arr6.length, arr7.length, arr8.length);
        Tuple8[] result = new Tuple8[resultSize];

        for (int i = 0; i < resultSize; i++)
            result[i] = tuple(next(arr1, i), next(arr2, i), next(arr3, i), next(arr4, i), next(arr5, i), next(arr6, i), next(arr7, i), next(arr8, i));

        return result;
    }

    /**
     * Zips arrays into single array of tuples
     *
     * @return
     */
    @SuppressWarnings("unchecked")
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9> Tuple9<T1, T2, T3, T4, T5, T6, T7, T8, T9>[] zip(T1[] arr1, T2[] arr2, T3[] arr3, T4[] arr4, T5[] arr5, T6[] arr6, T7[] arr7, T8[] arr8, T9[] arr9) {
        int resultSize = _max(arr1.length, arr2.length, arr3.length, arr4.length, arr5.length, arr6.length, arr7.length, arr8.length, arr9.length);
        Tuple9[] result = new Tuple9[resultSize];

        for (int i = 0; i < resultSize; i++)
            result[i] = tuple(next(arr1, i), next(arr2, i), next(arr3, i), next(arr4, i), next(arr5, i), next(arr6, i), next(arr7, i), next(arr8, i), next(arr9, i));

        return result;
    }

    /**
     * Zips arrays into single array of tuples
     *
     * @return
     */
    @SuppressWarnings("unchecked")
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> Tuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10>[] zip(T1[] arr1, T2[] arr2, T3[] arr3, T4[] arr4, T5[] arr5, T6[] arr6, T7[] arr7, T8[] arr8, T9[] arr9, T10[] arr10) {
        int resultSize = _max(arr1.length, arr2.length, arr3.length, arr4.length, arr5.length, arr6.length, arr7.length, arr8.length, arr9.length, arr10.length);
        Tuple10[] result = new Tuple10[resultSize];

        for (int i = 0; i < resultSize; i++)
            result[i] = tuple(next(arr1, i), next(arr2, i), next(arr3, i), next(arr4, i), next(arr5, i), next(arr6, i), next(arr7, i), next(arr8, i), next(arr9, i), next(arr10, i));

        return result;
    }

    /**
     * Zips arrays into single array of tuples
     *
     * @return
     */
    @SuppressWarnings("unchecked")
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> Tuple11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11>[] zip(T1[] arr1, T2[] arr2, T3[] arr3, T4[] arr4, T5[] arr5, T6[] arr6, T7[] arr7, T8[] arr8, T9[] arr9, T10[] arr10, T11[] arr11) {
        int resultSize = _max(arr1.length, arr2.length, arr3.length, arr4.length, arr5.length, arr6.length, arr7.length, arr8.length, arr9.length, arr10.length, arr11.length);
        Tuple11[] result = new Tuple11[resultSize];

        for (int i = 0; i < resultSize; i++)
            result[i] = tuple(next(arr1, i), next(arr2, i), next(arr3, i), next(arr4, i), next(arr5, i), next(arr6, i), next(arr7, i), next(arr8, i), next(arr9, i), next(arr10, i), next(arr11, i));

        return result;
    }

    /**
     * Zips arrays into single array of tuples
     *
     * @return
     */
    @SuppressWarnings("unchecked")
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> Tuple12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12>[] zip(T1[] arr1, T2[] arr2, T3[] arr3, T4[] arr4, T5[] arr5, T6[] arr6, T7[] arr7, T8[] arr8, T9[] arr9, T10[] arr10, T11[] arr11, T12[] arr12) {
        int resultSize = _max(arr1.length, arr2.length, arr3.length, arr4.length, arr5.length, arr6.length, arr7.length, arr8.length, arr9.length, arr10.length, arr11.length, arr12.length);
        Tuple12[] result = new Tuple12[resultSize];

        for (int i = 0; i < resultSize; i++)
            result[i] = tuple(next(arr1, i), next(arr2, i), next(arr3, i), next(arr4, i), next(arr5, i), next(arr6, i), next(arr7, i), next(arr8, i), next(arr9, i), next(arr10, i), next(arr11, i), next(arr12, i));

        return result;
    }

    /**
     * Zips arrays into single array of tuples
     *
     * @return
     */
    @SuppressWarnings("unchecked")
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> Tuple13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13>[] zip(T1[] arr1, T2[] arr2, T3[] arr3, T4[] arr4, T5[] arr5, T6[] arr6, T7[] arr7, T8[] arr8, T9[] arr9, T10[] arr10, T11[] arr11, T12[] arr12, T13[] arr13) {
        int resultSize = _max(arr1.length, arr2.length, arr3.length, arr4.length, arr5.length, arr6.length, arr7.length, arr8.length, arr9.length, arr10.length, arr11.length, arr12.length, arr13.length);
        Tuple13[] result = new Tuple13[resultSize];

        for (int i = 0; i < resultSize; i++)
            result[i] = tuple(next(arr1, i), next(arr2, i), next(arr3, i), next(arr4, i), next(arr5, i), next(arr6, i), next(arr7, i), next(arr8, i), next(arr9, i), next(arr10, i), next(arr11, i), next(arr12, i), next(arr13, i));

        return result;
    }

    /**
     * Zips arrays into single array of tuples
     *
     * @return
     */
    @SuppressWarnings("unchecked")
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> Tuple14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14>[] zip(T1[] arr1, T2[] arr2, T3[] arr3, T4[] arr4, T5[] arr5, T6[] arr6, T7[] arr7, T8[] arr8, T9[] arr9, T10[] arr10, T11[] arr11, T12[] arr12, T13[] arr13, T14[] arr14) {
        int resultSize = _max(arr1.length, arr2.length, arr3.length, arr4.length, arr5.length, arr6.length, arr7.length, arr8.length, arr9.length, arr10.length, arr11.length, arr12.length, arr13.length, arr14.length);
        Tuple14[] result = new Tuple14[resultSize];

        for (int i = 0; i < resultSize; i++)
            result[i] = tuple(next(arr1, i), next(arr2, i), next(arr3, i), next(arr4, i), next(arr5, i), next(arr6, i), next(arr7, i), next(arr8, i), next(arr9, i), next(arr10, i), next(arr11, i), next(arr12, i), next(arr13, i), next(arr14, i));

        return result;
    }

    /**
     * Zips arrays into single array of tuples
     *
     * @return
     */
    @SuppressWarnings("unchecked")
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> Tuple15<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15>[] zip(T1[] arr1, T2[] arr2, T3[] arr3, T4[] arr4, T5[] arr5, T6[] arr6, T7[] arr7, T8[] arr8, T9[] arr9, T10[] arr10, T11[] arr11, T12[] arr12, T13[] arr13, T14[] arr14, T15[] arr15) {
        int resultSize = _max(arr1.length, arr2.length, arr3.length, arr4.length, arr5.length, arr6.length, arr7.length, arr8.length, arr9.length, arr10.length, arr11.length, arr12.length, arr13.length, arr14.length, arr15.length);
        Tuple15[] result = new Tuple15[resultSize];

        for (int i = 0; i < resultSize; i++)
            result[i] = tuple(next(arr1, i), next(arr2, i), next(arr3, i), next(arr4, i), next(arr5, i), next(arr6, i), next(arr7, i), next(arr8, i), next(arr9, i), next(arr10, i), next(arr11, i), next(arr12, i), next(arr13, i), next(arr14, i), next(arr15, i));

        return result;
    }

    private static <T> T next(T[] array, int index) {
        return array.length > index ? array[index] : null;
    }

    private static <T> T next(Iterator<T> iterator) {
        return iterator.hasNext() ? iterator.next() : null;
    }

    private static int _max(int... ints) {
        int result = Integer.MIN_VALUE;
        for (int anInt : ints)
            result = max(result, anInt);

        return result;
    }
}
