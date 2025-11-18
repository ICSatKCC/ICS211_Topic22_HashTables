package hashtables;

/**
 * Interface for a generic hash table.
 * 
 * @author Lisa Miller
 * @since 11/13/2025
 */
public interface HashTable<V> {

    /**
     * Adds a value to the hash table.
     * 
     * @param value the value to be added
     * @return
     */
    V put(V value);

    /**
     * Checks if the hash table contains the specified value.
     * 
     * @param value the value whose associated value is to be returned
     * @return the value associated with the key
     * @throws HashTableException if the value is not found
     */
    V get(V value);

    /**
     * Removes the vfrom this hash table if it is present.
     * 
     * @param value
     * @return the removed value
     * @throws HashTableException if the value is not found
     */
    V remove(V value);

    /**
     * Returns the number of mappings in this hash table.
     * 
     * @return the number of mappings
     */
    int size();

    /**
     * Returns true if this hash table contains no mappings.
     * 
     * @return true if this hash table contains no mappings
     */
    boolean isEmpty();

    /**
     * Removes all mappings from this hash table.
     */
    void clear();

    /** returns printable string representation of the hash table */
    String toString();
}
