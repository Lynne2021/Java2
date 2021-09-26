public class ClientService implements ICollection<Object>{

   public MyQueue clients;
   public int maxCustomer;

    public ClientService(int n){
        if(n<=0)
            throw new IllegalArgumentException("Size could not be negative or zero");
        else {
            maxCustomer=n;
            clients = new MyQueue();
        }
    }

    @Override
    public boolean add(Object newItem) {
        if(clients.getSize()<maxCustomer) {
            clients.enqueue(newItem);
            return true;
        }
        else
            return false;
    }

    @Override
    public Object getNext(){
        return clients.dequeue();
    }
}
