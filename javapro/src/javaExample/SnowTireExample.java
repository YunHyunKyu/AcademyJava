package javaExample;

public class SnowTireExample {

	public static void main(String[] args) {
		SnowTire st = new SnowTire();
		Tire t = st;
		
		t.run();
		st.run();

	}
}
