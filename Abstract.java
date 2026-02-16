abstract class Payment{
    abstract void pay();

    void recipt(){
        System.out.println("Recipt is printing");
    }
}

class Visa extends Payment{

    void pay(){
        System.out.println("paying with visa");
    };
}

class Rupay extends Payment{
    void pay(){
        System.out.println("paying with rupay");
    }
}
class Abstract {
   public static void main(String[] args){

    Payment p = new Visa();
    Payment r = new Rupay();

    p.pay();
    r.pay();
    p.recipt();
   }
}
