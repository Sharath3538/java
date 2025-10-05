class Briyani{
public String briyaniName;
public int briyaniPrice;
public Oil oil;
public Ingridents ingridents;
public Egg egg;
public Briyani(String briyaniName,int briyaniPrice,Oil oil,Ingridents ingridents,Egg egg){
this.briyaniName=briyaniName;
this.briyaniPrice=briyaniPrice;
this.oil=oil;
this.ingridents=ingridents;
this.egg=egg;
}
public void displayBriyaniDetails(){
System.out.println("briyani name is="+briyaniName);
System.out.println("briyani price is="+briyaniPrice);
System.out.println("oil name is="+oil.oilName);
System.out.println("total oil quality is="+oil.oilQuality);
System.out.println("ingridents using percentage is="+ingridents.usingPer);
System.out.println("number types used ingridents in="+ingridents.notypeofIngridents);
System.out.println("egg price is="+egg.eggPrice);
System.out.println("briyani is used in taste is chruny is there="+egg.eggQuality);
}
}