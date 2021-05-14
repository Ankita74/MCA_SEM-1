package org.gvp.dcs.shapes;

public class Cube
{
	private double length;
	public Cube()
	{
		length=0;
	}
	public Cube(double length)
	{
		this.length=length;
		
	}
	
	public double volume()
	{
		return length*length*length;
	}
}