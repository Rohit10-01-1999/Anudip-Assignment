
public class ShapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(3, 4);

        System.out.println("Area of circle is: " + circle.calculateArea());
        System.out.println("Area of rectangle is: " + rectangle.calculateArea());
	}

}
