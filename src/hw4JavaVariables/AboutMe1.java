package hw4JavaVariables;

public class AboutMe1 {
	
   	// variables declared
		public String name;
		public byte Age = 24;
		public short myAprtmentRent = 1234;
		public int myYearlySalay = 2022;
		public long myBankBalance =20202020201210l;
		public float myHeight = 5.6f;
		public double myGrade = 0.121;
		public char sex = 'M';
		public boolean usCitizen = true;
		
		// constructor declared
		public AboutMe1 () {
			System.out.println("\n This is about Me \n");
			
		}
		//method implemented
		//public is access modifier, void is type of method,
		//aboutMe is the method
		public void aboutMe1() {
			System.out.println("My Name:" + name + "\n My Age:" + Age  + "\n myAprtmentRent: "+myAprtmentRent + "\n myYearlySalay:"+ myYearlySalay
		                           + " \n myBankBalance:" +myBankBalance + "\n myHeight:" + myHeight + "\n myGrade:"+myGrade + "\n sex:"+sex + "\n usCitizen:"+usCitizen );
			
		}
		   


}
