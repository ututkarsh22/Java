import java.util.*;

// class Animal{
//     void sound(){
//         System.out.println("Animal making sound");
//     }
// }

// class Dog extends Animal{
//     @Override
//     void sound(){
//         System.out.println("Dog starts barking");
//     }
// }

// class Cat extends Animal{
//     @Override
//     void sound(){
//         System.out.println("Cat making sound MEOW");
//     }
// }

class Payment{
    void pay(){
        System.out.println("Payemnt with which cards");
    }
}

class Visa extends Payment{
    void pay(){
        System.out.println("Payment is going by Visa");
    }
}

class Rupay extends Payment{
    void pay(){
        System.out.println("Payment is going by Rupay");
    }
}

class MasterCard extends Payment{
    void pay(){
        System.out.println("Payment is going by MasterCard");
    }
}



public class Poly {
    public static String debug(String pay){
        String newPay = pay.trim().toLowerCase();
        return newPay;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Animal d = new Dog();
        d.sound();
        Animal c = new Cat();
        c.sound();

        String paymentType = sc.nextLine();
        String payment = debug(paymentType);
        System.out.println(payment);
        switch(payment){
            case "visa" : {
                Payment p = new Visa();
                p.pay();
                break;
            }
            case "rupay" : {
                Payment p = new Rupay();
                p.pay();
                break;
            }
            case "mastercard":{
                Payment p = new MasterCard();
                p.pay();
                break; 
            }
            default : {
                System.out.println("please type valid payment option");
                break;
            }
        }   
        sc.close();

    }
}
