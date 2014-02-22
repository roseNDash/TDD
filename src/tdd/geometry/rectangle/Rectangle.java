package tdd.geometry.rectangle;

public class Rectangle {

    public Rectangle(int length, int breadth) {
        if (length == 0 || breadth == 0) {
            throw new IllegalArgumentException("Zero cant be passed as argument");
        }
    }

    public void area() {
        // TODO Auto-generated method stub

    }

}
