package com.app.geometry;

import java.util.Scanner;
import java.lang.Math;

public class Point2D {
	private double x1;
	private double y1;
//	private int x2;
//	private int y2;

	public Point2D(double x1 , double y1) {
		this.x1 = x1;
		this.y1 = y1;
	}
	

	public double getX1() {
		return x1;
	}

	public void setX1(double x1) {
		this.x1 = x1;
	}

	public double getY1() {
		return y1;
	}

	public void setY1(double y1) {
		this.y1 = y1;
	}



	Scanner sc = new Scanner(System.in);


	
	public String getDetails() {
		return (x1 +" " + y1 + " ");
	}
	
			
	
	public boolean isEqual(double x2 , double y2) {
		return this.x1 == x2 && this.y1 == y2 ? true : false;
			}
		public double calculateDistance(double x2, double y2) {
			double dx = this.x1 - x2;
			double dy = this.y1 - y2;
			return Math.sqrt(Math.pow(dx,2) + Math.pow(dy,2));
		}
	}





