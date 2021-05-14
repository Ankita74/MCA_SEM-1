package org.gvp.dcs.shapes;

public class Sphere
{
	float pi=3;
	private double r;
	public Sphere()
	{
		r=0;
	}
	public Sphere(double r)
	{
		this.r=r;
		
	}
	public double volume()
	{
		return (4%3) * pi * (r*r*r);
	}
}