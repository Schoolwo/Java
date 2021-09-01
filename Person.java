
public class Person implements Comparable<Person> {
		String fName;
		String lName;
		String phoneNum;
		
		
		public Person(String fName, String lName, String phoneNum) {
			super();
			this.fName = fName;
			this.lName = lName;
			this.phoneNum = phoneNum;
		}

		
		public String getfName() {
			return fName;
		}

		
		public void setfName(String fName) {
			this.fName = fName;
		}
	
		
		public String getlName() {
			return lName;
		}

		
		public void setlName(String lName) {
			this.lName = lName;
		}

		
		public String getPhoneNum() {
			return phoneNum;
		}

		
		public void setPhoneNum(String phoneNum) {
			this.phoneNum = phoneNum;
		}

		
		@Override
		public String toString() {
			return "Person [fName=" + fName + ", lName=" + lName + ", phoneNum=" + phoneNum + "]";
		}


		@Override
		public int compareTo(Person o) {
			if (this.lName.compareTo(o.lName) > 0)
				return 1;
			else if (this.lName.compareTo(o.lName) < 0)
				return -1;
			else 
				return 0;
			
		
		}
			
}
