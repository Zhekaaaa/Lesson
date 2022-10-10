package OOP;

public class Cart extends Cars implements Info{
    int id;
   Cart(){

   }
    Cart(String name,int speed,int id){
        super(name,speed);
        this.id=id;
    }

    @Override
    public void showInfo() {
        System.out.println("Имя машины:"+name+" "+"Скорость машины:"+speed);
    }

    void idInfo(){
        System.out.println("Номер машины:"+id);
    }
}
