import java.lang.Math;

//Calc class
public class Calc{
	private double x;
	private double y;

	//default constructor
	Calc(){
		this.x=0;
		this.y=0;
	}

	//constructor with parameters
	Calc(double x, double y){
		this.x=x;
		this.y=y;
	}
	//getters and setters
	public void setX(double x){
		this.x=x;
	}

	public void setY(double y){
		this.y=y;
	}

	public double getX(){
		return this.x;
	}

	public double getY(){
		return this.y;
	}

	//to print
	public void print(){
		System.out.println("("+this.x+","+this.y+")");
	}

	//return as string
	public String toString(){
		return "("+this.x+","+this.y+")";
	}

	//to return a string of eq
	public String eLine(Calc c){
		double s=this.y-slope(c)*this.x;
		return "y= "+slope(c)+"x + "+s;
	}

	//to check if origin
	public boolean isOrigin(){
		if(this.x==0 && this.y==0){
			return true;
		}
		else{
			return false;
		}
	}

	//to know which quadrant
	public int knowQuadrant(){
		if(this.x>0 && this.y>0){
			return 1;
		}
		else if(this.x<0 && this.y>0){
			return 2;
		}
		else if(this.x<0 && this.y<0){
			return 3;
		}
		else if(this.x>0 && this.y>0){
			return 4;
		}
		else{
			return 0;
		}
	}

	//returns x-Projection
	public Calc xProjection(){
		Calc p;
		p=new Calc(this.x,0);
		return p;
	}

	//returns y-Projecetion
	public Calc yProjection(){
		Calc p;
		p=new Calc(0,this.y);
		return p;
	}

	//returns x-Refelction
	public Calc xRef(){
		Calc p;
		p=new Calc(this.x,-this.y);
		return p;
	}

	//returns y-Reflection
	public Calc yRef(){
		Calc p;
		p=new Calc(-this.x,this.y);
		return p;
	}

	//returns scalar multiple
	public Calc scalarMultiple(double s){
		Calc p;
		p=new Calc(s*this.x,s*this.y);
		return p;
	}

	//returns sum
	public Calc sum(Calc c){
		Calc s;
		s=new Calc(this.x+c.x,this.y+c.y);
		return s;
	}

	//returns slope
	public double slope(Calc c){
		return (double)(this.y-c.y)/(this.x-c.x);
	}

	//returns manhattan distance
	public double distanceM(Calc c){
		return absolute(this.x-c.x)+absolute(this.y-c.y);
	}

	//returns euclidian distance
	public double distanceE(Calc c){
		return Math.sqrt(Math.pow(this.x-c.x,2)+Math.pow(this.y-c.y,2));
	}

	//returns the absolute value
	private static double absolute(double s){
		if(s<0){
			return s*(-1);
		}
		else{
			return s;
		}
	}
}
