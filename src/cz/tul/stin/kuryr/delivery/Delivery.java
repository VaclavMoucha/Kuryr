package cz.tul.stin.kuryr.delivery;

import cz.tul.stin.kuryr.shipping.ShippingMethod;

public class Delivery {
    private String trackingNubmer;
    private double weight;
    private ShippingMethod shippingMethod;
    public Delivery(String trackingNubmer, double weight, ShippingMethod shippingMethod){
        this.trackingNubmer=trackingNubmer;
        this.weight=weight;
        this.shippingMethod=shippingMethod;
    }
    public double calculatePrice(){
        return shippingMethod.calculateCost(this.weight);
    }
}
