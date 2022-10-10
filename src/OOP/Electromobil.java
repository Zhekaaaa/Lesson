package OOP;

public class Electromobil extends Cart{
    int zarad;
   Electromobil(){
   }
    Electromobil(String name,int speed,int id,int zarad){
        super(name,speed,id);
        this.zarad=zarad;

    }
    void zaradInfo(){
        System.out.println("Заряд електромашины составляет:"+zarad+"%");
    }
}
