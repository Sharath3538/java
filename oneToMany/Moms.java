class Moms{
public float momsHeating;
public String momsName;
public Maggi maggi;
public Moms(float momsHeating,String momsName,Maggi maggi){
this.momsHeating=momsHeating;
this.momsName=momsName;
this.maggi=maggi;
}
public void displayMomsDetails(){
System.out.println("moms Heating very high temperature="+momsHeating);
System.out.println("moms so many name is there="+momsName);
System.out.println(maggi.maggiName);
System.out.println(maggi.isTastey);
}
 }