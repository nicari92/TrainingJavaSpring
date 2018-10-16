public class OggettoX implements Cloneable{
	private int x;
	
	public OggettoX(int i) {
		this.x=i;
	}

	public OggettoX clone() throws CloneNotSupportedException {
		return (OggettoX) super.clone();
	}

	public int getX() {
		return x;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
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
		OggettoX other = (OggettoX) obj;
		if (x != other.x)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "OggettoX [x=" + x + "]";
	}

	public void setX(int y) {
		this.x=y;
	}
	
}
