package com.tns.ifet.day15userdefinedobjects.comparableandcomparator;

public class Point {
	float x,y;
	Point()
	{}
	Point(float x, float y)
	{
		this.x=x;
		this.y=y;
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";

}
}