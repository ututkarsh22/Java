import java.util.*;

interface Camera{
    void click();
    static void defa(){
        System.out.println("this is a static function");
    }
}
interface Music{
    void play();
}

class Phone implements Camera, Music{

    public void play(){
        System.out.println("Playing music in the phone");
    }
    public void click(){
        System.out.println("Clicking the photo with Phone");
    }
}

class DSLR implements Camera, Music{
    public void click(){
        System.out.println("Clicking photo with the DSLR");
    }
    public void play(){
        System.out.println("DSLR is not able to play music");
    }
}
class InterFace{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String c = sc.nextLine();
        String choice = c.trim().toLowerCase();

        
        if(choice.equals("phone"))
        {
            Phone p = new Phone();
            p.play();
            p.click();
            // p.defa();//it will not work as it is the static function
            Camera.defa();
        }
        else if(choice.equals("dslr"))
        {
            DSLR d = new DSLR();
            d.play();
            d.click();
            // d.defa();//not work
            // Music.defa();is also not work because music didnt have any function like defa;
            Camera.defa();
        }
        else{
            System.out.println("Please choice something specific in Phone and Camera");
        }

        sc.close();

    }
} 