        /**
         * Constructs a map from a given list of Tuple[N], considering each first element as a key and the rest as a value Tuple[N-1]
         * @param keyValues
         * @return a map
         */
        public static <[TN]> Map<T1, Tuple[N-1]<[T2:N]>> map[N](Iterable<Tuple[N]<[TN]>> keyValues) [
            Map<T1, Tuple[N-1]<[T2:N]>> map = new HashMap<T1, Tuple[N-1]<[T2:N]>>();
            for (Tuple[N]<[TN]> keyValue : keyValues) [
                map.put(keyValue._1(), tuple([kv2:N]));
            ]
            return map;
        ]

        /**
         * Constructs a map from a given keyValues
         *
         * @param keyValues
         * @return map build from an array of tuples
         */
        public static <[TN]> Map<T1, Tuple[N-1]<[T2:N]>> map(Tuple[N]<[TN]>... keyValues) [
                return map[N](Arrays.asList(keyValues));
        ]
