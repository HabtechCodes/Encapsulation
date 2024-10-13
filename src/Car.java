import java.util.Scanner;

public class Car {
    private boolean engine;
    private final int cylinders;
    private final String name;
    private int wheels;
    private static Scanner scanner;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        scanner = new Scanner(System.in);
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
//    public void Drive(Object object) {
//
//        if(object instanceof Holden h) {
//            String s = scanner.nextLine();
//            switch (s.toUpperCase().charAt(0)){
//                case 'H' -> new Holden(6,"gt");
//            }
//        }
//    }

    public String startEngine() {
        return getClass().getSimpleName() + " -> start engine()";
    }
    public String accelerate() {
        return getClass().getSimpleName() + " -> accelerate()";
    }
    public String brake() {
        return getClass().getSimpleName() + " -> brake()";
    }

    public static Car getInstance(String type) {
        return switch (type.toUpperCase().charAt(0)) {
            case 'H' -> new Holden(6,"gt5");
            case 'F' -> new Ford(8,"gt6");
            default -> new Car(5,"Car");
        };
    }

}
class Main1 {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        while(true) {
//            System.out.println("Enter a car, enter q to quit");
//            String string = scanner.nextLine();
//
//            if ("Qq".contains(string)) {
//                break;
//            }
//            Car car = Car.getInstance(string);
//
//            System.out.println(car.startEngine());
//        }

//        Car car = new Car(8, "Base car");
//        System.out.println(car.startEngine());
//        System.out.println(car.accelerate());
//        System.out.println(car.brake());
//
//        Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
//        System.out.println(mitsubishi.startEngine());
//        System.out.println(mitsubishi.accelerate());
//        System.out.println(mitsubishi.brake());
//
//        Ford ford = new Ford(6, "Ford Falcon");
//        System.out.println(ford.startEngine());
//        System.out.println(ford.accelerate());
//        System.out.println(ford.brake());
//
//        Holden holden = new Holden(6, "Holden Commodore");
//        System.out.println(holden.startEngine());
//        System.out.println(holden.accelerate());
//        System.out.println(holden.brake());
//


    }

}
