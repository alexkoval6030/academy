package by.classwork.lesson9;

public class ClassworkDemo <T, V, K> {
	private T variableT;
	private V variableV;
	private K variableK;
	
	public ClassworkDemo(T variableT, V variableV, K variableK) {
		this.variableT = variableT;
		this.variableV = variableV;
		this.variableK = variableK;
	}

	public T getVariableT() {
		return variableT;
	}

	public void setVariableT(T variableT) {
		this.variableT = variableT;
	}

	public V getVariableV() {
		return variableV;
	}

	public void setVariableV(V variableV) {
		this.variableV = variableV;
	}

	public K getVariableK() {
		return variableK;
	}

	public void setVariableK(K variableK) {
		this.variableK = variableK;
	}
	
	public String getTName() {
		if(variableT == null) {
			return null;
		}
		return variableT.getClass().getName();
	}
	
	public String getVName() {
		if(variableV == null) {
			return null;
		}
		return variableV.getClass().getName();
	}
	
	public String getKName() {
		if(variableK == null) {
			return null;
		}
		return variableK.getClass().getName();
	}
	
	

}
