class Cooking{
public String cookChefName;
public int chefSalary;
public Water water;
public Cooking(String cookChefName,int chefSalary,Water water){
this.cookChefName=cookChefName;
this.chefSalary=chefSalary;
this.water=water;
}
public void displayCookingDetails(){
System.out.println("chef name of the cook="+cookChefName);
System.out.println("chef total salary of cook="+chefSalary);
System.out.println(water.litOfWater);
System.out.println(water.isFilterWater);
} 
}