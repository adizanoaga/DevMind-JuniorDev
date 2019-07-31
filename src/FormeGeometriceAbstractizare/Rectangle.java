package FormeGeometriceAbstractizare;

public class Rectangle extends Shape{
	int base;
	int height;
	public Rectangle(int base, int height){
		this.base=base;
		this.height=height;
	}
	public Rectangle(int base, int height, String text, String material){
		super(text, material);
		this.base=base;
		this.height=height;
	}
	public void displayRectangleHeight(){
		System.out.println("Rectangle height is: "+height);
	}
	public double getSize(){
		return base*height;
	}
	public String toString(){
		return "Rectangle: height is "+this.height+", width is: "+this.height+", made of "+super.material+", contains the text:"+super.text+".";
	}
	public boolean equals(Object obj){
		if(this==obj)
			return true;
		if(obj==null)
			return false;
		if(this.getClass()!=obj.getClass())
			return false;
		Rectangle other=(Rectangle) obj;
		if(super.equals(other)&&this.height==other.height&&this.base==other.base)
			return true;
		return false;
	}
	public int hashCode(){
		int prime=31;
		int result=super.hashCode();
		result=prime*result+base;
		result=prime*result+height;
		return result;	
	}
}
