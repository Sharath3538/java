class WaterUsageRunner{
public static void main(String [] args){
Water water=new Water(10,true);
Drinking drinking=new Drinking("Bisleri",25,water);
Cooking cooking=new Cooking("Sharath",20000,water);
Bathing bathing=new Bathing("Santoor",39.50f,water);
water.displayWaterDetail();
drinking.displayDrinkingDetails();
cooking.displayCookingDetails();
bathing.displayBathingDetails();
}
}