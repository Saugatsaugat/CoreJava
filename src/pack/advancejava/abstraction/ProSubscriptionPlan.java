package pack.advancejava.abstraction;

public class ProSubscriptionPlan extends AbstractSubscription{
    public String subscriptionName(){
        String name = "Pro";
        return name;
    }

    public String subscriptionDesc(){
        String description = "1. Description One\n2. Description Two\n3. Description Three";
        return description;
    }

    public float subscriptionRatePerMonth(){
        float rate = 20.00f;
        return rate;
    }

    public float subscriptionRatePerTwoMonths(){
        float rate = 35.00f;
        return rate;
    }

    public float subscriptionRatePerSixMonths(){
        float rate = 70.00f;
        return rate;
    }

    public float subscriptionRatePerYear(){
        float rate = 120.00f;
        return rate;
    }

}
