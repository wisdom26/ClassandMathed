public class Method {
    static void hello(){
        System.out.println("hello");
        
    }
    static String hi(){
        // System.out.println("hello");
        return ("hello");
    }
    static  int hey(){
        // System.out.println("hello");
        return (122);
    }

public static void main(String[] args) {
    // int a=10;
    // int b=30;
    // int c=a+b;
    // System.out.println(c);
    hello();
    hi();
    hey();
    String d=hi();
    System.out.println(d);
    int e=hey();
    System.out.println(e);
}
}
