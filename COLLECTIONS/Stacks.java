import java.util.Stack;
class Stacks{
public static void main(String args[]){
    Stack<String> books = new Stack<>();
    books.push("RED");
    books.push("White");
    books.push("Black");
    System.out.println("Using search methode:"+books.search("White"));
    System.out.println("Using indexOf methode:"+books.indexOf("White"));
    System.out.println(books.peek());
    System.out.println("After performing peek"+books);
    System.out.println(books.pop());
    System.out.println("After perfoeming pop"+books);
}
}