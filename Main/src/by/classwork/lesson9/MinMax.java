package by.classwork.lesson9;

public class MinMax<T extends Number> {
	T[] items;
	
	public MinMax(T[] items) {
		super();
		this.items = items;
	}

	public T[] getItems() {
		return items;
	}

	public void setItems(T[] items) {
		this.items = items;
	}
	
	public T min() {
		if(items.length == 0) {
			return null;
		}
		
		T min = null;
		for(T n : items) {
			if(min.doubleValue() > n.doubleValue()) {
				min = n;
				
			}
		}
		return min;
	}
	
	public T max() {
		if(items.length == 0) {
			return null;
		}
		
		T max = null;
		for(T n : items) {
			if(max.doubleValue() < n.doubleValue()) {
				max = n;
				
			}
		}
		return max;
	}

}
