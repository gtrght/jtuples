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
```


```Java
import static com.othelle.jtuples.Tuples.tuple;

...
Tuple2<Integer, Integer> item = tuple(1, 2); 
```