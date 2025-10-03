class ChatsRunner{
public static void main(String [] args){
Cheese cheese=new Cheese("Cheddar",55);
Onion onion=new Onion(6,4.1f);
Tomato tomato=new Tomato(7.1f,50);
Pizza pizza=new Pizza("onionPizza",160,tomato,onion,cheese);
Burger burger=new Burger("ChickenBurger",69,tomato,onion,cheese);
Pasta pasta=new Pasta("Fussi",true,tomato,onion,cheese);
pizza.displayPizzaDetails();
burger.displayBurgerDetails();
pasta.displayPastaDetails();
}
}