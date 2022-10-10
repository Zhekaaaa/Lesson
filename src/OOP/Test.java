package OOP;

public class Test{
    public static void main(String[] args) {
        Cars cars= new Cars("BMW",100);
        cars.showInfo();
        System.out.println();
        Cart cart = new Cart("Mersedes",180,1);
        cart.showInfo();
        cart.idInfo();
        System.out.println();
        Electromobil electromobil= new Electromobil("Yamaha",185,15);
        electromobil.setZarad(91);
        electromobil.showInfo();
        electromobil.zaradInfo();
        electromobil.idInfo();
    }

}
