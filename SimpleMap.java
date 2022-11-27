/**
 * Map from integer to Strings
 */
public interface SimpleMap {
    /**
     * Puts a new String in the map. If the key is already in the map,
     * the old entry in the map is replaced by the new entry.
     *
     * @param key  the key to map to the name
     * @param name the name to be mapped to
     */
    void put(int key, String name);

    /**
     * @param the key for which a name is supposed to be retrieved
     * @return the name associated with that key,
     * or null if there is none
     */
    String get(int key);

    /**
     * Removes a name from the map. Future calls to get(key)
     * will return null for this key unless another
     * name is added with the same key.
     *
     * @param key its entry (if any) will be removed
     */
    void remove(int key);

    /**
     * @return true if there are no entries in the map, false otherwise
     */
    boolean isEmpty();
}