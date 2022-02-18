package linelengthcompare;

public class comparelinelengthuc3 {

	public static void main(String args[])
	{
		int x1,x2,y1,y2;
		x1 = (int)(Math.floor(Math.random() *10));
		x2 = (int)(Math.floor(Math.random() *10));
		y1 = (int)(Math.floor(Math.random() *10));
		y2 = (int)(Math.floor(Math.random() *10));
		x1 = 2;
		x2 = 5;
		y1 = 4;
		y2 = 6;
		float length1 =(float) (Math.sqrt((x2-x1)^2+(y2-y1)^2));
		System.out.println("Length of the line with points ("+x1+","+x2+") ,("+y1+","+y2+") is "+length1);
		int x3,x4,y3,y4;
//		x3 = 2;
//		x4 = 5;
//		y3 = 4;
//		y4 = 6;
		x3 = (int)(Math.floor(Math.random() *10));
		x4 = (int)(Math.floor(Math.random() *10));
		y3 = (int)(Math.floor(Math.random() *10));
		y4 = (int)(Math.floor(Math.random() *10));
		float length2 =(float) (Math.sqrt((x4-x3)^2+(y4-y3)^2));
		System.out.println("Length of the line with points ("+x3+","+x4+") ,("+y3+","+y3+") is "+length2);
	
		if(x1==x3 && y1==y3 && x2==x4 && y2==y4)
		{
			System.out.println("Two lines are of equal length");
		}
		else 
		{
			if(length1>length2)
			{
				System.out.println("Two lines are not of equal length and line1 is larger than line2");
			}
			else
			{
				System.out.println("Two lines are not of equal length and line1 is smaller than line2");
			}
}
}
}
