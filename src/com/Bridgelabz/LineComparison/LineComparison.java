package com.Bridgelabz.LineComparison;

public class LineComparison {
	public static void main(String[] args) {
		double lineLength1;
		double lineLength2;

		double x1 = (int) (Math.floor(Math.random() * 10));
		double x2 = (int) (Math.floor(Math.random() * 10));
		double y1 = (int) (Math.floor(Math.random() * 10));
		double y2 = (int) (Math.floor(Math.random() * 10));
		double x3 = (int) (Math.floor(Math.random() * 10));
		double x4 = (int) (Math.floor(Math.random() * 10));
		double y3 = (int) (Math.floor(Math.random() * 10));
		double y4 = (int) (Math.floor(Math.random() * 10));

		lineLength1 = (Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1))));
		lineLength2 = (Math.sqrt(((x4 - x3) * (x4 - x3)) + ((y4 - y3) * (y4 - y3))));

		System.out.println("Length of a Line 1 is : " + lineLength1);
		System.out.println("Length of a Line 2 is : " + lineLength2);
		Double line1 = new Double(lineLength1);
		Double line2 = new Double(lineLength2);
		// checking Equality of length
		boolean equal = line1.equals(line2);
		if (equal)
			System.out.println("Lines are Equal");
		else
			System.out.println("Lines are Not Equal");

		// Compare the length
		int compare = line1.compareTo(line2);
		if (compare == 0)
			System.out.println("Lines are Equal");
		else if (compare > 0)
			System.out.println("Line 1 is Greater than Line 2");
		else
			System.out.println("Line 1 is Less than Line 2");
	}
}
