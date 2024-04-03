package com.utkarsh.tester;

import com.utkarsh.shapes.dim2.*;
import com.utkarsh.dim3.*;

public class test {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		c1.calculate_area(4);
		
		Rectangle r1 = new Rectangle();
		r1.rectangle_area(4,5);
		
		Box v1 = new Box();
		v1.calculate_box(4,3,4);

	}

}
