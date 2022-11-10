package java8;

import java8.announcement.Announcement;
import java8.devices.Laptop;
import java8.devices.Phone;
import java8.home.Home;
import java8.transport.Airplane;
import java8.transport.Car;
import java8.transport.Helicopter;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner1=new Scanner(System.in);
        Scanner scanner2=new Scanner(System.in);

        Laptop laptop1=new Laptop("Mac book","Mac laptop",90000,"For programming","Mac OS");
        Laptop laptop2=new Laptop("Asus","Asus laptop",70000,"Gaming laptop","Windows 10 pro");
        Laptop[]laptops={laptop1,laptop2};

        Phone phone1=new Phone("Iphone 11 pro max","Iphone",70000,"for playing","Apple",32);
        Phone phone2=new Phone("Xiaomi Redmi Note 10 Pro","Xiaomi",55000,"Cool","Xiaomi",64);
        Phone[]phones={phone1,phone2};

        Home home1=new Home("Star Home",4);
        Home home2=new Home("Elite House",6);
        Home[] homes={home1,home2};

        Airplane airplane1=new Airplane("white",LocalDate.of(2009,11,4));
        Airplane airplane2=new Airplane("red",LocalDate.of(2012,3,5));

        Car car1=new Car("BMV",LocalDate.of(2004,5,8));
        Car car2=new Car("Toyota",LocalDate.of(2010,12,1));
        Car[] cars={car1,car2};

        Helicopter helicopter1=new Helicopter("ABC",LocalDate.of(2022,1,1));
        Helicopter helicopter2=new Helicopter("Fly VT",LocalDate.of(2021,1,1));
        Helicopter[] helicopters={helicopter1,helicopter2};

        System.out.println("Write price");
        int scan= scanner1.nextInt();
        findByPrice(scan,phones,laptops, homes,cars,helicopters);
        System.out.println("Write name");
        String sc= scanner2.nextLine();
        Announcement.findByName(sc,phones,laptops,homes,cars,helicopters);
    }

    public static void findByPrice(int price ,Phone[]phones,Laptop[]laptops,Home[]homes,Car[]cars,Helicopter[]helicopters){
        for (Phone phone : phones) {
            if (phone.getPrice()==price){
                System.out.println(phone);
            }
        }
        for (Laptop laptop : laptops) {
            if (laptop.getPrice()==price){
                System.out.println(laptop);
            }
        }
        for (Home home : homes) {
            if (home.equals(price)){
                System.out.println(home);
            }
        }
        for (Car car : cars) {
            if (car.equals(price)) {
                System.out.println(car);

            }
        }
        for (Helicopter helicopter : helicopters) {
            if (helicopter.equals(price)) {
                System.out.println(helicopter);

            }
        }
    }
}