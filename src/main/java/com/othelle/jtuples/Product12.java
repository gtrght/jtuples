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

/*
 * =============================================================================
 *   GENERATED CODE DO NOT EDIT
 * =============================================================================
 */


import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonProperty;

public class Product12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> extends Product implements Tuple12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> {
    private static final long serialVersionUID = -1187955276020306879L;

    private T1 v1;
    private T2 v2;
    private T3 v3;
    private T4 v4;
    private T5 v5;
    private T6 v6;
    private T7 v7;
    private T8 v8;
    private T9 v9;
    private T10 v10;
    private T11 v11;
    private T12 v12;

    @JsonCreator
    public Product12(@JsonProperty("_1") T1 v1, @JsonProperty("_2") T2 v2, @JsonProperty("_3") T3 v3, @JsonProperty("_4") T4 v4, @JsonProperty("_5") T5 v5, @JsonProperty("_6") T6 v6, @JsonProperty("_7") T7 v7, @JsonProperty("_8") T8 v8, @JsonProperty("_9") T9 v9, @JsonProperty("_10") T10 v10, @JsonProperty("_11") T11 v11, @JsonProperty("_12") T12 v12) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
        this.v4 = v4;
        this.v5 = v5;
        this.v6 = v6;
        this.v7 = v7;
        this.v8 = v8;
        this.v9 = v9;
        this.v10 = v10;
        this.v11 = v11;
        this.v12 = v12;
        this.arity = 12;
    }

    public Object getElement(int index) {
        switch (index) {
            case 0:
                return v1;
            case 1:
                return v2;
            case 2:
                return v3;
            case 3:
                return v4;
            case 4:
                return v5;
            case 5:
                return v6;
            case 6:
                return v7;
            case 7:
                return v8;
            case 8:
                return v9;
            case 9:
                return v10;
            case 10:
                return v11;
            case 11:
                return v12;
            default:
                throw new IndexOutOfBoundsException("Index is out of range: " + index);
        }
    }

    @JsonProperty("_1")
    public T1 _1() {
        return v1;
    }

    @JsonProperty("_2")
    public T2 _2() {
        return v2;
    }

    @JsonProperty("_3")
    public T3 _3() {
        return v3;
    }

    @JsonProperty("_4")
    public T4 _4() {
        return v4;
    }

    @JsonProperty("_5")
    public T5 _5() {
        return v5;
    }

    @JsonProperty("_6")
    public T6 _6() {
        return v6;
    }

    @JsonProperty("_7")
    public T7 _7() {
        return v7;
    }

    @JsonProperty("_8")
    public T8 _8() {
        return v8;
    }

    @JsonProperty("_9")
    public T9 _9() {
        return v9;
    }

    @JsonProperty("_10")
    public T10 _10() {
        return v10;
    }

    @JsonProperty("_11")
    public T11 _11() {
        return v11;
    }

    @JsonProperty("_12")
    public T12 _12() {
        return v12;
    }
}