

public class car{

    String brand;
    String color;
    int speed;


    public car(String brand, String color, int speed){
        this.brand = brand;
        this.color = color;
        this.speed = 0;
    }
    
    public void start(){
        System.out.println(brand + " " + color + "is starting.");
    }

    public void accelerate(int increment){
        speed += increment;
        System.out.println("accelerated to " + speed);
    }

    public void brake(){
        speed =0;
        System.out.println("car Stooped with speed of " + speed);
    }

    public void displayInfo(){
        System.out.println(" ******* car info ************ ");
        System.out.println("brand: " + brand);
        System.out.println("color: " + color);
        System.out.println("speed : " + speed + "km/h");
    }
}