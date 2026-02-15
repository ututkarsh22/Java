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

    boolean setMarks(int marks)
    {
        if(marks < 0 || marks > 100)
        {
            return false;
        }
        else{
            this.marks = marks;
            System.out.println("marks updated");
            return true;
        }
    }
    void setName(String name)
    {
        this.name = name;
        System.out.println("Name update");
    }

    String getName(){
        return name;
    }

    boolean isPassed(){
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
        int marks = sc.nextInt();
        // String name = sc.nextLine();
        // String className = sc.nextLine();
        
        // System.out.println("outside name " + name);
        // System.out.println("outside classname " + className);
        
        // Constructor st = new Constructor("Bruclee" , "BTech Cse");
        // st.details();
        
        Encapsulation en = new Encapsulation();
        en.setName("Pinky");
        boolean right = en.setMarks(marks);
        if(!right)
            {
                System.out.println("Marks are invalid");
                sc.close();
                return ; 
        }
        System.out.println(en.getName());
        Boolean isPassed = en.isPassed();
        System.out.println("Student Passed " + isPassed);
        sc.close();
    }
}