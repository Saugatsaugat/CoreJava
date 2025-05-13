package pack.corejava.classdemo;

public class Rectangle {
    int length;
    int breadth;

    public void getData(int x, int y){
        length = x;
        breadth = y;
    }

    public int getArea(){
        return length * breadth;
    }

    public static void main(String[] args){
        Rectangle obj1 = new Rectangle();
        obj1.getData(4, 2);
        int area = obj1.getArea();
        System.out.println("The area of the rectangle is " + area);
    }
}

