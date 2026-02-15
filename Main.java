import java.util.Scanner;

// class Constructor{

//     String name;
//     String className;

//     Constructor(String name, String clssname){
//         this.name = name;
//         className = clssname;
//     }

//     public void details(){
//         System.out.println("name " + name);
//         System.out.println("class " + className);

//     }
// }

class Encapsulation{

    private String name;
    private int marks;

    Encapsulation(){
        System.out.println("Working constructor");

    }

    void setMarks(int marks)
    {
        this.marks = marks;
        System.out.println("marks updated");
    }
    void setName(String name)
    {
        this.name = name;
        System.out.println("Name update");
    }

    String getName(){
        return name;
    }

    Boolean isPassed(){
        if(marks >= 33)
        {
            return true;
        }
        else
            return false;
    }
}

public class Main{
    public static void main(String[] args)
    {
        System.out.println("Hello bussy");
        Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // String className = sc.nextLine();

        // System.out.println("outside name " + name);
        // System.out.println("outside classname " + className);
        
        // Constructor st = new Constructor("Bruclee" , "BTech Cse");
        // st.details();

        Encapsulation en = new Encapsulation();
        en.setName("Pinky");
        en.setMarks(20);
        System.out.println(en.getName());
        Boolean isPassed = en.isPassed();
        System.out.println("Student Passed " + isPassed);
        sc.close();
    }
}