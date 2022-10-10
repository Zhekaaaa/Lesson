package OOP;

public class Cars {
    String name;
    int speed;

    Cars(){
    }

   Cars(String name,int speed){
       this.name=name;
       this.speed=speed;
   }
  public void showInfo(){
       System.out.println("Имя машины:"+name);
   }
   public void speedInfo(){
       System.out.println("Скорость машины:"+speed);
   }
}
