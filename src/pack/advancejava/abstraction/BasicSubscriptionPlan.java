package pack.advancejava.abstraction;

public class BasicSubscriptionPlan extends AbstractSubscription{

    public String subscriptionName(){
        String name = "Basic";
        return name;
    }

    public String subscriptionDesc(){
        String description = "1. Description One\n2. Description Two\n3. Description Three";
        return description;
    }

    public float subscriptionRatePerMonth(){
        float rate = 10.00f;
        return rate;
    }

    public float subscriptionRatePerTwoMonths(){
        float rate = 15.00f;
        return rate;
    }

    public float subscriptionRatePerSixMonths(){
        float rate = 40.00f;
        return rate;
    }

    public float subscriptionRatePerYear(){
        float rate = 75.00f;
        return rate;
    }

}
