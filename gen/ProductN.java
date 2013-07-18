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

//GENERATED CODE, DO NOT EDIT

package com.othelle.jtuples;

/**
 * author: v.vlasov
 */
public class ProductN<T1, T2, T3> extends Product {

    private T1 v1;
    private T2 v2;
    private T3 v3;

    public ProductN(T1 v1, T2 v2, T3 v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }


    @Override
    public Object getElement(int index) {
        switch (index) {
            case 0:
                return v1;
            case 1:
                return v1;
            case 2:
                return v1;
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
}
