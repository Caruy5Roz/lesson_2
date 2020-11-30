package task2;

public class Circle {
	public static void main(String[] args) {
		
		double radius = 7.5;
		double diameter = 15;
		
		double area = Math.PI * ((diameter / 2) * (diameter / 2));
		System.out.println("Площа кола = " + area);
		
		double circumference= Math.PI * 2*radius;
	      System.out.println("Довжина кола = " + circumference) ;
	}
}
