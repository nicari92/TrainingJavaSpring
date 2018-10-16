package org.CloneAndDispose;
public class OggettoA implements Cloneable{
	private int a;
	
	public OggettoA(int x) {
		this.a=x;
	}
	
	public OggettoA clone() throws CloneNotSupportedException {
		return (OggettoA) super.clone();
	}

	public int getA() {
		return a;
	}
	
	protected void finalize() throws Throwable {
		  super.finalize();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OggettoA other = (OggettoA) obj;
		if (a != other.a)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "OggettoA [a=" + a + "]";
	}
	
}