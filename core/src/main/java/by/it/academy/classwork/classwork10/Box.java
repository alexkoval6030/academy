package java.by.it.academy.classwork.classwork10;

import java.util.ArrayList;

public class Box {
	Box [] box = new Box[3];
//	ArrayList<Integer> obj = new ArrayList<>(box);

	class HeavyBox{
		int weight;
		int width;
		int heigth;
		int depth;
		
		HeavyBox(int w, int h, int d, int m){
			width = w;
			heigth = h;
			depth = d;
			weight = m;
		}
	}

}
