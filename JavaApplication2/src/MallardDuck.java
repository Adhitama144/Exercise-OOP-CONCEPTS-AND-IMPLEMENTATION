public class MallardDuck extends Duck {
    public MallardDuck() {
        // Panggil konstruktor kelas induk
        super();
        
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings(); // Menggunakan setFlyBehavior
    }
    
    public void display(){
        System.out.println("I'm a real Mallard duck");
    }
}
