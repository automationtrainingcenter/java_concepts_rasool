package polymorphism;

public class RTPolyChild extends RTPolyParent {

	@Override
	public void add(String a, String b) {
		if(a.matches("\\d+") && b.matches("\\d+")) {
			int ia = Integer.parseInt(a);
			int ib = Integer.parseInt(b);
			System.out.println(ia+ib);
		}else {
			super.add(a, b);
		}
		
	}
	
	public void sub(int a, int b) {
		System.err.println(a-b);
	}

}
