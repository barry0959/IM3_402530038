class Rectangle
{
	double x,y,Height,Width;
	
	Rectangle()
	{
	}
	
	Rectangle(double  _x ,double  _y ,double  _Height , double  _Width)
	{
		this.x = _x ;
		this.y = _y;
		this.Height = _Height;
		this.Width = _Width;	
	}

	double getWidth()
    {
	    return this.Width;
    }

	double getHeight()
    {
	    return this.Height;
    }
    
    public String toString()
    {
    	return "java.Retangle[x=" + this.x + ",y=" + this.y + ",width=" + this.Width + ",height" + this.Height +"]" ;  
    } 
}

public class RectangleTester 
{
	public static void main(String[] args)
	{
		
		Rectangle a1 = new Rectangle(15,25,18,57);
		Rectangle a2 = new Rectangle(0,12,47,60);
		
		System.out.println(a1.toString());
		System.out.println("area="+a1.getWidth()*a1.getHeight());
		System.out.println("Perimeter="+(a1.getWidth()+a1.getHeight())*2+"\r\n");
		System.out.println(a2.toString());
		System.out.println("area="+a2.getWidth()*a2.getHeight());
		System.out.println("Perimeter="+(a2.getWidth()+a2.getHeight())*2 +"\r\n");
		System.out.println("End of Output!");
			
	}	
}
