package OOP;

public class Test {
    public static void main(String[] args) {
        Cars cars= new Cars("BMW",100);
        cars.showInfo();
        cars.speedInfo();
        System.out.println();
        Cart cart=new Cart("Mersedes",180,1);
        cart.idInfo();
        cart.showInfo();
        cart.speedInfo();
        System.out.println();
        Electromobil electromobil= new Electromobil("Yamaha",185,15,50);
        electromobil.showInfo();
        electromobil.speedInfo();
        electromobil.zaradInfo();
        electromobil.idInfo();
    }

}
