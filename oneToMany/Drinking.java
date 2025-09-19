class Drinking{
public String waterTypeName;
public int waterPrice;
public Water water;
public Drinking(String waterTypeName,int waterPrice,Water water){
this.waterTypeName=waterTypeName;
this.waterPrice=waterPrice;
this.water=water;
}
public void displayDrinkingDetails(){
System.out.println("water differnt type of name="+waterTypeName);
System.out.println("water differnt palace is differnt price="+waterPrice);
System.out.println(water.litOfWater);
System.out.println(water.isFilterWater);
}
}