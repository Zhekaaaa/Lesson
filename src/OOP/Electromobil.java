package OOP;

public class Electromobil extends Cart implements Info{
    private int zarad;
   Electromobil(){
   }
    Electromobil(String name,int speed,int id){
        super(name,speed,id);

    }
    public void setZarad(int userZarad){
    zarad=userZarad;
    }
    public int getZarad(){
       return zarad;
    }

    @Override
    public void showInfo() {
        System.out.println("Имя машины:"+name+" "+"Скорость машины:"+speed);
    }

    void zaradInfo(){
        System.out.println("Заряд електромашины составляет:"+zarad+"%");
    }
}
