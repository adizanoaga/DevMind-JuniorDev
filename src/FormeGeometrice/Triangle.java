package FormeGeometrice;

public class Triangle extends Shape{
	int base;
	int height;
	
	public Triangle(int base, int height){
		this.base=base;
		this.height=height;
	}
	public Triangle(int base, int height, String text, String material){
		super(text, material);
		this.base=base;
		this.height=height;	
	}
	public void displayTriangleHeight(){
		System.out.println("Triangle height is: "+this.height);
	}
	public double getSize(){
		return (base*height)/2;
	}
	public String toString(){
		return 	"Triangle: height is "+this.height+", base is: "+this.base+" , made of "+super.material+", contains the text: \""+super.text+"\"";
	}
	public boolean equals(Object obj){
		if(this==obj)
			return true;
		if(obj==null)
			return false;
		if(this.getClass()!=obj.getClass())
			return false;
		Triangle other=(Triangle) obj;
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
