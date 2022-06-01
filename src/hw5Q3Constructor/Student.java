package hw5Q3Constructor;

public class Student {

	public String Name; // variables declared
	public int Id;
	public char Sex;
	public boolean fullTimeStudent;

	public Student() {
		System.out.println("I am Student");

	}

	public Student(String Name, int Id, char Sex, boolean fulltimeStudent) {
		this.Name = Name;
		this.Id = Id;
		this.Sex = Sex;
		this.fullTimeStudent = fullTimeStudent;
		System.out.println("my Namae is: " + Name + "\nMy Id Number: " + Id + "\nI am: " + Sex
				+ " \nI'm full time student: " + fullTimeStudent);

	}

}
