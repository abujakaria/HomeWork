package hw5Q2Constructor;

public class Computer {
	public String compBrand;
	public int compModel;
	public char compOperatingsystem;
	public boolean compMadeInUSA;
	
    public Computer() {
    	System.out.println("My computer info!");
    	
    		}
    
    public Computer(String compBrand,int compModel, char compOperatingsystem, boolean compMadeInUSA) {
    	this.compBrand = compBrand;
    	this.compModel = compModel;
    	this.compOperatingsystem = compOperatingsystem;
    	this.compMadeInUSA = compMadeInUSA;
    	System.out.println("This is my computer name is:"+ compBrand + "Model is" + compBrand +
    			"Operating system" + compOperatingsystem + "Made In USA" + compMadeInUSA  );
    }

    public void computer(String compBrand,int compModel, char compOperatingsystem , boolean compMadeInUSA) {
    	this.compBrand = compBrand;
      	this.compModel = compModel;
      	this.compOperatingsystem = compOperatingsystem;
      	this.compMadeInUSA = compMadeInUSA;
      	System.out.println("This is my computer name is: "+ compBrand + " \n Model is: " + compBrand +
    			" \nMy computer Operating system: " + compOperatingsystem + "\nMade In USA: " + compMadeInUSA  );
      	
     }
    
    }
	


