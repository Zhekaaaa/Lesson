package OOP;

public class Samosval extends Electromobil {
    int ves;
    Samosval(){
    }
    Samosval(String name,int speed,int id,int ves){
        super(name,speed,id);
        this.ves=ves;
    }
    void vesInfo(){
        System.out.println("Вес самосвала равен:"+ves+"КГ");
    }
}
