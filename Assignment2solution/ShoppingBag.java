public class ShoppingBag implements ICollection<Object> {
    public Object[] listOfItems;
    public int numberOfItems=0;

    public ShoppingBag(int i){
        if(i<=0)
            throw new IllegalArgumentException("Size could not be negative or zero");
        else
            listOfItems= new Object[i];
    }

    @Override
    public boolean add(Object newItem) {
        if(numberOfItems<listOfItems.length) {
            listOfItems[numberOfItems] = newItem;
            numberOfItems++;
            return true;
        }
        else
            return false;
    }

    @Override
    public Object getNext(){
        numberOfItems--;
        return listOfItems[numberOfItems];

    }
}
