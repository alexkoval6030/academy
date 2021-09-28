package java.by.it.academy.classwork.lesson11_07_21;

public class Bit {

	public static void main(String[] args) {
		int a = 32;
		int b = 12345675;
		int c = 87512436;
		int d = 5444693;
		int e = 245932;
		int f = 689457;
		int g = 15;
		int h = 31;
		a = a & g;
		a &= g;
		System.out.println(a & g);
		System.out.println(b & g);
		System.out.println(c & g);
		System.out.println(d & g);
		System.out.println(e & g);
		System.out.println(f & g);
		System.out.println(a & h);
		System.out.println(b & h);
		System.out.println(c & h);
		System.out.println(d & h);
		System.out.println(e & h);
		System.out.println(f & h);
		
		}

}
