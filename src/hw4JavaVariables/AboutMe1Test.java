package hw4JavaVariables;

public class AboutMe1Test {

	public static void main(String[] args) {
		AboutMe1 jakaria = new AboutMe1 (); //Constructor is Initialized
		
		jakaria.name = "Abu Jakaria"; // variable initialized 
		jakaria.Age = 24;
		jakaria.myAprtmentRent = 1234;
		jakaria.myYearlySalay = 2022;
		jakaria.myBankBalance =20202020201210l;
		jakaria.myHeight = 5.6f;
		jakaria.myGrade = 0.121;
		jakaria.sex = 'M';
		jakaria.usCitizen = true;
		jakaria.aboutMe1(); //method initialized
		
		
		//About my friend Alex 
		AboutMe1 Alex = new AboutMe1 ();
		Alex.name = "Alex M";
		Alex.Age = 20;
		Alex.myAprtmentRent = 555;
		Alex.myYearlySalay = 111;
		Alex.myBankBalance =20202020201210l;
		Alex.myHeight = 5.6f;
		Alex.myGrade = 0.141;
		Alex.sex = 'M';
		Alex.usCitizen = true;
		Alex.aboutMe1();
					


	}

}
