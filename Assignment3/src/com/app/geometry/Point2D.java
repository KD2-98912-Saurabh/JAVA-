package com.app.geometry;

public class Point2D {
private int x;
private int y;

public Point2D(int x,int y) {
	this.x=x;
	this.y=y;
}

public String getDetails() {
	return "point("+x+","+y+")";
	
}

public boolean isEquals(Point2D otherPoint) {
	return this.x==otherPoint.x && this.y==otherPoint.y;	
}


public double calculateDistance(Point2D otherPoint) {
	int xDiff=this.x-otherPoint.x;
	int yDiff=this.y-otherPoint.y;
	
return Math.sqrt(
		Math.pow(xDiff, 2)+Math.pow(yDiff, 2)
		);
		
}


}
