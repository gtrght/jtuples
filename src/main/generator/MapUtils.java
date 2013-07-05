        /**
         * Constructs a map from a given list of IValue[N], considering each first element as a key and the rest as a value IValue[N-1]
         * @param keyValues
         * @return a map
         */
        public static <[TN]> Map<T1, IValue[N-1]<[T2:N]>> map[N](Iterable<IValue[N]<[TN]>> keyValues) [
            Map<T1, IValue[N-1]<[T2:N]>> map = new HashMap<T1, IValue[N-1]<[T2:N]>>();
            for (IValue[N]<[TN]> keyValue : keyValues) [
                map.put(keyValue._1(), tuple([kv2:N]));
            ]
            return map;
        ]
