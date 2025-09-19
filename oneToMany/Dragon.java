class Dragon{
public boolean isTaste;
public float sweetPer;
public Fructose fructose;
public Dragon(boolean isTaste,float sweetPer,Fructose fructose){
this.isTaste=isTaste;
this.sweetPer=sweetPer;
this.fructose=fructose;
}
public void displayDragonDetails(){
System.out.println("it is a realiy taste is there="+isTaste);
System.out.println("total sweet Percentage is="+sweetPer);
System.out.println(fructose.anotherName);
System.out.println(fructose.isReailyTaste);
}
}