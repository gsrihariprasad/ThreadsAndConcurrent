ConcurrentHashMap and Hashtable locking mechanism

Hashtable is belongs to the Collection framework; ConcurrentHashMap belongs to the Executor framework.

Hashtable uses single lock for whole data. ConcurrentHashMap uses multiple locks on segment level (16 by default) instead of object level i.e. whole Map.

ConcurrentHashMap locking is applied only for updates. In case of retrievals, it allows full concurrency, retrievals reflect the results of the most recently completed update operations. So reads can happen very fast while writes are done with a lock.

ConcurrentHashMap doesn't throw a ConcurrentModificationException if one thread tries to modify it while another is iterating over it and does not allow null values.

ConcurrentHashMap returns Iterator, which fails-safe (i.e. iterator will make a copy of the internal data structure) on concurrent modification.

ConcurrentHashMap uses a database shards logic (Segment<K, V>[] segments) is known as Concurrency-Level, i.e. divides the data into shards(segments) than puts locks on each shard (segment) instead of putting a single lock for whole data (Map). The default value is 16.

To understand the ConcurrentHashMap more technically please look at this link

The following analogy helps you get understand the concept only(not logic)

Assume Hashtable and ConcurrentHashMap are two types of Homes.
Hashtable locks home's main door.
ConcurrentHashMap locks specific room door instead of main door.


Which is more efficient for threaded applications?

ConcurrentHashMap is more efficient for threaded applications.
