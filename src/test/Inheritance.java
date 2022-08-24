package test;

 {public class Circle2 {
	  public double radius;

	  public Circle2(double r) {
	  radius = r;
	  }

	  public double circle2Area() {
	      return Math.PI * radius * radius;
	  }

	  public double circleCirumference() {
	      return Math.PI * 2 * radius;
	  }
}
}
public class Cylinder extends Circle2 {
	  public Circle base;
	  public double height;

	  public Cylinder(double r, double h) {
	    height = h;
	    base = new Circle2(r);
	      }

	  public double getVolume() {
	    return base.circle2Area * height;
	  }


