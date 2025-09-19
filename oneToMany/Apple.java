class Apple{
public String juiceName;
public int juicePrice;
public Fructose fructose;
public Apple(String juiceName,int juicePrice,Fructose fructose){
this.juiceName=juiceName;
this.juicePrice=juicePrice;
this.fructose=fructose;
} 
public void displayAppleDetails(){
System.out.println("varity type apple name is juice="+juiceName);
System.out.println("differnet type of price is="+juicePrice);
System.out.println("hello")
System.out.println(fructose.anotherName);
System.out.println(fructose.isReailyTaste);
}
}