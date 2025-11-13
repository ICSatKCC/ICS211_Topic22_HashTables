package hashtables;
/** Interface for a generic hash table.
 * @author Lisa Miller
 * @since 11/13/2025
 */
public interface HashTable<V> {
    
    /**
     * Adds a value to the hash table.
     * @param value the value to be added
     * @return 
     */
    V put(V value);
    
    /**
     * Returns the value to which the specified key is mapped.
     * @param value the value whose associated value is to be returned
     * @return the value associated with the key, or null if no mapping exists
     */
    V get(V value);
    
    /**
     * Removes the mapping for a key from this hash table if it is present.
     * @param value
     * @return the previous value associated with key, or null if there was no mapping
     */
    V remove(V value);
    
    /**
     * Returns true if this hash table contains a mapping for the specified key.
     * @param value the value whose presence is to be tested
     * @return true if this hash table contains the value.
     */
    boolean contains(V value);
    
    /**
     * Returns the number of mappings in this hash table.
     * @return the number of mappings
     */
    int size();
    
    /**
     * Returns true if this hash table contains no mappings.
     * @return true if this hash table contains no mappings
     */
    boolean isEmpty();
    
    /**
     * Removes all mappings from this hash table.
     */
    void clear();
}
