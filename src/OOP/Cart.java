package OOP;

public class Cart extends Cars{
    int id;
   Cart(){

   }
    Cart(String name,int speed,int id){
        super(name,speed);
        this.id=id;
    }
    void idInfo(){
        System.out.println("Номер машины:"+id);
    }
}
