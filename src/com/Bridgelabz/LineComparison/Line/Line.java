package com.Bridgelabz.LineComparison.Line;

import com.Bridgelabz.LineComparison.Coordinates.Cordinates;

public class Line {

	Cordinates x1, x2;
	public double length;

	public Line(Cordinates line1,Cordinates line2) {
		this.x1 = line1;
		this.x2 = line2;
		this.calculateLength();
	}

	public void calculateLength() {
		this.length = (Math.sqrt(((this.x2.xcordinate - this.x1.xcordinate) * (this.x2.xcordinate - this.x1.xcordinate))
				+ ((this.x2.ycordinate - this.x1.ycordinate) * (this.x2.ycordinate - this.x1.ycordinate))));
	}

	public int compareTo(Line obj) {
		if (this.length == obj.length) {
			return 0;
		} else if (this.length < obj.length) {
			return -1;
		} else
			return 1;
	}
}
