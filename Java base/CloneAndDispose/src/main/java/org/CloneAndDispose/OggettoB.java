package org.CloneAndDispose;
public class OggettoB extends OggettoA {

	private OggettoX oggX=new OggettoX(3);
	
	public OggettoB(int x) {
		super(x);
	}
	
	public OggettoB clone() throws CloneNotSupportedException {
		OggettoB clonato=(OggettoB) super.clone();
		clonato.oggX=this.oggX.clone();
		return clonato;
	}

	public OggettoX getOggX() {
		return oggX;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((oggX == null) ? 0 : oggX.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		OggettoB other = (OggettoB) obj;
		if (oggX == null) {
			if (other.oggX != null)
				return false;
		} else if (!oggX.equals(other.oggX))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "OggettoB [oggX=" + oggX + "]";
	}
	
}