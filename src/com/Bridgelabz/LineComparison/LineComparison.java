package com.Bridgelabz.LineComparison;

import com.Bridgelabz.LineComparison.Coordinates.Cordinates;
import com.Bridgelabz.LineComparison.Line.Line;

public class LineComparison {
	public static void main(String[] args) {

		int x1 = (int) (Math.random() * 10);
		int x2 = (int) (Math.random() * 10);
		int y1 = (int) (Math.random() * 10);
		int y2 = (int) (Math.random() * 10);
		int x3 = (int) (Math.random() * 10);
		int x4 = (int) (Math.random() * 10);
		int y3 = (int) (Math.random() * 10);
		int y4 = (int) (Math.random() * 10);

		Cordinates line1 = new Cordinates(x1, y1);
		Cordinates line2 = new Cordinates(x2, y2);
		Cordinates line3 = new Cordinates(x3, y3);
		Cordinates line4 = new Cordinates(x4, y4);
		Line firstLine = new Line(line1, line2);
		Line SecondLine = new Line(line3, line4);

		System.out.println("Length of a Line 1 is : " + firstLine.length);
		System.out.println("Length of a Line 2 is : " + SecondLine.length);
		
		// checking Equality of length
		boolean equal = firstLine.equals(SecondLine);
		if (equal)
			System.out.println("Lines are Equal");
		else
			System.out.println("Lines are Not Equal");
		// Compare the length
		int compare = firstLine.compareTo(SecondLine);
		if (compare == 0)
			System.out.println("Lines are equal");
		else if (compare == -1)
			System.out.println("Line 1 is Smaller than Line 2");
		else
			System.out.println("Line 1 is Greater than Line 2");

	}
}
