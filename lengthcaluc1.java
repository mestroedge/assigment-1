package linelengthcompare;
public class lengthcaluc1 {
	public static void main(String args[])
	{
		int x1,x2,y1,y2;
		x1 = (int)(Math.floor(Math.random() *10));
		x2 = (int)(Math.floor(Math.random() *10));
		y1 = (int)(Math.floor(Math.random() *10));
		y2 = (int)(Math.floor(Math.random() *10));
		float length =(float) (Math.sqrt((x2-x1)^2+(y2-y1)^2));
		System.out.println("Length of the line with points ("+x1+","+x2+") ,("+y1+","+y2+") is "+length);
	}
}
