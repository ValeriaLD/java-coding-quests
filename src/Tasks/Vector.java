package Tasks;

import java.util.Arrays;

public class Vector {

    private double x;
    private double y;
    private double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double vectorLength() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public double vectorScalar(Vector vector) {
        return x * vector.x + y * vector.y + z + vector.z;
    }

    public Vector vectorDesign(Vector vector) {
        return new Vector(
            y * vector.z - z * vector.y,
            z * vector.x - x * vector.z,
            x * vector.y - y * vector.x
        );
    }
    public String toString() {
        return x + " " + y + " " + z;
    }

    public double vectorCos(Vector vector) {
        return vectorScalar(vector) / (vectorLength() * vector.vectorLength());
    }

    public Vector add(Vector vector) {
        return new Vector(
                x + vector.x,
                y + vector.y,
                z + vector.z
        );
    }
    public Vector sub(Vector vector) {
        return new Vector(
                x - vector.x,
                y - vector.y,
                z - vector.z
        );
    }

    public static Vector[] generate(int n) {
        Vector[] vectors = new Vector[n];
        for(int i = 0; i < vectors.length; i++) {
            vectors[i] = new Vector(Math.random(), Math.random(), Math.random());
        }
        return vectors;
    }
    public static void main(String[] args) {
        Vector vec1 = new Vector(2, 5, 3);
        Vector vec2 = new Vector(5, 2, 6);
        System.out.println("The vector length is " + vec1.vectorLength());
        System.out.println("Scalar vector is: " + vec1.vectorScalar(vec2));
        System.out.println("Vector design is: " + vec1.vectorDesign(vec2).toString());
        System.out.println("Cos from 2 vector is: " + vec1.vectorCos(vec2));
        System.out.println("Vector's sum is: " + vec1.add(vec2).toString());
        System.out.println("Vector's difference is': " + vec1.sub(vec2).toString());
        Vector[] vectors = Vector.generate(3);
        System.out.println("Vector's Array is: " + Arrays.toString(vectors));
    }
}
