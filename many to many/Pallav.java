class Pallav{
public String pallavName;
public int usingThing;
public Oil oil;
public Tamotoes tamotoes;
public Batani batani;
public Pallav(String pallavName,int usingThing,Oil oil,Tamotoes tamotoes,Batani batani){
	this.pallavName=pallavName;
	this.usingThing=usingThing;
	this.oil=oil;
	this.tamotoes=tamotoes;
	this.batani=batani;
}
public void displayPallavDetails(){
System.out.println("pallav name is="+pallavName);
System.out.println("pallav using thing are="+usingThing);
System.out.println("total oil percentage is="+oil.usingPerc);
System.out.println("pallav used no of liter oil is="+oil.noOfLiter);
System.out.println("pallav used no of tamotoes is="+tamotoes.noOfUsing);
System.out.println("tamotoes is frying is taste is spicy="+tamotoes.isTaste);
System.out.println("another type batani name is="+batani.bataniName);
System.out.println("pallav total batani used percentage is="+batani.usingPer);
}
}