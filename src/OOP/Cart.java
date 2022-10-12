package OOP;

import java.util.Objects;

public class Cart extends Cars implements Info{
    int id;
    String s;
   Cart(){

   }
    Cart(String name,int speed,int id,String s){
        super(name,speed);
        this.id=id;
        this.s=s;
    }

    @Override
    public void showInfo() {
        System.out.println("Имя машины:"+name+" "+"Скорость машины:"+speed);
    }

    void idInfo(){
        System.out.println("Номер машины:"+id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cart cart = (Cart) o;
        return id == cart.id && Objects.equals(s, cart.s);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, s);
    }

    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
                ", s='" + s + '\'' +
                '}';
    }
}
