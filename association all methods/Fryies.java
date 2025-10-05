class Fryies{
public String fryName;
public boolean fryTaste;
public Oil oil;
public Ingridents ingridents;
public Egg egg;
public Fryies(String fryName,boolean fryTaste,Oil oil,Ingridents ingridents,Egg egg){
this.fryName=fryName;
this.fryTaste=fryTaste;
this.oil=oil;
this.ingridents=ingridents;
this.egg=egg;
}
public void displayFryiesDetails(){
System.out.println("fry name is="+fryName);
System.out.println("fry taste is="+fryTaste);
System.out.println("oil name is="+oil.oilName);
System.out.println("total oil quality is="+oil.oilQuality);
System.out.println("ingridents using percentage is="+ingridents.usingPer);
System.out.println("number types used ingridents in="+ingridents.notypeofIngridents);
System.out.println("egg price is="+egg.eggPrice);
System.out.println("fry is used is taste is chruny is there="+egg.eggQuality);
}
}