package hashtables;
/** Interface for a generic hash table.
 * @author Lisa Miller
 * @since 11/13/2025
 */
public interface HashTable<K, V> {
    
    /**
     * Associates the specified value with the specified key in this hash table.
     * @param key the key with which the specified value is to be associated
     * @param value the value to be associated with the specified key
     * @return the previous value associated with key, or null if there was no mapping
     */
    V put(K key, V value);
    
    /**
     * Returns the value to which the specified key is mapped.
     * @param key the key whose associated value is to be returned
     * @return the value associated with the key, or null if no mapping exists
     */
    V get(K key);
    
    /**
     * Removes the mapping for a key from this hash table if it is present.
     * @param key the key whose mapping is to be removed
     * @return the previous value associated with key, or null if there was no mapping
     */
    V remove(K key);
    
    /**
     * Returns true if this hash table contains a mapping for the specified key.
     * @param key the key whose presence is to be tested
     * @return true if this hash table contains a mapping for the specified key
     */
    boolean containsKey(K key);
    
    /**
     * Returns the number of key-value mappings in this hash table.
     * @return the number of key-value mappings
     */
    int size();
    
    /**
     * Returns true if this hash table contains no key-value mappings.
     * @return true if this hash table contains no mappings
     */
    boolean isEmpty();
    
    /**
     * Removes all mappings from this hash table.
     */
    void clear();
}
