import java.util.LinkedList;
import java.util.ArrayList;
class Linkedlist{
    public static void main(String args[]){
        ArrayList<String> al = new ArrayList<>();
        al.add("S1");
        al.add("S2");
        LinkedList <String> ll= new LinkedList<>();
        ll.add("Charan");
        ll.add("harish");
        ll.add("Sagala");
        ll.add(1,"Mohan");
        ll.addAll(al);
        System.out.println(ll);
        ll.removeAll(al);
        System.out.println(ll);
        System.out.println(ll.get(2));
        System.out.println(ll.contains("Charan"));

    }
}