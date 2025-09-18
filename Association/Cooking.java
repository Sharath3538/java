class Cooking{
public String cookingName;
public int salary;
public Cooker advertishing;
public Cooking(String cookingName,int salary,Cooker advertishing){
this.cookingName=cookingName;
this.salary=salary;
this.advertishing=advertishing;
}
public void displayCookingDetails(){
System.out.println(cookingName+salary);
System.out.println(advertishing.ticket);
System.out.println(advertishing.cookerName);
}
}