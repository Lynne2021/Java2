package Class4;

import java.util.ArrayList;

public class MyStack {
    private ArrayList<Object> list;

    public MyStack(){
        list = new ArrayList<Object>();
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
        return list.get(list.size()-1);
    }
    public Object pop(){
        return list.remove(list.size()-1);
    }
    public void push(Object o){
        list.add(o);
    }
    public int search(Object o) {
      /*  for(int i=list.size()-1; i>=0;i--){
            if(list.get(i).equals(o))
                return i;
        }
        return -1;
    */
        return list.lastIndexOf(o);
    }
}
