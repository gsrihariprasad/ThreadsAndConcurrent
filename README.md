ConcurrentHashMap and Hashtable locking mechanism

>Hashtable is belongs to the Collection framework; ConcurrentHashMap belongs to the Executor framework.

>Hashtable uses single lock for whole data. ConcurrentHashMap uses multiple locks on segment level (16 by default) instead of object level i.e. whole Map.

>ConcurrentHashMap locking is applied only for updates. In case of retrievals, it allows full concurrency, retrievals reflect the results of the most recently completed update operations. So reads can happen very fast while writes are done with a lock.

>ConcurrentHashMap doesn't throw a ConcurrentModificationException if one thread tries to modify it while another is iterating over it and does not allow null values.

>ConcurrentHashMap returns Iterator, which fails-safe (i.e. iterator will make a copy of the internal data structure) on concurrent modification.

>ConcurrentHashMap uses a database shards logic (Segment<K, V>[] segments) is known as Concurrency-Level, i.e. divides the data into shards(segments) than puts locks on each shard (segment) instead of putting a single lock for whole data (Map). The default value is  **16**.

>Assume Hashtable and ConcurrentHashMap are two types of Homes.
Hashtable locks home's main door.
ConcurrentHashMap locks specific room door instead of main door.


Which is more efficient for threaded applications?

ConcurrentHashMap is more efficient for threaded applications.




# Constructor and Description



## ConcurrentHashMap() ##

Creates a new, empty map with the default initial table size (16).

## ConcurrentHashMap(int initialCapacity) ##

Creates a new, empty map with an initial table size accommodating the specified number of elements without the need to dynamically resize.

## ConcurrentHashMap(int initialCapacity, float loadFactor) ##

Creates a new, empty map with an initial table size based on the given number of elements (initialCapacity) and initial table density (loadFactor).

## ConcurrentHashMap(int initialCapacity, float loadFactor, int concurrencyLevel) ##

Creates a new, empty map with an initial table size based on the given number of elements (initialCapacity), table density (loadFactor), and number of concurrently updating threads (concurrencyLevel).

 ## ConcurrentHashMap(Map<? extends K,? extends V> m) ##

Creates a new map with the same mappings as the given map.
# IMP Mehtods #
## putIfAbsent(K key, V value) ##
If the specified key is not already associated with a value, associate it with the given value.
## remove(Object key, Object value) ##
Removes the entry for a key only if currently mapped to a given value.
## replace(K key, V oldValue, V newValue) ##
Replaces the entry for a key only if currently mapped to a given value.
## replaceAll(BiFunction<? super K,? super V,? extends V> function) ##
Replaces each entry's value with the result of invoking the given function on that entry until all entries have been processed or the function throws an exception.
