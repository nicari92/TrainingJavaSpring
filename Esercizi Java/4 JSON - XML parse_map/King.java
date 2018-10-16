public class King {
	private String name;
	private String city;
	private String house;
	private int startYear;
	private int endYear;
	
	public King(Object nm, Object cty, Object hse, Object yrs) {
		name=nm.toString();
		city=cty.toString();
		house=hse.toString();
		
		String[] yearsString = yrs.toString().split("-");
		this.startYear = Integer.parseInt(yearsString[0]);
		if (yearsString.length<1) {
			this.endYear = Integer.parseInt(yearsString[1]);
		} else {
			this.endYear=this.startYear;
		}
	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}

	public String getHouse() {
		return house;
	}

	public int getStartYear() {
		return startYear;
	}

	public int getEndYear() {
		return endYear;
	}
	
	
}
