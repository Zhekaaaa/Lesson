package OOP;

public class Cars implements Info {
    String name;
    int speed;

    Cars(){
    }

   Cars(String name,int speed){
       this.name=name;
       this.speed=speed;
   }

    @Override
    public void showInfo() {
        System.out.println("Имя машины:"+name+" "+"Скорость машины:"+speed);
    }
}
