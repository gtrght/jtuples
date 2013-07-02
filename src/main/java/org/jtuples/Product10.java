package org.jtuples;

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
public class Product10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> extends Product{
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

    public Product10(T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6, T7 v7, T8 v8, T9 v9, T10 v10){
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
        this.arity = 10;
    }

    public Object getElement(int index){
        switch(index){
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
            default:
                throw new IndexOutOfBoundsException("Index is out of range: " + index);
        }
    }
    public T1 _1() {
        return v1;
    }

    public T2 _2() {
        return v2;
    }

    public T3 _3() {
        return v3;
    }

    public T4 _4() {
        return v4;
    }

    public T5 _5() {
        return v5;
    }

    public T6 _6() {
        return v6;
    }

    public T7 _7() {
        return v7;
    }

    public T8 _8() {
        return v8;
    }

    public T9 _9() {
        return v9;
    }

    public T10 _10() {
        return v10;
    }}