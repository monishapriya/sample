package packde;

public class Rectangle extends AbstractDemo {
	int length,breadth;
Rectangle(){
	
}
Rectangle(int l,int b){
	length=l;
	breadth=b;



	super.display();
	System.out.println("length is: "+length);
	System.out.println("breadth is: "+breadth);
}
void area(){
	System.out.println("area of rect is: "+length*breadth);
}
void perimeter(){
	System.out.println("perimeterof rect is: "+(2*(length*breadth)));
}

}
