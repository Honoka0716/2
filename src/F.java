
public class F {
	private double G,F1,F2,r;
	public F(double x,double y,double z,double i) {
		G=x;F1=y; F2=z; r=i;
		
	}
	void print() {
		System.out.println(G*(F1*F2)/(r*r));
	}
    public static void main(String[] args) {
    	F f1 = new F(1.67,2.23,3.12,4.22);
    	f1.print();
    }
}