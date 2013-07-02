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
package org.jtuples;

/**
 * author: v.vlasov
 */
public class SampleProduct3<T1, T2, T3> extends Product {
    private T1 v1;
    private T2 v2;
    private T3 v3;

    public SampleProduct3(T1 v1, T2 v2, T3 v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
        arity = 3;
    }

    @Override
    public Object getElement(int index) {
        switch (index) {
            case 0:
                return v1;
            case 1:
                return v2;
            case 2:
                return v3;
            default:
                throw new IndexOutOfBoundsException("Index is out of bounds: " + index + ".");
        }
    }
}
