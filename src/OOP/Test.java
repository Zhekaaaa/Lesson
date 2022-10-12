package OOP;

public class Test{
    public static void main(String[] args) {
        Cart cart = new Cart("Mersedes",180,1,"Черный");
        Cart cart1 = new Cart("Insignia",100,3,"Борный");
        cart.showInfo();
        cart.idInfo();
        System.out.println(cart.hashCode());
        System.out.println(cart.equals(cart1));
        System.out.println(cart.toString());
        System.out.println();
        Electromobil electromobil= new Electromobil("Yamaha",185,15,"Белая");
        electromobil.setZarad(91);
        electromobil.showInfo();
        electromobil.zaradInfo();
        electromobil.idInfo();
        System.out.println();
        Samosval samosval = new Samosval("Maz",60,3,"Красная",2300);
        samosval.showInfo();
        samosval.idInfo();
        samosval.vesInfo();
    }

}
