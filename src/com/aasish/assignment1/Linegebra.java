package com.aasish.assignment1;

public class Linegebra implements Gradient, Equation, Distance {

	@Override
	public long distance(long... operands) {
		System.out.println(operands[0]+" " + operands[1] +" " +operands[2]+ " "+operands[3]);
		return (long) Math.sqrt(Math.pow((operands[2]-operands[0]), 2)+ Math.pow((operands[3]-operands[1]), 2));
        }


	@Override
	public long gradient(long... operands) {
		return((operands[3]-operands[1])/(operands[2]-operands[0]));
	}
	
	@Override
	public String equation(long... operands) {
		long x1 = operands[0];
		long y1 = operands[1];
		long x2 = operands[2];
		long y2 = operands[3];
		if(x1==0 && x2==0 && y1 ==0 && y2 ==0) {
			return null;
		}
		else {
		
		String lineequation = (y2-y1)+"x - " + (x2-x1)+"y = " + (x1*y2 - x2*y1);
		return lineequation;	
		}
	}

}
