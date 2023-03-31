package ch07;

public class ShapeTest {
    public static void main(String[] args) {
        Shape s1 = new Rectangle();
        Rectangle r1 = new Rectangle();

        s1.setX(5);
        s1.setY(12);
        // s.width = 0;
        // s.height = 0;

        Shape s2;
        Rectangle r2;

        s2 = new Rectangle();
        r2 = (Rectangle)s2;
        r2.setWidth(100);
        r2.setHeight(100);

        Shape[] shapes = new Shape[4];
        Shape s4 = new Shape();

        shapes[0] = s4;
        shapes[1] = s4;
        shapes[2] = s4;
        shapes[3] = s4;

        drawShapes(shapes);
    }

    public static void drawShapes(Shape[] shapes) {
        for (Shape s : shapes) {
            s.draw();
        }
    }
}

class Triangle extends Shape {
    private int width, height;

    public void draw() {
        System.out.println("Triangle Draw [" + width + ", " + height + "]");
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

class Circle extends Shape {
    private int radius;

    @Override
    public void draw() {
        System.out.println("Triangle Draw [" + radius + "]");
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}

class Polygon  extends Shape {

    @Override
    public void draw() {
        System.out.println("다각형을 그립니다.");
    }
}