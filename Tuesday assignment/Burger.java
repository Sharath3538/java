class Burger{
public String burgerName;
public int burgerPrice;
public Tomato tamato;
public Onion onion;
public Cheese cheese;
public Burger(String burgerName,int burgerPrice,Tomato tamato,Onion onion,Cheese cheese){
this.burgerName=burgerName;
this.burgerPrice=burgerPrice;
this.tamato=tamato;
this.onion=onion;
this.cheese=cheese;
}
public void displayBurgerDetails(){
System.out.println("name of the Burger is="+burgerName);
System.out.println("Burger price is="+burgerPrice);
System.out.println("Burger used in cheese name is="+cheese.cheeseName);
System.out.println("Burger used in cheese price is="+cheese.cheesePrice);
System.out.println("Burger is ready to number of onion is="+onion.noOfOnions);
System.out.println("Burger is used in onion percentage is="+onion.usingPer);
System.out.println("Burger using percentage is="+tamato.usingPer);
System.out.println("Burgerused in tamato price is="+tamato.tomatoPrice);
}
}