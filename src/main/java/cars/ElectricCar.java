package cars;

import components.CarEngine;
import components.Navigation;
import components.Stereo;
import components.Tyres;

public class ElectricCar extends Car {
    public ElectricCar(CarEngine engine, Tyres tyres, Stereo stereo, Navigation navigation, double price, String colour, int age) {
        super(engine, tyres, stereo, navigation, price, colour, age);
    }
}
