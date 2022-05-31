package service.impl;

import model.Car;
import model.Engine;
import model.Wheel;
import service.ClassifyService;

import java.util.Scanner;

public class Menu {
    private final ClassifyService classifyService = new ClassifyServiceImpl();
    public void Layout(){
        Scanner sc = new Scanner(System.in);
        Wheel wheel = new Wheel();
        Engine engine = new Engine();
        System.out.println("enter engine product code: ");
        engine.setProductCode(sc.nextLine());
        System.out.println("enter wheel product code: ");
        wheel.setProductCode(sc.nextLine());
        Car car = new Car(wheel, engine);
        System.out.println(car.toString());
        System.out.println("TYPE: " + classifyService.classifyCar(car));
    }
}
