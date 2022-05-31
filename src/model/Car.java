package model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Car{
   private Wheel wheel;
   private Engine engine;

   public Car(){}

    public Car(Wheel wheel, Engine engine){
       this.wheel = wheel;
       this.engine = engine;
    }
    public String toString(){
       return "Engine: " + this.engine.getProductCode() + " ; " + "Wheel: " + this.wheel.getProductCode();
    }
}
