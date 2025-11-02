

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

    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand){
        this.brand= brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if(speed <0){
            System.out.println("Speed cant be negative");
        }
        this.speed = speed;
    }
}