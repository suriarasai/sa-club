package club;



public class ClubApplication {

	public static void main(String args[]) {

		Person member1, member2, member3;
		Facility fac1, fac2, fac3;

		member1 = new Person("Edison", "Thomas", "Alva");
		member2 = new Person("Baggio", "Roberto", null);
		member3 = new Person("Webber", "Andrew", "Lloyd");

		fac1 = new Facility("Main Hall", null);
		fac2 = new Facility("Room1", "Conference Room on Level 2");
		fac3 = new Facility("Room2", "Meeting Room on Level 3");

		System.out.println("Members:");
		member1.toString();
		member2.toString();
		member3.toString();
		System.out.println("\nFacilities:");
		fac1.toString();
		fac2.toString();
		fac3.toString();
	}

}



class Person {

	public String surname;
	public String firstName;
	public String secondName;

	public Person(String surname, String firstName, String secondName) {
		this.surname = surname;
		this.firstName = firstName;
		this.secondName = secondName;
	}
}
