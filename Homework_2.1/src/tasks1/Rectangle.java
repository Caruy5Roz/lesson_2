package tasks1;

public class Rectangle {

	private int length;
	private int width;
	
	public Rectangle() {
        this.length = 3;
        this.width = 5;
    }

    public Rectangle(int l, int w) {
        this.length = l;
        this.width = w;
    }

    public double FindArea() {
        return length*width;
    }

    public double FindPerim() {
        return length*2 + width*2;
    }   
}

