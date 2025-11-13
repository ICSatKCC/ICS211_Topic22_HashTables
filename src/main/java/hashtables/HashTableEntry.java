package hashtables;
/** Class representing an entry in a hash table. 
 * @author Lisa Miller
 * @since 11/13/2025
*/
public class HashTableEntry<V> {
    private int key;
    private V value;

    public HashTableEntry(V value) {
        this.key = value.hashCode();
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}