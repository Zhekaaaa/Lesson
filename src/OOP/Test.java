package OOP;

public class Test{
    public static void main(String[] args) {
        Cart cart = new Cart("Mersedes",180,1);
        cart.showInfo();
        cart.idInfo();
        System.out.println();
        Electromobil electromobil= new Electromobil("Yamaha",185,15);
        electromobil.setZarad(91);
        electromobil.showInfo();
        electromobil.zaradInfo();
        electromobil.idInfo();
        System.out.println();
        Samosval samosval = new Samosval("Maz",60,3,2500);
        samosval.showInfo();
        samosval.idInfo();
        samosval.vesInfo();
    }

}
