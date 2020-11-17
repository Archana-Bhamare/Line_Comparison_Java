package com.Bridgelabz.LineComparison;

public class LineComparison {
	public static void main(String[] args) {
		double lineLength = 0;

		double x1 = (int) (Math.floor(Math.random() * 10));
		double x2 = (int) (Math.floor(Math.random() * 10));
		double y1 = (int) (Math.floor(Math.random() * 10));
		double y2 = (int) (Math.floor(Math.random() * 10));

		lineLength = (Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1))));

		System.out.println("Length of a line is : " + lineLength);

	}
}
