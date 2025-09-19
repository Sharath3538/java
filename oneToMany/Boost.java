class Boost{
public float sweetPer;
public int price;
public Sugar sugar;
public Boost(float sweetPer,int price,Sugar sugar){
this.sweetPer=sweetPer;
this.price=price;
this.sugar=sugar;
}
public void displayBoostDetails(){
System.out.println("boost total sweet Percentage="+sweetPer);
System.out.println("boost expected price is="+price);
System.out.println(sugar.sugarName);
System.out.println(sugar.isSweet);
}
}