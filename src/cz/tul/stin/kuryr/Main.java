package cz.tul.stin.kuryr;

import cz.tul.stin.kuryr.delivery.Delivery;
import cz.tul.stin.kuryr.shipping.AirDelivery;
import cz.tul.stin.kuryr.shipping.BikeDelivery;
import cz.tul.stin.kuryr.shipping.TruckDelivery;

public class Main {
    public static void main(String[] args) {
        Delivery d1 = new Delivery("A123",10,new TruckDelivery());
        System.out.println("Truck: "+d1.calculatePrice());
        Delivery d2 = new Delivery("A233",10,new AirDelivery());
        System.out.println("AirDelivery: "+d2.calculatePrice());
        Delivery d3 = new Delivery("A313",5,new BikeDelivery());
        System.out.println("Bike: "+d3.calculatePrice());
    }
}
