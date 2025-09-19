class Pizza{
public String pizzaName;
public int price;
public Maggi maggi;
public Pizza(String pizzaName,int price,Maggi maggi){
this.pizzaName=pizzaName;
this.price=price;
this.maggi=maggi;
}
public void displayPizzaDetails(){
System.out.println("pizza so many types of Name="+pizzaName);
System.out.println("pizza compare onsside price to anotherside="+price);
System.out.println(maggi.maggiName);
System.out.println(maggi.isTastey);
}
}