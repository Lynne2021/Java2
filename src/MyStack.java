import java.util.ArrayList;

public class MyStack {
  private ArrayList<Object> list;

    public MyStack(){
        ArrayList<Object> list = new ArrayList<>();
    }
    public boolean isEmpty(){
        return list.size()==0;
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
        public Object search(Object o){
        return list.lastIndexOf(o);
        }

    }


