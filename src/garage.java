import java.util.ArrayList;

public class garage{
    String name;
    ArrayList<car> cars;

    public garage(String name){
        this.name= name;
        this.cars = new ArrayList<>();
    }

    public void addCar(car car1){
        cars.add(car1);
        System.out.println(car1.getBrand() + "added to " + name );
    }

    public void removeCar(String brand){
        boolean removed = cars.removeIf(car1->car1.getBrand().equalsIgnoreCase(brand));
        if (removed) {
            System.out.println(brand + " removed from " + name);
        } else {
            System.out.println(brand + " not found in " + name);
        }
    }

    public void showCars(){
        for(car c: cars){
            c.displayInfo();
            System.out.println("name : " +name);
        }
    }
}