# JTuples Java library

The main idea of this project is to provide a collection of immutable tuple objects that can be used with no extra tuning. However there are some way to make your own implementations and re-use the functionallity of util classes. 

## Maven repository (Ivy dependency)
This section will describe how to use sonatype repository server to get an artifact using maven and ivy


## Sample usage
The library contains a set of interfaces which are named pretty straight-forward. Instead of Unit, Pair, Triplet... Sixtet... there are Tuple1, Tuple2 and up to Tuple 16. The main idea is to keep tuples as an interfaces to allow end-user to define their own implementations different from com.othelle.jtuples.Product

To reduce the amount of code needed to create a tuple you just use Tuples.tuple(...) method like this. 

Instead of 

```Java
Tuple2<Integer, Integer> item = new Tuple2<Integer, Integer>(1, 2);
Tuple5<Integer, Integer, Integer, Integer, String> item5 = new Tuple5<Integer, Integer, Integer, Integer, String>(1, 2, 3, 4, "5");
```


```Java
import static com.othelle.jtuples.Tuples.tuple;

...
Tuple2<Integer, Integer> item = tuple(1, 2); 
Tuple5<Integer, Integer, Integer, Integer, String> item5 = tuple(1, 2, 3, 4, "5");
```


## Hash code and equals

The standart implementation of hashCode and equals allows to use tuples as keys in a HashMap. Tuple can even be a null-containing. 

```Java
        HashMap<Tuple2, String> map = new HashMap<Tuple2, String>();

        map.put(tuple(1, null), "res1");
        map.put(tuple(null, 2), "res2");
        map.put(tuple(null, null), "res3");

        assertThat(map.get(tuple(1, null)), Matchers.equalTo("res1"));
        assertThat(map.get(tuple(null, 2)), Matchers.equalTo("res2"));
        assertThat(map.get(tuple(null, null)), Matchers.equalTo("res3"));
```


## Mapping, unmapping, zipping and conversions

There are number of simple but very useful methods provided

### Map
There are a number of methods to convert a list of tuples into a map. The most common case is to convert a list of Tuple2 (KeyValue pair) to map. Since this is the most popular ways there is an option available to preserve on original order (e.g. use LinkedHashMap)

```Java
import static com.othelle.jtuples.Tuples.tuple;



        Map<Integer, String> map = MapUtils.map(Arrays.asList(tuple(25, "1"), tuple(1, "value2"), tuple(3, "value2")), true);

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            assertThat(Tuples.convert(entry), Matchers.equalTo(tuple(25, "1")));
            break;
        }

        assertThat(map.entrySet(), Matchers.hasSize(3));
        assertThat(map.get(1), Matchers.equalTo("value2"));
```

There are also a number of simple methods to convert Tuple[2-16] named MapUtils.map[2-16](List<Tuple[2-16]>)

```Java
        Map<Integer, Tuple2<String, String>> map = MapUtils.map3(Arrays.asList(tuple(1, "1", "value1"), tuple(1, "2", "value2")));
        assertThat(map.entrySet(), Matchers.hasSize(2));
        assertThat(map.get(1), Matchers.equalTo(tuple("1", "value1")));
```

### Flatten

There is a method 'flatten(Map)' to unwind entries into a list tuples: 

```Java
        Map<String, Integer> map = new LinkedHashMap<String, Integer>();
        map.put("key1", 1);
        map.put("key2", 2);

        List<Tuple2<String, Integer>> list = MapUtils.flatten(map);

        assertThat(list, Matchers.hasSize(2));
        assertThat(list.get(0), Matchers.equalTo(tuple("key1", 1)));
        assertThat(list.get(1), Matchers.equalTo(tuple("key2", 2)));
```



### Zip

```Java
        List<Tuple3<Integer, Integer, Integer>> zip = zip(asList(1, 2, 3), asList(2, 3, 1), asList(3, 1, 2));
        assertThat(zip.get(2), equalTo(tuple(3, 1, 2)));
```