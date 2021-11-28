package Figures;

import java.util.ArrayList;

public class Box extends Shape{

    private ArrayList<Shape> shapes = new ArrayList<>();
    private double available;

    public Box(double volume, double available) {
        super(volume);
        this.available = available;
    }

    public boolean add(Shape shape) {
        if (available >= shape.getVolume()) {
            shapes.add(shape);
            available -= shape.getVolume();
            System.out.println(available);
            return true;
        } else {
            return false;
        }
    }

}
