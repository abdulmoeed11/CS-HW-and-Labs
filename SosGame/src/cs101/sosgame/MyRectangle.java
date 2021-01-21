package cs101.sosgame;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;

public class MyRectangle extends Rectangle {

	//properties
	//adding these 2 properties to the Rectangle Class
	private int row;
	private int column;
	
	public MyRectangle() {
		// TODO Auto-generated constructor stub
		super();
	}
	/**
	 * sets rows to y
	 * @param y
	 */
	public void setRow(int y) {
		row = y;
	}
	
	/**
	 * sets columns to x
	 * @param x
	 */
	public void setColumn( int x ) {
		column = x; 
	}
	
	/**
	 * @return row Number
	 */
	public int getRow() {
		return row;
	}
	/**
	 * @return Column Number
	 */
	public int getColumn() {
		return column; 
	}
	
	/*
	 * All the following methods
	 * are default methods of Rectangle
	 */
	public MyRectangle(Rectangle r) {
		super(r);
		// TODO Auto-generated constructor stub
	}

	public MyRectangle(Point p) {
		super(p);
		// TODO Auto-generated constructor stub
	}

	public MyRectangle(Dimension d) {
		super(d);
		// TODO Auto-generated constructor stub
	}

	public MyRectangle(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	public MyRectangle(Point p, Dimension d) {
		super(p, d);
		// TODO Auto-generated constructor stub
	}

	public MyRectangle(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	}

}
