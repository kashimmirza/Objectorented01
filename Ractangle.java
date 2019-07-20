
public class Ractangle {
	private int h;
	 private int w;
	public Ractangle() {
		h=-1;
		w=-2;
		
		
		
	}
	public Ractangle(int l, int p) {
		h=l;
		w=p;
		
		
	}
	public void seth(int l) {
		h=l;
		
		
	}
	public void setw(int p) {
		
		
		w=p;
	}
	public  double getarea() {
		
		
	return h*w;
	}
	public static void main(String[]arg) {
		Ractangle t=  new Ractangle(5, 6);
		System.out.println(t.getarea());
		t.seth(20);
		t.setw(40);
		System.out.println(t.getarea());
		
		
		
	}

}
