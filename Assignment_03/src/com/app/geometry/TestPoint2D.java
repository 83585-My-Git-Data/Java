package com.app.geometry;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPoint2D {
	public static void main(String[] args) {
		double x2;
		double y2;
		Point2D p1 = new Point2D(3,4);
		System.out.println(System.in);
		Scanner Sc = new Scanner(System.in);
		x2 = Sc.nextDouble();
		y2 = Sc.nextDouble();
		if(p1.isEqual(x2,y2)) {
			String s1 = p1.getDetails();
			System.out.println(s1);
		} 
		else {
			double result = p1.calculateDistance(x2, y2);
			System.out.println(result);
		}
	}
}
