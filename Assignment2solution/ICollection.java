public interface ICollection<T> {
    /**
     * Used to add a new item to a collection
     *
     * @param newItem of type T
     * @return true if the item is added successfully
     */
    boolean add(T newItem);

    /**
     * Used to return an available item.
     * Items returned are removed from the collection
     *
     * @return an item of type T
     */
    T getNext();
}

