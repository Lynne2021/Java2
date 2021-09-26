
import java.util.ArrayList;

public class MyQueue {
    private ArrayList<Object> list;

    public MyQueue(){
        list = new ArrayList<>();
    }

    public boolean isEmpty(){
        if(list.size() == 0)
            return true ;
        else
            return false;
    }

    public int getSize(){
        return list.size();
    }

    public Object peek(){
        return list.get(0);
    }

    public Object dequeue(){
        return list.remove(0);
    }
    public Object enqueue(Object o){
        return list.add(o);
    }

    public int search(Object o) {
        return list.indexOf(o);
    }
}