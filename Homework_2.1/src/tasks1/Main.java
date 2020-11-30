package tasks1;

public class Main {

	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle(3, 10);
		
	    double rectangleArea = rectangle .FindArea();
	    System.out.println("Площа прямокутника = " + rectangleArea);
	    System.out.println();

	    double rectanglePermiter = rectangle.FindPerim();
	    System.out.println("Периметр прямокутника =  " + rectanglePermiter);
	}
}
