class Mango{
public String anotherName;
public int fruitPrice;
public Fructose fructose;
public Mango(String anotherName,int fruitPrice,Fructose fructose){
	this.anotherName=anotherName;
	this.fruitPrice=fruitPrice;
	this.fructose=fructose;
}
public void MangoDetails(){
	System.out.println("another Name of the mango="+anotherName);
	System.out.println("mango fruits very costly some seasons are="+fruitPrice);
	System.out.println(fructose.anotherName);
    System.out.println(fructose.isReailyTaste);
}
}