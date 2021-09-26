public class Test {
    public static void main(String[] args){
       /* DeansList d =new DeansList();

        System.out.println(d.add(new Student("a", 3.7)));
        System.out.println(d.add(new Student("b", 3.5)));
        System.out.println(d.add(new Student("c", 3.8)));
        System.out.println(d.add(new Student("d", 4)));
        System.out.println(d.add(new Student("e", 3.9)));
        System.out.println(d.add(new Student("f", 3.3)));
        System.out.println(d.getNext());
        System.out.println(d.getNext());
        System.out.println(d.getNext());*/


        ShoppingBag s= new ShoppingBag(5);
        System.out.println(s.add("apple"));
        System.out.println(s.add("Banana"));
        System.out.println(s.add("Orange"));
        System.out.println(s.add("Kiwi"));
        System.out.println(s.add("Mango"));
        System.out.println(s.add("Watermelon"));

        System.out.println(s.getNext());
        System.out.println(s.getNext());
        System.out.println(s.getNext());
        System.out.println(s.getNext());


        ClientService c= new ClientService(10);
        System.out.println(c.add("A"));
        System.out.println(c.add("B"));
        System.out.println(c.add("C"));
        System.out.println(c.add("D"));
        System.out.println(c.add("E"));
        System.out.println(c.add("F"));


        System.out.println(c.getNext());
        System.out.println(c.getNext());
        System.out.println(c.getNext());
        System.out.println(c.getNext());


    }
}
