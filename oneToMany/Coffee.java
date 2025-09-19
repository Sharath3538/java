class Coffee{
public String name;
public int cost;
public Sugar sugar;
public Coffee(String name,int cost,Sugar sugar ){
this.name=name;
this.cost=cost;
this.sugar=sugar;
}
public void displayCoffeeDetails(){
System.out.println(name+cost);
System.out.println(sugar.sugarName);
System.out.println(sugar.isSweet);
}
}