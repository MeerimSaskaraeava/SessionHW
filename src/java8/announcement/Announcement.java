package java8.announcement;

import java8.devices.Laptop;
import java8.devices.Phone;
import java8.home.Home;
import java8.transport.Car;
import java8.transport.Helicopter;

public class Announcement {
    private String name;
    private String image;
    private double price;
    private String description;

    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public Announcement(String name, String image, double price, String description) {
        this.name = name;
        this.image = image;
        this.price = price;
        this.description = description;


    }
    public static double maxPrice(double price1,double price2){

        return price1;
    }
    public static void findByName(String name , Phone[]phones, Laptop[]laptops, Home[]homes, Car[]cars, Helicopter[]helicopters){
        for (Phone phone : phones) {
            if (phone.getName().contentEquals(name)){
                System.out.println(phone.toString());
            }
        }
        for (Laptop laptop : laptops) {
            if (laptop.getName().contentEquals(name)){
                System.out.println(laptop.toString());
            }

        }
        for (Home home : homes) {
            if (home.equals(name)){
                System.out.println(home.getClass());
            }

        }
        for (Car car : cars) {
            if (car.equals(name)){
                System.out.println(car.getColour());
            }

        }
        for (Helicopter helicopter : helicopters) {
            if (helicopter.equals(name)){
                System.out.println(helicopter.getColour());
            }

        }}


        @Override
    public String toString() {
        return "Announcement{" +
                "name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
