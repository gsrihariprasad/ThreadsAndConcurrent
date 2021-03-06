>Underlying Data Structure is Hashtable.

>ConcurrentHashMap allows Concurrent read and Thread safe update operations.

>To Perform read operation Thread won’t require any Lock.  But to perform update operation Thread requires Lock but it is the Lock of only a particular part of Map (Bucket Level Lock).

>Instead of whole Map concurrent update achieved by internally dividing Map into smaller portion which is defined by concurrency level.

>The Default concurrency level is 16.

>That is ConcurrentHashMap allows simultaneous read operation and  simultaneously 16 write (update) operations.

>Null is not allowed for both keys and values.

>While one thread is iteration the other thread can perform update operation and ConcurrentHashMap never throw ConcurrentModificationException.




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
