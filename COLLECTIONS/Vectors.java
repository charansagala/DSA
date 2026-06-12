import java.util.*;
class Vectors{
    public static void main(String args[]) throws Exception{
        Vector v1 = new Vector();
        v1.add(10);
        v1.add(0,"Charan");     //here v1 object contains array with capacity of 10 intially 
        v1.add(0,"Sagala");     //vectorName.add(Index,value);
        v1.add(45);
        v1.add(1);
        v1.add(3);
        v1.add(234);
        v1.add(24);
        v1.add(1);
        v1.add(3);
        v1.add(234);
        v1.add(24);
        //System.out.println("Size:"+v1.size());
        //System.out.println("Capacity:"+v1.capacity());

        Vector v2 = new Vector();
        v2.add(0,"Harish");
        v2.add(1,"Mohan");
        for(int i=0;i<v2.size();i++){
            v1.add(v2.get(i));           //we can use v1.addAll(v2);
        }
        //vectorName.get(Index_Number);
        v1.set(2,"Sravanthi");  //to update a value in the vector
                                //vectorName.set(Index,UpdateValue);

        //vectoeName.remove(IndexNumber) or VectorName.remove(value)
        v1.remove(1);
        v1.remove("Sagala");
        v1.removeAll(v2);//to remove collection of elements
        System.out.println(v1.contains(34));//it checks whether the value is present in the vector or not
        System.out.println(v1.containsAll(v2));//to check all element of one vector present in another vector
        v1.clear();//to delete the entire vector 
        v1.add(10);
        v1.add(0,"Charan");     
        v1.add(0,"Sagala");     
        v1.add(45);
        v1.add(1);
        v1.add(3);
        v1.add(234);
        v1.add(24);
        v1.add(1);
        v1.add(3);
        v1.add(234);
        v1.add(24);
        System.out.println(v1);
        System.out.println(v1.indexOf("Sravanthi"));//in returns the Index of that perticular element
        System.out.println(v1.lastIndexOf("Sravanthi"));//when the searching elements have more than one time it returns last index of that element
        System.out.println(v1.lastElement());
        System.out.println(v1.isEmpty());
        Object[] arr = v1.toArray();// converting vector to String
        System.out.println(Arrays.toString(arr));
    }
}