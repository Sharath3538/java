class Orange{
public float sweetPer;
public int juicePrice;
public Fructose fructose;
public Orange(float sweetPer,int juicePrice,Fructose fructose){
this.sweetPer=sweetPer;
this.juicePrice=juicePrice;
this.fructose=fructose;
}
public void displayOrangeDetails(){
System.out.println("it is very high sweet Percentage is="+sweetPer);
System.out.println("price of the orange is="+juicePrice);
System.out.println(fructose.anotherName);
System.out.println(fructose.isReailyTaste);
}
}