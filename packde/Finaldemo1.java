package packde;

public class Finaldemo1 {
	final double PI;
	public Finaldemo1(){
		PI=10;
	}}
	class FinalDemo2 extends Finaldemo1{
		void calCircleArea(double radious){
			
			double area=PI*radious*radious;
			System.out.println(""+area);
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
FinalDemo2 fd=new FinalDemo2();
fd.calCircleArea(10);

	}

}
