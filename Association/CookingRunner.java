class CookingRunner{
public static void main(String [] args){
Cooker cooker=new Cooker(2500,"CookMob");
Cooking cooking=new Cooking("FiredUp",15000,cooker);
cooking.displayCookingDetails();
}
}