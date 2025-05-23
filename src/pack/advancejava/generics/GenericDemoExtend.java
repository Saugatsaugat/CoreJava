package pack.advancejava.generics;

class CalculateMean<T extends Number>{
    private T[] numbers;

    CalculateMean(T[] numbers){
        this.numbers = numbers;
    }

    double sum = 0;
    public double getMean(){
       for ( T number : numbers){
           sum += number.doubleValue();
       }
       return sum/numbers.length;
    }
}

public class GenericDemoExtend {
    public static void main(String[] args){
        CalculateMean<Integer> c = new CalculateMean<>(new Integer[]{1, 2,3, 4,5});
        System.out.println("Mean is : " + c.getMean());
    }
}
