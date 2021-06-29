package Class4;

public class MyStackTest {public static void main (String[] args){
    MyStack stack1=new MyStack();
    stack1.push(new Animal(30,"meat",10));
    stack1.push(new Animal(40,"plant",20));
    System.out.println(stack1.isEmpty());
    System.out.println(stack1.getSize());
    System.out.println(stack1.peek()); //calls tostring method because you are trying to print out an object
   stack1.pop();
    System.out.println(stack1.getSize());
}
}

