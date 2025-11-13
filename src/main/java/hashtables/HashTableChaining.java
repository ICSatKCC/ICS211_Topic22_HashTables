package hashtables;
import linkedlists.*;
/** Implementation of a hash table using chaining for collision resolution.
 * @author Lisa Miller
 * @since 11/13/2025
 */
public class HashTableChaining<V> implements HashTable<V> {
    // Implementation details would go here
    SingleLinkedList<HashTableEntry<V>>[] table;
    int capacity;
    int size; 


    @Override
    public V put(V value) {
        // Implementation of put method
        return null;
    }

    @Override
    public V get(V value) {
        // Implementation of get method
        return null;
    }

    @Override
    public V remove(V value) {
        // Implementation of remove method
        return null;
    }

    @Override
    public boolean contains(V value) {
        // Implementation of containsKey method
        return false;
    }

    @Override
    public int size() {
        // Implementation of size method
        return 0;
    }

    @Override
    public boolean isEmpty() {
        // Implementation of isEmpty method
        return false;
    }

    @Override
    public void clear() {
        // Implementation of clear method
    }

}
