package hashtables;
/** Class representing an entry in a hash table. 
 * @author Lisa Miller
 * @since 11/13/2025
*/
public class HashTableEntry<V> {
    /** The key associated with this entry. */  
    private int key;
    /** The value associated with this entry. */
    private V value;    
    /** Constructor to create a hash table entry with the given value.
     * The key is derived from the value's hash code.
     * @param value the value to be stored in the entry
     */ 
    public HashTableEntry(V value) {
        this.key = Math.abs(value.hashCode());
        this.value = value;
    }
    /** Getter for the key.
     * @return the key of this entry
     */
    public int getKey() {
        return key;
    }

    /** Getter for the value.
     * @return the value of this entry
     */
    public V getValue() {
        return value;
    }

    /** Setter for the value.
     * @param value the new value to set
     */     
    public void setValue(V value) {
        this.value = value;
    }
    /** Returns a string representation of the hash table entry.
     * @return a string representation of the entry
     */
    @Override
    public String toString() {
        return value.toString();
    }
}