class Pizza{
public String pizzaName;
public int pizzaCost;
public Tomato tamato;
public Onion onion;
public Cheese cheese;
public Pizza(String pizzaName,int pizzaCost,Tomato tamato,Onion onion,Cheese cheese){
this.pizzaName=pizzaName;
this.pizzaCost=pizzaCost;
this.tamato=tamato;
this.onion=onion;
this.cheese=cheese;
}
public void displayPizzaDetails(){
System.out.println("name of the pizza is="+pizzaName);
System.out.println("pizza cost is="+pizzaCost);
System.out.println("pizza used in cheese name is="+cheese.cheeseName);
System.out.println("pizza used in cheese price is="+cheese.cheesePrice);
System.out.println("pizza is ready to number of onion is="+onion.noOfOnions);
System.out.println("pizza is used in onion percentage is="+onion.usingPer);
System.out.println("pizza using percentage is="+tamato.usingPer);
System.out.println("pizza used in tamato price is="+tamato.tomatoPrice);

}
}