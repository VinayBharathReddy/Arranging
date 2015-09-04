import java.util.Comparator;

class Comparision implements Comparator<Order> {
	public int compare(Order stud1, Order stud2) {

 		if (stud1.getGPA() > stud2.getGPA()) {
			return (int)(stud1.getGPA() - stud2.getGPA());
		} else if (stud1.getGPA() == stud2.getGPA()) {
			if (stud1.getMaths() > stud2.getMaths()) {
			return stud1.getMaths() - stud2.getMaths();
			} else if(stud1.getMaths() == stud2.getMaths()) {
				if (stud1.getSci() > stud2.getSci()) {
				return stud1.getSci() - stud2.getSci();
				} else if (stud1.getSci() == stud2.getSci()) {
					if (stud1.getEng() > stud2.getEng()) {
					return stud1.getEng() - stud2.getEng();
					} else if (stud1.getEng() == stud2.getEng()) {
						if(stud1.getSoc() > stud2.getSoc()) {
							return stud1.getSoc() - stud2.getSoc();
						} else if (stud1.getSoc() == stud2.getSoc()) {
							if(stud1.getLang() > stud2.getLang()) {
								return stud1.getLang() - stud2.getLang();
							} else if (stud1.getLang() == stud2.getLang()) {
								if (stud1.getDOB().compareTo(stud2.getDOB()) < 0){
									return 1;
								} else if(stud1.getDOB().compareTo(stud2.getDOB()) > 0) {
									return -1;
								} else if (stud1.getDOB().equals(stud2.getDOB())) {
									if(stud1.getHNo() > stud1.getHNo()) {
										return stud1.getHNo() - stud2.getHNo();
									} else {
										return 0;
									}
								} else {
									return 0;
								}
							} else {
								return 0;
							}
						} else {
							return 0;
						}
					} else {
						return 0;
					} 
				} else {
					return 0;
				}
			} else {
				return 0;
			}
		} else {
			return 0;
		}
	}	
}
