package pack.advancejava.abstraction;

public class Subscription {
    public static void main(String[] args) {
        BasicSubscriptionPlan basicPlan = new BasicSubscriptionPlan();
        PlusSubscriptionPlan plusPlan = new PlusSubscriptionPlan();
        ProSubscriptionPlan proPlan = new ProSubscriptionPlan();

        System.out.println("***************************************");
        System.out.println("\t Subscription Plans");
        System.out.println("***************************************");

        // Basic Plan
        System.out.println("\n\t" + basicPlan.subscriptionName());
        System.out.println("***************************************");
        System.out.println("Description: \n" + basicPlan.subscriptionDesc());
        System.out.println("\nRate:" );
        System.out.println("$" + basicPlan.subscriptionRatePerMonth() + "/month");
        System.out.println("$" + basicPlan.subscriptionRatePerTwoMonths() + "/2 months");
        System.out.println("$" + basicPlan.subscriptionRatePerSixMonths() + "/6 months");
        System.out.println("$" + basicPlan.subscriptionRatePerYear() + "/year");
        System.out.println("***************************************");

        System.out.println("\n\t" + plusPlan.subscriptionName());
        System.out.println("***************************************");
        System.out.println("Description: \n" + plusPlan.subscriptionDesc());
        System.out.println("\nRate:" );
        System.out.println("$" + plusPlan.subscriptionRatePerMonth() + "/month");
        System.out.println("$" + plusPlan.subscriptionRatePerTwoMonths() + "/2 months");
        System.out.println("$" + plusPlan.subscriptionRatePerSixMonths() + "/6 months");
        System.out.println("$" + plusPlan.subscriptionRatePerYear() + "/year");
        System.out.println("***************************************");

        System.out.println("\n\t" + proPlan.subscriptionName());
        System.out.println("***************************************");
        System.out.println("Description: \n" + proPlan.subscriptionDesc());
        System.out.println("\nRate:" );
        System.out.println("$" + proPlan.subscriptionRatePerMonth() + "/month");
        System.out.println("$" + proPlan.subscriptionRatePerTwoMonths() + "/2 months");
        System.out.println("$" + proPlan.subscriptionRatePerSixMonths() + "/6 months");
        System.out.println("$" + proPlan.subscriptionRatePerYear() + "/year");
        System.out.println("***************************************");
    }
}
