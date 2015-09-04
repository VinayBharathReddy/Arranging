class Order {
	private String name;
	private double gpa;
	private String dob;
	private int mathematics;
	private int science;
	private int english;
	private int social;
	private int firstlang;
	private int hallTckt;

	Order(String name, double gpa, String birth, int maths , int sci, int eng,int soc, int fl, int ht) {
		this.name = name;
		this.gpa = gpa;
		dob = birth;
		mathematics = maths;
		science = sci;
		english = eng;
		social = soc;
		firstlang = fl;
		hallTckt = ht;
	}

	public String getName() {
		return name;
	}

	public double getGPA() {
		return gpa;
	}

	public String getDOB() {
		return dob;
	}

	public int getMaths() {
		return mathematics;
	}

	public int getSci() {
		return science;
	}

	public int getEng() {
		return english;
	}

	public int getSoc() {
		return social;
	}

	public int getLang() {
		return firstlang;
	}

	public int getHNo() {
		return hallTckt;
	}

	public String toString() {
		return ("Name:" + name + "\tGPA:" + gpa + "|Mat:" + mathematics
		 + "|Sci:" + science + "|Eng:" + english + "|Soc:" + social
		  + "|FLng:" + firstlang + "|DOB:" + dob + "|HT:" + hallTckt);
	}
}