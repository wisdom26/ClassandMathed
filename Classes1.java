class math{
  public int add1(int a,int b){
    return a+b;
  }
  public int multi(int a,int b){
    return a*b;
  }
}





public class Classes1 {
  public static void main(String[] args) {
    math a1=new math();
    int x=4;
    int y=8;
    int z=a1.add1(x,y);
    System.out.println(z);
  }  
}
