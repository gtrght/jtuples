    /**
     * Zips a number of collections into one list of tuples
     * @return zipped list
     */
    public static <[TN]> List<Tuple[N]<[TN]>> zip([CTN]) [
        int resultSize = _max([CSN]);
        List<Tuple[N]<[TN]>> result = new ArrayList<Tuple[N]<[TN]>>(resultSize);

        [CIN]

        while (--resultSize > 0) [
                result.add(tuple([NTN]));
        ]

        return result;
    ]