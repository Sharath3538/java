class HouseRentRunner{
public static void main(String [] args){
House house=new House("Samuridhi",3500);
Safety safety=new Safety(6.5f,false,house);
Kitchen kitchen=new Kitchen(3.1f,true,house);
Bedrooms bedrooms=new Bedrooms(6,true,house);
GeneralCondition generalCondition=new GeneralCondition(5,8.1f,house);
house.displayHousedetails();
safety.displaySafetydetails();
kitchen.displayKitchendetails();
bedrooms.displayBedRoomsdetails();
generalCondition.GeneralConditiondetails();
}
}