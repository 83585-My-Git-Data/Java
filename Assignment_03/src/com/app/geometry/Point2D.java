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
	
	public Point2D() {
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
		return ("("+this.x1 + " , " + this.y1 + " )");
	}
	
			
	
	public boolean isEqual(double x2 , double y2) {
		return this.x1 == x2 && this.y1 == y2 ? true : false;
			}
		public double calculateDistance(Point2D point) {
			double dx = this.x1 - x1;
			double dy = this.y1 - y1;
			return Math.sqrt(Math.pow(dx,2) + Math.pow(dy,2));
		}
		
		public void accept() {
			System.out.println("Enter the 1st Point : ");
			x1 = sc.nextInt();
			
			System.out.println("Enter the 2nd Point : ");
			y1 = sc.nextInt();
			
		}
		
	}





