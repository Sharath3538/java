class Kabab{
public String kababName;
public float kababQuality;
public Oil oil;
public Ingridents ingridents;
public Egg egg;
public Kabab(String kababName,float kababQuality,Oil oil,Ingridents ingridents,Egg egg){
this.kababName=kababName;
this.kababQuality=kababQuality;
this.oil=oil;
this.ingridents=ingridents;
this.egg=egg;
}
public void displayKababDetails(){
System.out.println("kabab name is="+kababName);
System.out.println("this is kabab quality is="+kababQuality);
System.out.println("oil name is="+oil.oilName);
System.out.println("total oil quality is="+oil.oilQuality);
System.out.println("ingridents using percentage is="+ingridents.usingPer);
System.out.println("number types used ingridents in="+ingridents.notypeofIngridents);
System.out.println("egg price is="+egg.eggPrice);
System.out.println("kabab is used is taste is chruny is there="+egg.eggQuality);
}
}