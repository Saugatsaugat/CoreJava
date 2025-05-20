package pack.advancejava.abstraction;

public class PlusSubscriptionPlan extends AbstractSubscription{
    public String subscriptionName(){
        String name = "Plus";
        return name;
    }

    public String subscriptionDesc(){
        String description = "1. Description One\n2. Description Two\n3. Description Three";
        return description;
    }

    public float subscriptionRatePerMonth(){
        float rate = 15.00f;
        return rate;
    }

    public float subscriptionRatePerTwoMonths(){
        float rate = 25.00f;
        return rate;
    }

    public float subscriptionRatePerSixMonths(){
        float rate = 50.00f;
        return rate;
    }

    public float subscriptionRatePerYear(){
        float rate = 90.00f;
        return rate;
    }

}
