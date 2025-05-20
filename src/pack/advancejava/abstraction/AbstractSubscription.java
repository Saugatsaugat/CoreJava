package pack.advancejava.abstraction;

import java.io.Serializable;

abstract class AbstractSubscription implements Serializable {
    public void display(){
        System.out.println("This is abstract subscription class");
    }

    abstract String subscriptionName();
    abstract String subscriptionDesc();
    abstract float subscriptionRatePerMonth();
    abstract float subscriptionRatePerTwoMonths();
    abstract float subscriptionRatePerSixMonths();
    abstract float subscriptionRatePerYear();
}
