import java.awt.Point;

public class Circle {
Point  center;
private double radius;
public double getRadius() {
	return radius;
}
public void setRadius(double radius) {
	this.radius=(radius>=0)?radius:0;
}

private static int numofCircles;
public static int getNumofCicles() {
	return numofCircles;
}

Circle(){
	numofCircles++;
}
Circle(Point initialCenter, double initialRadius){
	center=initialCenter;
	radius=initialRadius;
	numofCircles++;
}
double getPerimeter() {
	return 2*Math.PI*radius;
}
double getArea() {
	return Math.PI*radius*radius;
}
void setCenter(Point newCenter) {
	this.center=newCenter;
}
void setRadius1(double newRadius) {
	this.radius=newRadius;
}
 private static int x;
 public int getx() {
	 return x;
 }
 public void setx(int x) {
	 this.x=x;
 }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
}
