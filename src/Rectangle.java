public class Rectangle {
    private double width;
    private double height;
    private int id;
    private static int idGen = 0;

    Rectangle() {
        this.width = 1.0;
        this.height = 1.0;
        this.id=idGen++;
    }
    public Rectangle(double width, double height) {
        this();
        setHeight(height);
        setWidth(width);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        if (width>0) {
            this.width = width;
        }
        else {
            throw new IllegalArgumentException();
        }
    }



    public void setHeight(double height) {
        if (width>0) {
            this.height = height;
        }
        else {
            throw new IllegalArgumentException();
        }

    }



    public double area() {
        return width*height;
    }
    public double perimeter() {
        return (width+height)*2;
    }

    @Override
    public String toString() {
        return "Rectangle:  \n" + "id= " + id + "\n" + "width= " + width + "\n" + "height= " + height + "\n";
    }

}

