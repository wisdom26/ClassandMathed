class Students{
    // String name;
    // String rollnum;
    // int marks;

    String name="vi";
    int rollnum=0;
    int marks=0;
    public void display(){
        System.out.println(name+" "+rollnum+" "+marks);
    }
    public void display_name(){
        System.out.println(name);
    }
    public void display_roll(){
        System.out.println(rollnum);
    }
    public void display_mark(){
        System.out.println(marks);
    }
}

public class Classes {
    public static void main(String[] args) {
        Students a1=new Students();
        Students a2=new Students();
        // String name=a1.name;
        // String Roll=a1.rollnum;
        // int marks=a1.marks;
        a1.name="Vivek";
        a1.rollnum=1;
        a1.marks=340;
        a1.display();

        a2.name="Ajit";
        a2.rollnum=2;
        a2.marks=330;
        a2.display();
    }

  
}
